package MakeMyTrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trip {
	
static WebDriver driver;

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\selenium\\chromedriver.exe");

	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/flights/");
	/*driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	driver.findElement(By.xpath("//p[contains(text(),'Mumbai, India')]")).click();
	System.out.println("Mumbai");
	driver.findElement(By.xpath("//input[@placeholder='To']")).click();
	driver.findElement(By.xpath("//p[contains(text(),'New York, US')]")).click();
	System.out.println("US");*/
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	System.out.println(driver.getTitle());
}
}
