package org.hubert.springboot.file.excel.easypoi.controller;


import lombok.extern.slf4j.Slf4j;
import org.hubert.springboot.file.excel.easypoi.entity.response.ResponseResult;
import org.hubert.springboot.file.excel.easypoi.service.ExcelService;
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
public class UserController {

    @Autowired
    private ExcelService excelService;

    @PostMapping("/upload")
    public ResponseResult<String> upload(@RequestParam(value = "file", required = true) MultipartFile file) {
        try {
            excelService.upload(file.getInputStream());
        } catch (Exception e) {
            log.error("upload error", e);
            return ResponseResult.fail(e.getMessage());
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
            log.error("download error", e);
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
