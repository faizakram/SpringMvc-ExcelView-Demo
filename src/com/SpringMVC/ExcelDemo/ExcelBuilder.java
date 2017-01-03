package com.SpringMVC.ExcelDemo;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class ExcelBuilder extends AbstractExcelView {

	@SuppressWarnings("unchecked")
	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<PortClosure> listBooks = (List<PortClosure>) model.get("listBooks");
		HSSFSheet sheet = workbook.createSheet("PortClouser");
		sheet.setDefaultColumnWidth(10);
		CellStyle headerstyle = headerStyle(workbook);
		HSSFRow header = sheet.createRow(0);

		header.createCell(0).setCellValue("Date");
		header.getCell(0).setCellStyle(headerstyle);

		header.createCell(1).setCellValue("From");
		header.getCell(1).setCellStyle(headerstyle);

		header.createCell(2).setCellValue("To");
		header.getCell(2).setCellStyle(headerstyle);

		header.createCell(3).setCellValue("No. of Hours");
		header.getCell(3).setCellStyle(headerstyle);

		header.createCell(4).setCellValue("Reason");
		header.getCell(4).setCellStyle(headerstyle);

		int rowCount = 1;

		for (PortClosure portClosure : listBooks) {
			HSSFRow aRow = sheet.createRow(rowCount++);
			aRow.createCell(0).setCellValue(portClosure.getDate());
			aRow.getCell(0).setCellStyle(styleFirstRow(workbook));
			aRow.createCell(1).setCellValue(portClosure.getFrom());
			aRow.createCell(2).setCellValue(portClosure.getTo());
			aRow.createCell(3).setCellValue(portClosure.getNoOfHours());
			aRow.getCell(3).setCellStyle(styleSecondRow(workbook));
			aRow.createCell(4).setCellValue(portClosure.getReason());
			aRow.getCell(4).setCellStyle(styleThirdRow(workbook));
		}
	}

	
	public CellStyle headerStyle(HSSFWorkbook workbook) {
		CellStyle headerstyle = workbook.createCellStyle();
		headerstyle.setFillForegroundColor(HSSFColor.DARK_BLUE.index);
		headerstyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		headerstyle.setFont(fontSyle(workbook, headerstyle));
		return headerstyle;
	}
	
	public CellStyle styleFirstRow(HSSFWorkbook workbook) {
		CellStyle headerstyle = workbook.createCellStyle();
		headerstyle.setFillForegroundColor(HSSFColor.LIGHT_BLUE.index);
		headerstyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		headerstyle.setFont(fontSyle(workbook, headerstyle));
		return headerstyle;
	}

	public CellStyle styleSecondRow(HSSFWorkbook workbook) {
		CellStyle headerstyle = workbook.createCellStyle();
		headerstyle.setFillForegroundColor(HSSFColor.TAN.index);
		headerstyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		headerstyle.setFont(fontSyle(workbook, headerstyle));
		return headerstyle;
	}
	public CellStyle styleThirdRow(HSSFWorkbook workbook) {
		CellStyle headerstyle = workbook.createCellStyle();
		headerstyle.setFillForegroundColor(HSSFColor.LIGHT_ORANGE.index);
		headerstyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		headerstyle.setFont(fontSyle(workbook, headerstyle));
		return headerstyle;
	}
	public Font fontSyle(HSSFWorkbook workbook, CellStyle style) {
		Font font = workbook.createFont();
		font.setFontName("Arial");
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		font.setColor(HSSFColor.WHITE.index);
		return font;

	}
}