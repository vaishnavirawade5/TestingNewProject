package com.application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookMain{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","F:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	}
	
}
