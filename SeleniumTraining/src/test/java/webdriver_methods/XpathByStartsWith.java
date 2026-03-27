package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByStartsWith 
{
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[starts-with(text(),'Digital')]")).click();
		//driver.findElement(By.partialLinkText("//a[contains(text(),'Digital downloads') and @class]")).click();
		Thread.sleep(2000);
	    
	}

}

//a[contains(text(),'Digital downloads') and @class]

//a[starts-with(text(),'Digital


