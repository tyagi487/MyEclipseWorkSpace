package com.Testng.Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	static WebDriver driver;
	
	@Test(priority=1)
	public void openbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(dependsOnMethods={"openbrowser"})
	public void navigatetoURL() {
		
		openbrowser();
		driver.get("https://www.guru99.com/");
	}
	
	
	
	
}
