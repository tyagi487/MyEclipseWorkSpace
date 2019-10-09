package com.Java.Sel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		
		driver.findElement(By.id("loginButton")).click();
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Help & Support')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'User Guide')]")).click();
		
		
		Set<String> gw = driver.getWindowHandles();
		
		System.out.println(gw.getClass().getSimpleName());
		System.out.println(gw);
		
		System.out.println("total browser window"+" "+gw.size());
		
		Iterator<String> itr = gw.iterator();
		String pID = itr.next();
		System.out.println(pID);
		String childID = itr.next();
		
		System.out.println(childID);
		
		driver.switchTo().window(childID);
		
		Thread.sleep(4000);

		driver.findElement(By.linkText("Reporting Overview")).click();
		
		Thread.sleep(4000);

		
		driver.switchTo().window(pID);
		
		Thread.sleep(4000);

		driver.findElement(By.id("logoutLink")).click();
		//driver.quit();
		driver.close();
		
		
		
		
		
		
		
	}
	
}
