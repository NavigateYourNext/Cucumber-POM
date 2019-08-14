package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBaseClass;

public class LoginPage extends TestBaseClass
{
	@FindBy(xpath="//span[@class='nav-line-2' and text()='Account & Lists']")
	WebElement loginButton;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continueButton;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement signIn;
	
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage login(String uname, String pass)
	{
		loginButton.click();
		username.sendKeys(uname);
		continueButton.click();
		password.sendKeys(pass);
		signIn.click();
		
		return new HomePage();
	}
}
