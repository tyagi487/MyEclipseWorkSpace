import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A {

	public static void main(String[] args) {
		
		WebDriver driver=Chrome.Chrome();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//input[@name='q']"));
		e.sendKeys("Hello");
		e.sendKeys(Keys.CONTROL+"t");
		
	}
}
