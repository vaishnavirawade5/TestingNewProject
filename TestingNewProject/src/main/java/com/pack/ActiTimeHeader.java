package com.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHeader {
	
	@FindBy(xpath = " //div[@ id='container_tt'] ") private WebElement timeTrack;
	
	@FindBy(xpath = " //div[@ id='container_tasks'] ") private WebElement tasks;
	
	@FindBy(xpath = " //div[@ id='container_reports'] ") private WebElement reports;
	
	@FindBy(xpath = " //div[@ id='container_users'] ") private WebElement users;
	
	@FindBy(xpath = " //a[@id = 'logoutLink'] ") private WebElement logout;
	
	
	public ActiTimeHeader(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	
	public void clickOnTimeTrack()
	{
		timeTrack.click();
	}
	
	public void clickOnTasks()
	{
		tasks.click();
	}
	
	public void clickOnReports()
	{
		reports.click();
	}
	
	public void clickOnUsers()
	{
		users.click();
		
	}
	public void clickOnLogout()
	{
		logout.click();
	}

}
