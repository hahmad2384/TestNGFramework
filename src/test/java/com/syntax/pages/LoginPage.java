package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginPage extends BaseClass{
 //locating WebElement using @FindBy annotation
	@FindBy(id="txtUsername")
	public WebElement userName;

	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(id="btnLogin")
	public WebElement loginbtn;
	
	@FindBy(css = "img[src*='logo.png']")
	public WebElement logo;
	
	@FindBy(xpath="//*[@id=\"toast-container\"]/div/div")
	public WebElement errorMessage;
	//initialize all of our variables
	//Static methods
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void login(String uname, String pwd) { //Method
		CommonMethods.sendText(userName, uname);
		CommonMethods.sendText(password, pwd);
		CommonMethods.click(loginbtn);
		
	}
}
