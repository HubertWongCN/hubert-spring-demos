package org.hubert.springboot.file.word.poi.controller;


import lombok.extern.slf4j.Slf4j;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.hubert.springboot.file.word.poi.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

/**
 * @author hubertwong
 */
@Slf4j
@RestController
@RequestMapping("/word")
public class WordController {

    @Autowired
    private WordService wordService;

    @GetMapping("/download")
    public void download(HttpServletResponse response) {
        try {
            XWPFDocument document = wordService.generateWordXWPFDocument();
            response.reset();
            response.setContentType("application/octet-stream");
            response.setHeader("Content-disposition",
                    "attachment;filename=user_word_" + System.currentTimeMillis() + ".docx");
            OutputStream os = response.getOutputStream();
            document.write(os);
            os.close();
        } catch (Exception e) {
            log.error("download error", e);
        }
    }

}
