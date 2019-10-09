package com.Java.Sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hello {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//driver.close();
		//driver.quit();
		WebElement sk = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		sk.sendKeys("akash");
//		
		// FOR POP UPS
		
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();  TO click on ok btn
		
//		alert.dismiss();  to click on cancel btn
		
		
		
		//sk.clear();
//		sk.sendKeys(Keys.CONTROL+"a");
//		sk.sendKeys(Keys.DELETE);
//		sk.sendKeys("Hi");
		
		driver.navigate().refresh();
		
//		driver.navigate().back();
//		driver.navigate().forward();
//		 
//		Actions act=new Actions(driver);
		
		String sessionid=driver.getWindowHandle();
		System.out.println("Session id is"+" "+sessionid);
		
		
			
		
	}

}
