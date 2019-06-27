package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath= "//li[text()='Dashboard']")
	public WebElement dashboardText;
	
	@FindBy(xpath = "//span[text()='PIM']")
	public WebElement PIM;
	
	@FindBy(xpath="//span[text()='Add Employee']")
	public WebElement addEmpl;
	
	@FindBy(xpath="//div[@id='menu-content']//span[text()='Admin']")
	public WebElement Admin;
	
	@FindBy(xpath="//span[text()='Organization']")
	public WebElement Organization;
	
	@FindBy(xpath="//span[text()='Locations']")
	public WebElement location;
	
	@FindBy(xpath="//i[text()='add']")
	public WebElement add;
public HomePage() {
	PageFactory.initElements(driver, this);
}
	
}
