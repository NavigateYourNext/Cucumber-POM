package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBaseClass;

public class HomePage extends TestBaseClass {

	@FindBy(xpath="//span[contains(text(),'Hello')]")
	WebElement validateHome;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePage()
	{
		return validateHome.getText();
	}
}
