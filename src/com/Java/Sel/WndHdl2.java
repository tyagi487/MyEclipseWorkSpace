package com.Java.Sel;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WndHdl2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\selenium\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
		String Homepage = driver.getWindowHandle();
		System.out.println(Homepage);
		
		driver.findElement(By.xpath("//a[@id='loginsubmit']")).click();
		
//	String	Poppage=driver.getWindowHandle();
//	System.out.println(Poppage);
	
	Set<String> window = driver.getWindowHandles();
	System.out.println(window.size());
	
	
//	Iterator<String> itr=window.iterator();
//	String s1=itr.next();
//	String s2=itr.next();

	//System.out.println(s1+" "+s2);
	
   for(String child :window ) {
	   
	   //System.out.println(window);
	   
	   if(!Homepage.equalsIgnoreCase(child)) {
		   
		   Thread.sleep(5000);
		   driver.switchTo().window(child);
		   driver.close();
		   
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
		  
		   
		   
	   }
   }
	
	
	
	
	
	
		
	}
	
	
}
