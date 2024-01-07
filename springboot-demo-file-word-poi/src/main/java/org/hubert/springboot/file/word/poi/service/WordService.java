package org.hubert.springboot.file.word.poi.service;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

/**
 * @author hubertwong
 */
public interface WordService {

    XWPFDocument generateWordXWPFDocument();
}
