package org.hubert.spring.boot.file.excel.easyexcel.controller;

import lombok.extern.slf4j.Slf4j;
import org.hubert.spring.boot.file.excel.easyexcel.entity.response.ResponseResult;
import org.hubert.spring.boot.file.excel.easyexcel.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
            response.reset();
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-disposition",
                    "attachment;filename=user_excel_" + System.currentTimeMillis() + ".xlsx");
            excelService.downloadExcel(response.getOutputStream());
        } catch (Exception e) {
            log.error("downland error", e);
        }
    }

    @GetMapping("/fill")
    public void fillTemplate(HttpServletResponse response) {
        try {
            response.reset();
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-disposition",
                    "attachment;filename=user_excel_template_" + System.currentTimeMillis() + ".xlsx");
            excelService.fillExcelTemplate(response.getOutputStream());
        } catch (Exception e) {
            log.error("fill error", e);
        }
    }
}
