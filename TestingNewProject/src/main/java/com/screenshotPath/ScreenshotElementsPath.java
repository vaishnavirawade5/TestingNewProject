package com.screenshotPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScreenshotElementsPath {

	@FindBy(xpath = "//span[text()=\"Account & Lists\"]") private WebElement accountList;
	@FindBy(xpath = "//input[@type='email']") private WebElement email;
	@FindBy(xpath = "//input[@id='continue']") private WebElement conti;
	@FindBy(xpath = "Vaishnavi@5" ) private WebElement password;
	@FindBy(xpath="//input[@id='signInSubmit']") private WebElement singIn;
	@FindBy(xpath ="//input[@type='text']") private WebElement search ;
	
	@FindBy(xpath ="//input[@type='submit']") private WebElement searchButton ;
	
	
	
	
	public ScreenshotElementsPath(WebDriver driver)
			{
		
		PageFactory.initElements(driver, this);
		
			}
	
	public void clickAcocuntList() {
		accountList.click();
	}
	
	public void sendEmail()
	{
		email.sendKeys("7517311179");
	}
	public void clickContinue()
	{
		conti.click();
	}
	public void sendPassword()
	{
		password.sendKeys("Vasihanvi@5");
	}
	public void clickSignInButton()
	{
		singIn.click();
	}
	public void sendsearch()
	{
		search.sendKeys("IPhone 13 pro max");
	}
	public void clicksearchButton()
	{
		searchButton.click();
	}
	
}
