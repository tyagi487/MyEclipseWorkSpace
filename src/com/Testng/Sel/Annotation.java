package com.Testng.Sel;

import org.testng.annotations.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation {
	
	@BeforeSuite
	public void Jethalal()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void Baga()
	{
		System.out.println("After Suite");
	}
	@BeforeTest
	
		public void Nattu()
		{
			System.out.println("Before Test");
		}

	@AfterTest
	public void baka() {
		System.out.println("after test");
		
		}
		@BeforeClass
		public void Hati()
		{
			System.out.println("Before class");
		}
		@AfterClass
		public void sonu()
		{
			System.out.println("after class");
		}
		
		@BeforeMethod
		public void AaTuBde()
		{
			System.out.println("Before method");
		}
		@AfterMethod
		public void Goggi()
		{
			System.out.println("after method");
		}
		
		
		@Test
		public void login()
		{
			System.out.println("login script is running");
		}
		@Test
		public void signup()
		{
			System.out.println("sign up script is running");
		}
		

}

/*
 * [RemoteTestNG] detected TestNG version 6.14.3
Before Suite
Before Test
Before class
Before method
login script is running
after method
Before method
sign up script is running
after method
after class
after test
PASSED: login
PASSED: signup

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================

After Suite

===============================================
Default suite
Total tests run: 2, Failures: 0, Skips: 0
===============================================
 * 
 */

