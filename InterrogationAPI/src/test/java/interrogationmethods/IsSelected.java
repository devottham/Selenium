package interrogationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected
{
	public static void main(String[] arg) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement radio = driver.findElement(By.id("pollanswers-2"));
		System.out.println(radio.isSelected());
		radio.click();
		Thread.sleep(3000);
		System.out.println(radio.isSelected());
		driver.quit();
	}
}



