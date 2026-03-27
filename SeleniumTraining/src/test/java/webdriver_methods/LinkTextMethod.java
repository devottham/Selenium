package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextMethod 
{
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Facebook")).click();
		driver.close();
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://google.com");
		Thread.sleep(2000);
		driver2.findElement(By.linkText("Gmail")).click();
		Thread.sleep(5000);
		driver2.close();
	}

}
