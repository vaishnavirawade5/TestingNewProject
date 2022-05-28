package com.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	
	@Parameters("beta")
	@BeforeTest
	public void beforeTest(String data1)
	{
		System.out.println("Before Test");
		System.out.println(data1);
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before CLass");
	}

	@BeforeMethod 
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@Test(priority = 1)
	public void testA()
	{
		System.out.println("A");
	}
	
	@Test (priority = 2)
	public void testB()
	{
		System.out.println("B");
	}
	
	@Test
	public void testC()
	{
		System.out.println("C");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	@AfterTest
	public void afterTest()
	{
	System.out.println("After Test");
	}
}
