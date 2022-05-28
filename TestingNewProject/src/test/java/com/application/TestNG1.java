package com.application;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class print");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method ");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test Print");
	}
	@Test
	public void test()
	{
		System.out.println("Test print");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test print 1");
	}
	@Test
	public void test2()
	{
		System.out.println("Test print 2");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test Print");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class print");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method ");
	}
	
}
