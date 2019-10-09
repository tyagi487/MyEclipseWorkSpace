package com.Java.Sel;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Screenshots {
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		
		driver.findElement(By.id("loginButton")).click();
		
		//EventFiringWebDriver efw= new EventFiringWebDriver(driver);  // 1st method
		
		TakesScreenshot ts= (TakesScreenshot)driver;   // by down casting  2nd method
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		
		
//		java.util.Date d= new java.util.Date();
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
//
//		java.io.File destfile= new java.io.File("E:\\JAVA_WS4\\Selenium\\screenshots"+ sdf.format(d)+".png");
//		
		
         Date d= new Date();
         SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
         File destfile= new File("E:\\\\JAVA_WS4\\\\Selenium\\\\screenshots"+sdf.format(d)+".png");

		//File srcfile=efw.getScreenshotAs(OutputType.FILE);
		
		
		//File destfile= new File("E:\\JAVA_WS4\\Selenium\\screenshots\\aka.png");
		try {
			Files.copy(srcfile, destfile);
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		
	}
	

}
