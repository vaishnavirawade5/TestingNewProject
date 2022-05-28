package com.application;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.browserSetting.BaseClassCrossBrowser;
import com.pack.ActiTimeHeader;
import com.pack.ActiTimeLogin;


	
public class VerifytheActiTimeHeader extends BaseClassCrossBrowser{
	
	WebDriver driver;
	ActiTimeHeader 	actiTimeHeader;
	ActiTimeLogin login;
	
	@Parameters("browser")
	@BeforeTest
	public void lounchBrowser(String browser)
	{
		if(browser.equals("ChromeBrowser"))
		{
			driver = openChromeBrowser();
		}
		
		if(browser.equals("FirefoxBrowser"))
		{
			driver = openFirefoxBrowser();
		}
		
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	}
	
	
	
	
	@BeforeClass
	public void lounchBrowser()
	{
		
		login = new ActiTimeLogin(driver);
		actiTimeHeader = new ActiTimeHeader(driver);
	}
	
	@BeforeMethod
	public void loginToApplication() throws InterruptedException
	{
		
		driver.get("https://online.actitime.com/vrawade1/login.do");
		
		login.sendUserName();
		login.sendPassword();
		login.selectKeepMeLoginCheckBox();
		login.selectLoginButton();
		Thread.sleep(2000);
	}	
	
	@Test
		public void verifyTasksTab()
		{
		actiTimeHeader.clickOnTasks();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(url);
		System.out.println(title);
		
		Assert.assertEquals("url", "https://vrawade1/tasks/tasklist.do");
		Assert.assertEquals(title, "actiTIME -  Task List");
	/*	if(url.equals("https://vrawade1/tasks/tasklist.do")&& title.equals("actiTIME -  Task List"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	*/	
	}				
	
		@Test
		public void verifyRetoprsTab()
		{
		
		String urlReports = driver.getCurrentUrl();
		String titleReports = driver.getTitle();
		System.out.println(urlReports);
		System.out.println(titleReports);
		
		if(urlReports.equals("https://actitime.com/vrawade1/reports/dashboard.do")&& titleReports.equals("actiTIME -  Reports Dashboard"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		}
	@AfterMethod
	public void logoutApplication()
	{
		actiTimeHeader.clickOnLogout();		
	}
	
	@AfterClass
	public void clearPOMObjects()
	{
		login = null;
		actiTimeHeader = null ;
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver = null;
		System.gc();   //Garbage Collector
	}
}
	