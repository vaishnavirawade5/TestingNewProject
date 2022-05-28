package com.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {

	@FindBy(xpath = "//input[@id = 'email']")
	private WebElement userName ; 
	
	@FindBy(xpath = "//input[@id = 'pass']")
	private  WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;
	
	public Facebook (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void Facebook()
	{
		userName.sendKeys("vaishnavirawade31@gmail.com");
		password.sendKeys("vaishnavi@5");
		submit.click();
		
	}
}
