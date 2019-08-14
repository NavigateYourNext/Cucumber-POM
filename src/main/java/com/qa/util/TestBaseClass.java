package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.TestUtil;

public class TestBaseClass 
{
	public static WebDriver driver;
	public static Properties prop;

	public TestBaseClass()
	{
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:/Users/akshay.shete/workspace/CucumberPOM/src/main/java/com/qa/config/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(TestUtil.page_Load_Timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.implicit_Wait,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static void closedBrowser()
	{
		driver.quit();
	}
}
