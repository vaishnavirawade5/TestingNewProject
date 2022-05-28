package com.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLogin {

	@FindBy(xpath = "//input[@ id ='username']") private WebElement userName;
	
	@FindBy(xpath="//input[@ type='password']") private WebElement password ; 
	
	@FindBy(xpath = "//input[@ id='keepLoggedInCheckBox']") private WebElement keepMeLoginCheckBox;
	
	@FindBy(xpath = "//a[@ id='loginButton']") private WebElement loginButton;
	
	public ActiTimeLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName()
	{
		userName.sendKeys("vaishnavirawade5@gmail.com");
		
	}
	
	public void sendPassword()
	{
		password.sendKeys("Vaishnavi@5");
	}
	
	public void selectKeepMeLoginCheckBox()
	{
		keepMeLoginCheckBox.click();
	}
	
	public void selectLoginButton()
	{
		loginButton.click();
	}
	
	
}
