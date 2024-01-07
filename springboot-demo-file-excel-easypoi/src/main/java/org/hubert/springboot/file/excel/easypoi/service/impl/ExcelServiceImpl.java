package org.hubert.springboot.file.excel.easypoi.service.impl;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.TemplateExportParams;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;
import org.hubert.springboot.file.excel.easypoi.entity.User;
import org.hubert.springboot.file.excel.easypoi.service.ExcelService;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.*;


/**
 * @author hubertwong
 */
@Slf4j
@Service
public class ExcelServiceImpl implements ExcelService {

    private static final int POSITION_ROW = 1;

    @Override
    public void upload(InputStream inputStream) throws Exception {
        ImportParams importParams = new ImportParams();
        List<User> userList = ExcelImportUtil.importExcel(inputStream, User.class, importParams);
        userList.stream().forEach(user -> log.info(user.toString()));
    }

    @Override
    public void downloadExcel(ServletOutputStream outputStream) throws IOException {
        ExportParams exportParams = new ExportParams();
        exportParams.setTitle("User Table");
        exportParams.setSheetName("User Sheet");
        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, User.class, getUserList());
        workbook.write(outputStream);
        workbook.close();
    }

    @Override
    public void fillExcelTemplate(ServletOutputStream outputStream) throws IOException {
        // 确保文件可访问，这个例子的excel模板，放在根目录下面
        String templateFileName = "/Users/hubertwong/Downloads/eaxypoi.xlsx";
        TemplateExportParams params = new TemplateExportParams(templateFileName);

        Map<String, Object> map = new HashMap<>();
        map.put("user", "hubert");
        map.put("date", LocalDateTime.now());
        map.put("userList", getUserList());
        Workbook workbook = ExcelExportUtil.exportExcel(params, map);
        workbook.write(outputStream);
        workbook.close();
    }

    private List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(User.builder()
                .id(1L).userName("hubert").email("hubert@hubert.org").phoneNumber(120493984)
                .description("hello world")
                .build());
        userList.add(User.builder()
                .id(2L).userName("hubert2").email("hubert2@hubert.org").phoneNumber(1098034)
                .description("hello world2")
                .build());
        return userList;
    }

}
