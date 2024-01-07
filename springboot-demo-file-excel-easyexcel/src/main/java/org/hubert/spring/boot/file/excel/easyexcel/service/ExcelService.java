package org.hubert.spring.boot.file.excel.easyexcel.service;

import javax.servlet.ServletOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author hubertwong
 */
public interface ExcelService {

    void upload(InputStream inputStream) throws IOException;

    void downloadExcel(ServletOutputStream outputStream);

    void fillExcelTemplate(ServletOutputStream outputStream);
}
