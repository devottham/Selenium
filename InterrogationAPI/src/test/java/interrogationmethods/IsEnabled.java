package interrogationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled 
{
	public static void main(String[] arg) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/34");
		Thread.sleep(10000);
		WebElement checkbtn = driver.findElement(By.id("Check"));
		System.out.println(checkbtn.isEnabled());
	}
}
