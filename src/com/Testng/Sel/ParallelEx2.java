package com.Testng.Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelEx2 {
	
	WebDriver driver=null;
	
	@BeforeMethod
	@Parameters({"browser","URL"})
	public void launchBrowser(String browser , String URL) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get(URL);
		driver.manage().window().maximize();
		
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\selenium\\selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.get(URL);
			driver.manage().window().maximize();
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	@Test
	public void TC1() {
		System.out.println("I am in test case 1"+Thread.currentThread().getId());
	}


	@Test
	public void TC2() {
		System.out.println("I am in test case 2"+Thread.currentThread().getId());
	}
	
}
