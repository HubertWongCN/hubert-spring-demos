package org.hubert.springboot.file.word.poitl.service;

import com.deepoove.poi.XWPFTemplate;

import java.io.IOException;

/**
 * @author hubertwong
 */
public interface WordService {

    XWPFTemplate generateWordXWPFTemplate() throws IOException;

    XWPFTemplate generateWordXWPFTemplateMD() throws IOException;
}
