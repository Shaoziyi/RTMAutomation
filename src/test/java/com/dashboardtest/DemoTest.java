package com.dashboardtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DemoTest
{
	@Test
	public void f()
	{
		System.out.println("Hello World");
	}

	@BeforeMethod
	public void beforeMethod()
	{
	}

	@AfterMethod
	public void afterMethod()
	{
	}

}
