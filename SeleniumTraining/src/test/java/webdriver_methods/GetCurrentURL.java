package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		//fetching the source code of the page
		System.out.println(driver.getPageSource());
		//closing the tabs
		driver.close();
		
	}
}
