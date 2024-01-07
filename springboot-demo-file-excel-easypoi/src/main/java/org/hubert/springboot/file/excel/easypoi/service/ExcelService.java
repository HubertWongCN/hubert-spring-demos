package org.hubert.springboot.file.excel.easypoi.service;

import javax.servlet.ServletOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author hubertwong
 */
public interface ExcelService {

    void upload(InputStream inputStream) throws Exception;

    void downloadExcel(ServletOutputStream outputStream) throws IOException;

    void fillExcelTemplate(ServletOutputStream outputStream) throws IOException;
}
