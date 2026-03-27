package webdriver_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> radiobtns = driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement btn : radiobtns)
		{
				btn.click();
				Thread.sleep(1000);
		}
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(., \"Shopping cart\")]")).click();
		driver.findElement(By.xpath("//span[contains(@class, \"cart-label\")]")).click();
		Thread.sleep(2000);
	}

}
