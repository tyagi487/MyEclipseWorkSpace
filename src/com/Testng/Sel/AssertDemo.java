package com.Testng.Sel;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	
	//soft assert
	
	WebDriver driver;
	 
	@BeforeMethod
	public void precondiotion() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\selenium\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do");
		
	}

//	@AfterMethod
//	public void postcondition() {
//		
//		System.out.println("browser closed");
//		driver.close();
//	}
	
	@Test(priority=1)
	public  void validLogin() {
		
		System.out.println("Valid login");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		String exp_text="Enter Time-Tra";
		String actual_txt=driver.findElement(By.xpath("//td[contains(text(),'Enter Time-Track')]")).getText();
		System.out.println(actual_txt);
		
		SoftAssert sa=new SoftAssert();
	    sa.assertEquals(exp_text, actual_txt);
	    //actual_txt.contentEquals(exp_text);
	    System.out.println(actual_txt.contentEquals(exp_text));
	    
	    if (actual_txt.contentEquals(exp_text)) {
	    	
		    Reporter.log("Enter Time-Track element in Home page is  verifed", true);

	    	
	    }
	    
	    else {
		    Reporter.log("Enter Time-Track element in Home page is not verifed", true);

	    }
	    
	    //Reporter.log("Enter Time-Track element in Home page is not verifed", true);
	    
//	    Assert.assertEquals(actual_txt, exp_text);
//	    Reporter.log("Home page is verifed", true);
	
	String Actual_ttl=driver.getTitle();
	System.out.println(Actual_ttl);
	
	String expTtl="actiTIME - Enter Time-Track";
	
	//String Actual_ttl=driver.getTitle();
	
	//Assert.assertEquals(Actual_ttl, expTtl);
	
	SoftAssert sa1=new SoftAssert();
	sa1.assertEquals(Actual_ttl, expTtl);

	Reporter.log("Home page title is also verifed", true);
	
	Reporter.log("'Enter Time-Track is failed but page tittle is execute by soft assert", true);

	
	sa1.assertAll();
		
	}
	
	@Test(priority=2,enabled=false)
	public void invalidLogin() {
		
		System.out.println("InValid login");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("12446");
		driver.findElement(By.id("loginButton")).click();
		
		String Exp_Error_Msg="Username or Password is invalid. Please try again.";
		
		String actual_Error_Msg=driver.findElement(By.xpath("//div[@id='ServerSideErrorMessage']")).getText();
		
		Assert.assertEquals(actual_Error_Msg, Exp_Error_Msg);
		
		Reporter.log("Invaliad login error msg is also verifed", true);
	}
	
}
