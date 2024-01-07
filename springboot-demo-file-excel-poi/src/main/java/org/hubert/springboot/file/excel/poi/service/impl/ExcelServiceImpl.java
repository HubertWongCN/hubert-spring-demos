package org.hubert.springboot.file.excel.poi.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hubert.springboot.file.excel.poi.entity.User;
import org.hubert.springboot.file.excel.poi.service.ExcelService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/**
 * @author hubertwong
 */
@Slf4j
@Service
public class ExcelServiceImpl implements ExcelService {

    private static final int POSITION_ROW = 1;
    private static final int POSITION_COL = 1;

    @Override
    public SXSSFWorkbook generateExcelWorkbook() {
        SXSSFWorkbook workbook = new SXSSFWorkbook();
        SXSSFSheet sheet = workbook.createSheet();

        int rows = POSITION_ROW;
        int cols = POSITION_COL;

        // 表头
        SXSSFRow head = sheet.createRow(rows++);
        String[] columns = {"ID", "Name", "Email", "Phone", "Description"};
        int[] colWidths = {2000, 3000, 5000, 5000, 8000};
        CellStyle headStyle = getHeadCellStyle(workbook);
        for (int i = 0; i < columns.length; i++) {
            sheet.setColumnWidth(cols, colWidths[i]);
            addCellWithStyle(head, cols++, headStyle).setCellValue(columns[i]);
        }

        // 表内容
        CellStyle bodyStyle = getBodyCellStyle(workbook);
        for (User user : getUserList()) {
            cols = POSITION_COL;
            Row row = sheet.createRow(rows++);
            addCellWithStyle(row, cols++, bodyStyle).setCellValue(user.getId());
            addCellWithStyle(row, cols++, bodyStyle).setCellValue(user.getUserName());
            addCellWithStyle(row, cols++, bodyStyle).setCellValue(user.getEmail());
            addCellWithStyle(row, cols++, bodyStyle).setCellValue(String.valueOf(user.getPhoneNumber()));
            addCellWithStyle(row, cols++, bodyStyle).setCellValue(user.getDescription());
        }

        return workbook;
    }

    @Override
    public void upload(InputStream inputStream) throws IOException {
        XSSFWorkbook book = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = book.getSheetAt(0);
        // add some validation here

        // parse data
        int cols;
        for (int i = POSITION_ROW; i < sheet.getLastRowNum(); i++) {
            // 表头不算
            XSSFRow row = sheet.getRow(i + 1);
            cols = POSITION_COL;
            User user = User.builder()
                    .id(getCellLongValue(row.getCell(cols++)))
                    .userName(getCellStringValue(row.getCell(cols++)))
                    .email(getCellStringValue(row.getCell(cols++)))
                    .phoneNumber(Long.parseLong(getCellStringValue(row.getCell(cols++))))
                    .description(getCellStringValue(row.getCell(cols++)))
                    .build();
            log.info(user.toString());
        }
        book.close();
    }

    private Cell addCellWithStyle(Row row, int colPosition, CellStyle cellStyle) {
        Cell cell = row.createCell(colPosition);
        cell.setCellStyle(cellStyle);
        return cell;
    }

    private List<User> getUserList() {
        return Collections.singletonList(User.builder()
                .id(1L)
                .userName("hubert")
                .email("hubert@hubert.org")
                .phoneNumber(123242343)
                .description("test excel")
                .build());
    }

    private CellStyle getHeadCellStyle(Workbook workbook) {
        CellStyle style = getBaseCellStyle(workbook);

        // fill
        style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        return style;
    }

    private CellStyle getBodyCellStyle(Workbook workbook) {
        return getBaseCellStyle(workbook);
    }

    private CellStyle getBaseCellStyle(Workbook workbook) {
        CellStyle style = workbook.createCellStyle();

        // font
        Font font = workbook.createFont();
        font.setBold(true);
        style.setFont(font);

        // align
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.TOP);

        // border
        style.setBorderBottom(BorderStyle.THIN);
        style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderLeft(BorderStyle.THIN);
        style.setLeftBorderColor(IndexedColors.BLACK1.getIndex());
        style.setBorderRight(BorderStyle.THIN);
        style.setRightBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderTop(BorderStyle.THIN);
        style.setTopBorderColor(IndexedColors.BLACK1.getIndex());

        return style;
    }

    private String getCellStringValue(XSSFCell cell) {
        try {
            if (null != cell) {
                return String.valueOf(cell.getStringCellValue());
            }
        } catch (Exception e) {
            return String.valueOf(getCellIntValue(cell));
        }
        return "";
    }

    private long getCellLongValue(XSSFCell cell) {
        try {
            if (null != cell) {
                return Long.parseLong("" + (long) cell.getNumericCellValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0L;
    }

    private int getCellIntValue(XSSFCell cell) {
        try {
            if (null != cell) {
                return Integer.parseInt("" + (int) cell.getNumericCellValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
