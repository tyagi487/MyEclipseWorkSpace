import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class NewTab {

	public static void main(String[] args) {

		WebDriver driver=Chrome.Chrome();
		driver.get("https://www.google.com/");
		//driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL+  "t");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.open()");
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
				
		Iterator<String> itr = windows.iterator();
		String win1=itr.next();
		String win2=itr.next();
		driver.switchTo().window(win2);
		driver.get("https://facebook.com/");
	}

}
