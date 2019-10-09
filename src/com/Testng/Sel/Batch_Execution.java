package com.Testng.Sel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Batch_Execution {
	

		//priority example
	
	@Test
	public void Ademo() {
		System.out.println("Ademo");
	}
	@Test
		
	
	public void Bsample() {
		System.out.println("Bsample");
	}

	@Test
	public void Cdummy() {
		System.out.println("Cdummy");
	}
	
	@BeforeMethod
	public void m() {
		System.out.println("Hi i am before method");
	}
	
	@AfterMethod
	public void n() {

		System.out.println("Hi i am After method");
	
		
	}
	
	@BeforeClass
	public void p() {

		System.out.println("Hi i am before class method");
	
		
	}
	@AfterClass
	public void p1() {

		System.out.println("Hi i am After class method");

		
	}
	
	@BeforeTest
	public void oggy() {
		System.out.println("Hii i am before test method");
	}
	
	@AfterTest
	public void oyo() {
		System.out.println("Hii i am After test method");
	}
	
	
}
	

