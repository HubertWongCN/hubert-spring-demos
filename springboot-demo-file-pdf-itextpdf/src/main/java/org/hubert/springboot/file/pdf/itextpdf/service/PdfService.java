package org.hubert.springboot.file.pdf.itextpdf.service;

import com.itextpdf.text.Document;

import java.io.OutputStream;

/**
 * @author hubertwong
 */
public interface PdfService {

    Document generateItextPdfDocument(OutputStream os) throws Exception;
}
