package handlingPopUps;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("laptop");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='s-image' and @src='https://m.media-amazon.com/images/I/71gXelI8upL._AC_UY218_.jpg']")).click();
		Set<String> allWindowId=driver.getWindowHandles();
		String parentId=driver.getWindowHandle();
		allWindowId.remove(parentId);
		for(String childId: allWindowId) {
			driver.switchTo().window(childId);
		}
		
		driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
		Thread.sleep(2000);
		// Close the Engine
		driver.close();
		
	}
}