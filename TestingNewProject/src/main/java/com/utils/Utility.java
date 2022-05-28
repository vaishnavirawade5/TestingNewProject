package com.utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public void captureScreenshot(int testId, WebDriver driver) throws IOException
	{
		Date d = new Date();
		String fileName = d.toString().replace(" ","-").replace(":","-")+".jpg" ;
		TakesScreenshot s = (TakesScreenshot)driver;
	   try {
		File source = s.getScreenshotAs(OutputType.FILE);
		File destination = new File("/TestingNewProject/screenshots/"+"Image"+fileName+".jpg");
		FileUtils.copyFile(source, destination);
		//FileHandler.copy(source, destination);
	   }
	   catch(IOException e)
	   {
		   e.printStackTrace();
	   }
	}
	
	public void getDataFromExcelSheet()
	{
		
	}
	
}
