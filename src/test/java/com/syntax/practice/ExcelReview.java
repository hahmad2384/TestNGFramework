package com.syntax.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReview {

	
@Test
public void readExcel() throws IOException {
	String xlPath = "src/test/resources/testdata/OrangeHrmData.xlsx";
	
	FileInputStream fis = new FileInputStream(xlPath);
	
	//Open Workbook
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	
	//Open specified sheet
	XSSFSheet sheet = workbook.getSheet("EmployeeDetails");
	
	//access value of specifiedcell
	String value = sheet.getRow(1).getCell(0).toString();
	System.out.println(value);
	
	//get number of rows and cols	
	int rowNum = sheet.getPhysicalNumberOfRows();
	int colNum = sheet.getRow(0).getLastCellNum();
	
	System.out.println("Number of rows are "+rowNum+" and number of columns are "+colNum);
	
	//get value from each cell 1 by 1
	
	for(int i =1; i<rowNum; i++) {
		for(int j=0; j<colNum; j++) {
			String cellValue = sheet.getRow(i).getCell(j).toString();
			System.out.print(cellValue+ " ");
		}
		System.out.println();
	}

	//close workbook and stream
	workbook.close();
	fis.close();
}	
}
