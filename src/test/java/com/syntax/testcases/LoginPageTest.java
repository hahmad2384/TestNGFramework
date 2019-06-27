package com.syntax.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.syntax.pages.AddEmployeePage;
import com.syntax.pages.HomePage;
import com.syntax.pages.LoginPage;
import com.syntax.pages.LoginPageWithOutPageFactory;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginPageTest extends BaseClass {

	@Test(groups = "smoke")
	public void loginToOrangeHRM() {
		//test=report.createTest("Positive login");

		LoginPageWithOutPageFactory login = new LoginPageWithOutPageFactory();
		
		test.info("Logging in with valid credentials");
		
		CommonMethods.sendText(login.userName, "Admin");
		CommonMethods.sendText(login.password, "Test2525@@$$");
		CommonMethods.click(login.loginbtn);
		
		test.info("verifying dashboard text is displayed");
		HomePage home = new HomePage();
		boolean isDisplayed = home.dashboardText.isDisplayed();
		Assert.assertTrue(isDisplayed);
		
		test.pass("Successfully logged in");
	}

	@Test(groups = "smoke")
	public void userLogin() {
		//test=report.createTest("Login verification 2");
		LoginPage login = new LoginPage();
		test.info("Providing Valid Credentials");
		CommonMethods.sendText(login.userName, ConfigsReader.getProperty("username"));
		CommonMethods.sendText(login.password, ConfigsReader.getProperty("password"));
		CommonMethods.click(login.loginbtn);
test.info("Verifying dashboard text is displayed");
		HomePage home = new HomePage();
		boolean isDisplayed = home.dashboardText.isDisplayed();
		//Assert.assertTrue(isDisplayed);
		//test.pass("user has successfully logged in");
Assert.assertTrue(false);
	}

	@Test(groups = "regression")
	public void negativeLogin() {
		LoginPage login = new LoginPage();
		CommonMethods.sendText(login.userName, ConfigsReader.getProperty("invalidUser"));
		CommonMethods.sendText(login.password, ConfigsReader.getProperty("invalidPass"));
		CommonMethods.click(login.loginbtn);

		boolean isDisplayed = login.errorMessage.isDisplayed();
		Assert.assertTrue(isDisplayed);
		System.out.println("Error is Displayed");

	}

}
