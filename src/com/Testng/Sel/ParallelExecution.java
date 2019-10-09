package com.Testng.Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {

	WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser","baseurl"})
	public void precondition(String browsername, String URL) {
		
		System.out.println("Before method");
		System.out.println("Launched browser is"+browsername);
		
		
		if(browsername.equalsIgnoreCase("firefox")) {
		
			System.setProperty("webdriver.gecko.driver", "E:\\selenium\\selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.get(URL);
			driver.manage().window().maximize();
		}
		
		else if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.get(URL);
			driver.manage().window().maximize();
			
		}
		

	}
	
	@Test
	public void validLogin() {
		
		System.out.println("Valid login");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
	}
	
	@AfterMethod
	public  void closebrowser() throws InterruptedException {
		
		Thread.sleep(10000);
		driver.close();
		System.out.println("All Launched browser is closed");
		
		
	}
	
}
