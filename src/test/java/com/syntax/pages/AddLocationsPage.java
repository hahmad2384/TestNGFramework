package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class AddLocationsPage extends BaseClass{

	@FindBy(css="input#name")
	public WebElement locName;
	
	@FindBy(xpath="//div[@id='countryCode_inputfileddiv']//input")
	public WebElement selectCountry;
	
	@FindBy(xpath="//div[@id='countryCode_inputfileddiv']//div//ul")
	public WebElement listOfCountries;
	
	@FindBy(id="city")
	public WebElement locCity;
	
	@FindBy(id="zipCode")
	public WebElement locZip;
	
	@FindBy(xpath="//a[text()='Save']")
	public WebElement save;
	
	@FindBy(xpath="//table[@class='highlight bordered']/tbody/tr[1]/td[4]")
	public WebElement locationList;
	public AddLocationsPage() {
        PageFactory.initElements(driver,this);

	}
}
