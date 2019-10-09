package com.Java.Sel;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOprn {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("7503110921");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("playboy111");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
		System.out.println("Login successfull");
		

		Thread.sleep(20000);
		
		

		Actions act=new Actions(driver);
		
		WebElement hf=	driver.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"));

		
		act.moveToElement(hf).perform();
		
		System.out.println("Mouse over 1");
		
		Thread.sleep(20000);
		
		WebElement stickers = driver.findElement(By.xpath("//a[text()='Stickers']"));
		act.click(stickers).perform();
		System.out.println("Action Click on Stickers");
		
		Thread.sleep(3000);
		
		WebElement slider = driver.findElement(By.xpath("//div[@class='_3G9WVX _2N3EuE']"));
		
		act.clickAndHold(slider).perform();
		act.moveByOffset(-90, 0);
		act.release(slider).perform();
		
		WebElement srhbx = driver.findElement(By.name("q"));
		act.sendKeys(srhbx, "sumsung galaxy").perform();
		Thread.sleep(1000);
		System.out.println("Data Entered");
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		System.out.println("Arrow Down");

		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		System.out.println("Arrow Down again");

		
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Done");

		



	
		
	}

}
