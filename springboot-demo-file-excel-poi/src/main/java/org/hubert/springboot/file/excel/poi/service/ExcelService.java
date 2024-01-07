package org.hubert.springboot.file.excel.poi.service;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author hubertwong
 */
public interface ExcelService {
    /**
     * generate excel work book
     *
     * @return {@link SXSSFWorkbook}
     */
    SXSSFWorkbook generateExcelWorkbook();

    /**
     * upload excel
     *
     * @param inputStream {@link InputStream}
     * @throws IOException {@link IOException}
     */
    void upload(InputStream inputStream) throws IOException;
}
