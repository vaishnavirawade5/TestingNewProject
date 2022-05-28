package com.browserSetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

		
		public static  WebDriver openChormeBrowser()
		{
			System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			return driver;
		}
		
}
