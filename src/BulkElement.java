import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BulkElement {
	
	
	public static void main(String[] args) {
		
		WebDriver driver=Chrome.Chrome();
		
		driver.get("https://istqb.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count);
		int displaycount=0;
		int hiddencount=0;
		
	/*for(int i=0; i<count; i++) {
			WebElement Link = links.get(i);
			String LinkText=Link.getText();
			System.out.println(LinkText);

		}*/
		
		for(int i=0; i<count; i++) {
			WebElement Link = links.get(i);
			boolean flag=Link.isDisplayed();

			if(flag) {
				
				displaycount++;
				System.out.println(Link.getText());
			}
			else {
				hiddencount++;
			}
			
		
		}
		System.out.println(displaycount);
		System.out.println(hiddencount);
		
	}

}
