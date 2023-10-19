package com.facebook.Ulitilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	private String filelocation;
	private String sheetName;

	public ReadExcel(String filelocation, String sheet) {
		super();
		this.filelocation = filelocation;
		this.sheetName = sheet;
	}

//	Workbook j ;

	public String getStringData(int rowNumber, int columnNumber) {

		String cellData = null;

		try {
			FileInputStream fis = new FileInputStream(filelocation);
			Workbook workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNumber);
			Cell column = row.getCell(columnNumber);
			cellData = column.getStringCellValue();

		} catch (IOException e) {

			e.printStackTrace();
		}
		return cellData;

	}

	public static void main(String[] args) {

		// path location
		String filelocation = "src/test/resources/fbsignup.xlsx";

		// sheet er location
		String sheetName = "Sheet1";

		ReadExcel rd = new ReadExcel(filelocation, sheetName);

		// read excel
		String data = rd.getStringData(0, 0);
		System.out.println(data);
		String firstName = rd.getStringData(1, 0);
		System.out.println(firstName);

	}
}
