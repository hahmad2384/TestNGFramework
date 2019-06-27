package com.syntax.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {
	@Test
	public void readExcelFile() throws IOException {
		
		String xlPath = "src/test/resources/testdata/OrangeHrmData.xlsx";
		FileInputStream fis = new FileInputStream(xlPath);
		
		//Open workbook and Sheet
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("EmployeeDetails");
		//write some values
		sheet.getRow(0).createCell(4).setCellValue("Result");
		sheet.getRow(1).createCell(4).setCellValue("Pass");
		sheet.getRow(1).getCell(4).setCellValue("Fail");
		sheet.createRow(11).createCell(0).setCellValue("Mehmet");
		//write to Excel
		FileOutputStream fos = new FileOutputStream(xlPath);
		workbook.write(fos);
		
		//close file and opened stream
		workbook.close();
		fos.close();
		fis.close();
		
		
	}		
}

