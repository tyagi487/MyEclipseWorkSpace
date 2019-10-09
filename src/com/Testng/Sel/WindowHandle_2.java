package com.Testng.Sel;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
//		driver.findElement(By.name("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.id("loginButton")).click();
//		
//		driver.findElement(By.xpath("//span[text()='Help & Support']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Companies')]")).click();
//		read.sleep(10000);
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Directi Jobs')]")).click();
		
		
		String parent=driver.getWindowHandle();
		System.out.println("Parent window id is"+parent);
		
		Set<String> AllWindows = driver.getWindowHandles();
		
		//System.out.println("All window id is "+AllWindows);
		
		System.out.println(AllWindows.getClass().getSimpleName());
		System.out.println(AllWindows);
		
		System.out.println("total browser window"+" "+AllWindows.size());
		
		
		for(String chile: AllWindows ) {
			
			if(!parent.equalsIgnoreCase(chile)) {
				
				
			//	Thread.sleep(10000);
				driver.switchTo().window(parent);
				
				Thread.sleep(10000);

				
				driver.findElement(By.xpath("//div[@class='mTxt'][contains(text(),'Jobs')]")).click();
				
			}
			
		}


		
		
		
		
	}

}
