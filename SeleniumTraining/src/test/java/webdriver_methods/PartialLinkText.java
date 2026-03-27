package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DriverCommand;

public class PartialLinkText 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Comp")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Register")).click();
		Thread.sleep(2000);
		driver.close();
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);
		driver2.findElement(By.partialLinkText("Login")).click();
		Thread.sleep(2000);
		driver2.close();
	}

}
