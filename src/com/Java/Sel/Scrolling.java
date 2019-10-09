package com.Java.Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\selenium\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.guru99.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		//Thread.sleep(2000);

		// explicit wait
//		
		WebDriverWait wdw = new WebDriverWait(driver, 20);
		wdw.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("")));

//		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		
		js.executeScript("window.scrollBy(0,1000)");
//		 
//		 //https://www.guru99.com/scroll-up-down-selenium-webdriver.html

	}
}
