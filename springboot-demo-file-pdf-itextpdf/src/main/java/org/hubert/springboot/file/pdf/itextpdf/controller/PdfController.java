package org.hubert.springboot.file.pdf.itextpdf.controller;

import org.hubert.springboot.file.pdf.itextpdf.service.PdfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

/**
 * @author hubertwong
 */
@RestController
@RequestMapping("/pdf")
public class PdfController {

    @Autowired
    private PdfService pdfService;

    @GetMapping("/download")
    public void download(HttpServletResponse response) {
        try {

            response.reset();
            response.setContentType("application/pdf");
            response.setHeader("Content-disposition",
                    "attachment;filename=user_pdf_" + System.currentTimeMillis() + ".pdf");

            OutputStream os = response.getOutputStream();
            pdfService.generateItextPdfDocument(os);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}