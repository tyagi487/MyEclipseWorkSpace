package com.Testng.Sel;

import java.io.File;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(enabled=false)           //Stop the script to execute
	public void registerAccount()
	{
		System.out.println("First register your account");
	}
	@Test(priority=-1)
	public void sendEmail()
	{
		System.out.println("Send email after login");
	}
	@Test(priority=1)
	public void login()
	{
		File f=new File("adad");
		System.out.println("Login to the account after registration");
		
	}
	
	@Test(dependsOnMethods={"login"})
	public void A() {
		
		System.out.println("depands on method");
		
		
	}
	
	@Test(expectedExceptions = NumberFormatException.class, priority=2)
	public void X() {
		System.out.println("X");
	}
	
		
}


