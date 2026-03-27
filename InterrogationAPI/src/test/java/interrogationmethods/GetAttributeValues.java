package interrogationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValues 
{
	public static void main(String[] arg) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.id("small-searchterms"));
		System.out.println(search.getAttribute("id"));
		System.out.println(search.getDomAttribute("id"));
		System.out.println(search.getDomProperty("id"));
		Thread.sleep(2000);
		search.sendKeys("Mobile");
		System.out.println(search.getAttribute("value"));
		System.out.println(search.getDomAttribute("value"));
		System.out.println(search.getDomProperty("value"));
		
		
		driver.quit();
		
	
	}


}
