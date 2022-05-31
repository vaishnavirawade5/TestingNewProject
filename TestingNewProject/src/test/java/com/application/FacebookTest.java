package com.application;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.facebook.FacebookLogin;

public class FacebookTest {

	WebDriver driver;
	FacebookLogin login;
	@BeforeClass
	public void lounchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
	}
	
	@BeforeMethod
	public void louchApp()
	{
		driver.get("https://www.facebook.com");
		login = new FacebookLogin(driver);
		
		login.facebookLogin();
		
	}
	
	
	
}
