package org.hubert.springboot.file.word.poitl.service.impl;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.data.*;
import com.deepoove.poi.plugin.markdown.MarkdownRenderData;
import com.deepoove.poi.plugin.markdown.MarkdownRenderPolicy;
import com.deepoove.poi.plugin.markdown.MarkdownStyle;
import lombok.extern.slf4j.Slf4j;
import org.hubert.springboot.file.word.poitl.entity.User;
import org.hubert.springboot.file.word.poitl.service.WordService;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hubertwong
 */
@Slf4j
@Service
public class WordServiceImpl implements WordService {


    @Override
    public XWPFTemplate generateWordXWPFTemplate() throws IOException {
        Map<String, Object> content = new HashMap<>();
        content.put("title", "SpringBoot集成文件 - 集成POI-tl之基于模板的Word导出");
        content.put("author", "hubert");
        content.put("site", new HyperlinkTextRenderData("Hubert's Blog", "https://hubertwongcn.github.io/"));

        content.put("poiText", "Apache POI 是创建和维护操作各种符合Office Open XML（OOXML）标准和微软的OLE " +
                "2复合文档格式（OLE2）的Java API。用它可以使用Java读取和创建,修改MS Excel文件." +
                "而且,还可以使用Java读取和创建MS Word和MSPowerPoint文件。" +
                "更多请参考[官方文档](https://poi.apache.org/index.html)");

        content.put("poiText2", "生成xls和xlsx有什么区别？POI对Excel中的对象的封装对应关系？");
        content.put("poiList", Numberings.create("excel03只能打开xls格式，无法直接打开xlsx格式",
                "xls只有65536行、256列; xlsx可以有1048576行、16384列",
                "xls占用空间大, xlsx占用空间小，运算速度也会快一点"));

        RowRenderData headRow = Rows.of("ID", "Name", "Email", "TEL", "Description").textColor("FFFFFF")
                .bgColor("4472C4").center().create();
        TableRenderData table = Tables.create(headRow);
        getUserList()
                .forEach(a -> table.addRow(Rows.create(a.getId() + "", a.getUserName(), a.getEmail(), a.getPhoneNumber() + "", a.getDescription())));
        content.put("poiTable", table);

        Resource resource = new ClassPathResource("IMG_0050.JPG");
        content.put("poiImage", Pictures.ofStream(new FileInputStream(resource.getFile())).create());

        return XWPFTemplate.compile(new ClassPathResource("poi-tl-template.docx").getFile()).render(content);
    }

    @Override
    public XWPFTemplate generateWordXWPFTemplateMD() throws IOException {
        MarkdownRenderData code = new MarkdownRenderData();

        Resource resource = new ClassPathResource("test.md");
        code.setMarkdown(new String(Files.readAllBytes(resource.getFile().toPath())));
        code.setStyle(MarkdownStyle.newStyle());

        Map<String, Object> data = new HashMap<>();
        data.put("md", code);

        Configure config = Configure.builder().bind("md", new MarkdownRenderPolicy()).build();

        return XWPFTemplate.compile(new ClassPathResource("markdown_template.docx").getFile(), config).render(data);
    }

    private List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            userList.add(User.builder()
                    .id(Long.parseLong(i + "")).userName("hubert" + i).email("hubert@hubert.org" + i).phoneNumber(121231231231L)
                    .description("hello world" + i)
                    .build());
        }
        return userList;
    }

}
