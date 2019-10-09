package com.Java.Sel;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitEg {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\selenium\\\\chromedriver.exe");
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		
		WebDriver driver=new ChromeDriver(options);*/
		
		
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	/*	JavascriptExecutor JS = (JavascriptExecutor)driver;
		// To enter username
		JS.executeScript("document.getElementById('User').value='SoftwareTestingMaterial.com'");
		
	
		// To enter password
		JS.executeScript("document.getElementById('Pass').value='tester'");
		
		
		
		*/
		
		
		
		
		
		driver.navigate().to("https://www.guru99.com/implicit-explicit-waits-selenium.html");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebDriverWait w=new WebDriverWait(driver, 15);
		w.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//h2[contains(text(),'Fluent Wait')]"),"Fluent Wait"));
		
		
		FluentWait wait=new FluentWait(driver);
		wait.withTimeout(45, TimeUnit.SECONDS);
		wait.pollingEvery(5, TimeUnit.SECONDS);
		
	}

}
