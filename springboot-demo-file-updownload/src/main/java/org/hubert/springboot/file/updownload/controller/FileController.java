package org.hubert.springboot.file.updownload.controller;


import lombok.extern.slf4j.Slf4j;
import org.hubert.springboot.file.updownload.response.ResponseResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author hubert
 */
@Slf4j
@RestController
@RequestMapping("/file")
public class FileController {

    @PostMapping("/upload")
    public ResponseResult<String> upload(@RequestParam(value = "file", required = true) MultipartFile file) {
        try {
            // 本地文件保存位置
            String uploadPath = "/Users/hubertwong/uploadFile"; // 改这里
            File uploadDir = new File(uploadPath);
            if (!uploadDir.exists()) {
                uploadDir.mkdir();
            }
            log.info(uploadDir.getAbsolutePath());

            // 本地文件
            File localFile = new File(uploadPath + File.separator + file.getOriginalFilename());

            // transfer to local
            file.transferTo(localFile);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseResult.fail(e.getMessage());
        }
        return ResponseResult.success();
    }

    @GetMapping("/download")
    public void download(HttpServletResponse response) {
        response.reset();
        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition",
                "attachment;filename=file_" + System.currentTimeMillis() + ".log");

        // 从文件读到servlet response输出流中
        File file = new File("/Users/hubertwong/jbr_err_pid18461.log"); // 改这里
        try (FileInputStream inputStream = new FileInputStream(file);) { // try-with-resources
            byte[] b = new byte[1024];
            int len;
            while ((len = inputStream.read(b)) > 0) {
                response.getOutputStream().write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
