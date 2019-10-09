package com.Java.Sel;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WH2 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	driver.get("https://news.google.com/?tab=wn&hl=en-IN&gl=IN&ceid=IN:en");
	
    WebElement link=driver.findElement(By.xpath("//a[text()='Ghaziabad: ‘Speeding’ bus hits sisters on scooter; 20-year-old dead']"));
	
	link.click();
	
	Set<String> windows = driver.getWindowHandles();
	
	System.out.println(windows);
	
	System.out.println(windows.size());
	
	Iterator<String> count = windows.iterator(); 
	
	String Parent=count.next();
	System.out.println(Parent);
		
	String child=count.next();
	System.out.println(child);
	
	driver.switchTo().window(child);
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@class='a-global-header-logo']")).click();
	
	
	
	
	
	
	
	
}
}
