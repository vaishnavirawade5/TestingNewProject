package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {

	@FindBy(xpath = " //input[@id='email']" ) private WebElement username;
	
	@FindBy(xpath = "" ) private WebElement password;
	
	@FindBy(xpath = " " ) private WebElement loginButton;
	
	public FacebookLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
//	public void facebookLogin()
//	{
//		username.sendKeys("vaishnavirawade31@gmai.com");
//		password.sendKeys("Vaishnavi");
//		loginButton.click();
//	}
//	
}
