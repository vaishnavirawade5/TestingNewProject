package com.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {

	@Parameters("alpha")
	@BeforeTest
	public void beforeTest(String data)
	{
		System.out.println("Before Test 2");
		System.out.println(data);
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before CLass 2");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method 2");
	}
	
	@Test(priority = 1)
	public void testA()
	{
		System.out.println("A 2");
	}
	
	@Test (priority = 2)
	public void testB()
	{
		System.out.println("B 2");
	}
	
	@Test
	public void testC()
	{
		System.out.println("C 2");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method 2");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class 2");
	}
	@AfterTest
	public void afterTest()
	{
	System.out.println("After Test 2");
	
}


}
