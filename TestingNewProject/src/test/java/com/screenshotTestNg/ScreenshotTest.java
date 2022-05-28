package com.screenshotTestNg;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.browserSetting.Base;
import com.pack.ActiTimeHeader;
import com.pack.ActiTimeLogin;
import com.screenshotPath.ScreenshotElementsPath;

public class ScreenshotTest extends Base {
	WebDriver driver;
	ScreenshotElementsPath se;
	
	@BeforeTest
	public void lounchBrowser()
	{
		openChormeBrowser();
	}
	@BeforeClass
	public void setup()
	{
		
		se = new ScreenshotElementsPath(driver);
		
	}
	
	
	@Test
	public void verifyAmazon() throws InterruptedException
	{
		
		Thread.sleep(3000);
		se.clickAcocuntList();
		Thread.sleep(3000);
		se.sendEmail();
		Thread.sleep(3000);
		se.clickContinue();
		Thread.sleep(3000);
		se.sendPassword();
		Thread.sleep(3000);
		se.clickSignInButton();
		Thread.sleep(3000);

		se.sendsearch();
		Thread.sleep(3000);

		se.clicksearchButton();
		Thread.sleep(3000);

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Amazon.in : iphone 13");
		
	}
	
	@AfterClass
	public void clearPOMObjects()
	{
		se = null;
	
	}

}