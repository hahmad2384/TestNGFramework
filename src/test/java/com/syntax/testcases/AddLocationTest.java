package com.syntax.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.syntax.pages.AddLocationsPage;
import com.syntax.pages.HomePage;
import com.syntax.pages.LoginPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;
import com.syntax.utils.Constants;
import com.syntax.utils.ExcelUtility;

public class AddLocationTest extends BaseClass {

	@Test(dataProvider ="add Location")
	public void empLocation(String name, String country, String city, String zip) throws InterruptedException {
		LoginPage login = new LoginPage();
		HomePage home = new HomePage();
		AddLocationsPage addLoc = new AddLocationsPage();
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		CommonMethods.click(home.Admin);
		CommonMethods.click(home.Organization);
		CommonMethods.click(home.location);
		CommonMethods.click(home.add);

		CommonMethods.sendText(addLoc.locName, name);
		CommonMethods.click(addLoc.selectCountry);
		CommonMethods.selectList(addLoc.listOfCountries, country);
		CommonMethods.sendText(addLoc.locCity, city);
		CommonMethods.sendText(addLoc.locZip, zip);
		CommonMethods.click(addLoc.save);
}
	@DataProvider(name="add Location")
	public Object[][] getEmpData() {
		ExcelUtility obj = new ExcelUtility();
		obj.openExcel(Constants.XL_FILEPATH, "AddLocation");
		
		int rows = obj.getRowNum();//13
		int cols = obj.getColNum(0);//4
		Object[][] data = new Object[rows-1][cols];//newObject[10][4] // we do not want to store data of header
		
		for(int i=1; i<rows; i++) {
			for(int j=0; j<cols;j++) {
				String value = obj.getCellData(i, j);
				//at first iteration data[1][0]
				//at last iteration data[12][3]
				data[i-1][j] = value;//data[0][0] ;
				
			}
		}
		return data;
	}
	@DataProvider(name = "employee location")
	public Object[][] getData() {
		Object[][] data = new Object[1][4];

		data[0][0] = "West Office";
		data[0][1] = "Afghanistan";
		data[0][2] = "Kabul";
		data[0][3] = "55050";

		data[1][0] = "North Office";
		data[1][1] = "Albania";
		data[1][2] = "Berat";
		data[1][3] = "66060";

		data[2][0] = "Smart Office";
		data[2][1] = "Algeria";
		data[2][2] = "Oran";
		data[2][3] = "55054";

		data[3][0] = "HQ";
		data[3][1] = "Argentina";
		data[3][2] = "Salta";
		data[3][3] = "20602";

		return data;

	}
	
	
}
