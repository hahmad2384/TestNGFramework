package com.syntax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.syntax.utils.BaseClass;

public class LoginPageWithOutPageFactory extends BaseClass{

public WebElement userName = driver.findElement(By.id("txtUsername"));
public WebElement password = driver.findElement(By.id("txtPassword"));
public WebElement loginbtn = driver.findElement(By.id("btnLogin"));

	
}
