package org.hubert.springboot.file.excel.poi.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.hubert.springboot.file.excel.poi.entity.response.ResponseResult;
import org.hubert.springboot.file.excel.poi.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

/**
 * @author hubertwong
 */
@Slf4j
@RestController
@RequestMapping("/excel")
public class ExcelController {

    @Autowired
    private ExcelService excelService;

    @PostMapping("/upload")
    public ResponseResult<String> upload(@RequestParam(value = "file", required = true)MultipartFile file) {
        try {
            excelService.upload(file.getInputStream());
        } catch (Exception e) {
            log.error("upload file", e);
            return ResponseResult.fail(e.getLocalizedMessage());
        }
        return ResponseResult.success();
    }

    @GetMapping("/download")
    public void download(HttpServletResponse response) {
        try {
            SXSSFWorkbook workbook = excelService.generateExcelWorkbook();
            response.reset();
            response.setContentType("application/vnd.mx-excel");
            response.setHeader("Content-disposition",
                    "attachment;filename=user_excel_" + System.currentTimeMillis() + ".xlsx");
            ServletOutputStream os = response.getOutputStream();
            workbook.write(os);
            workbook.dispose();
        } catch (Exception e) {
            log.error("download error", e);
        }
    }
}
