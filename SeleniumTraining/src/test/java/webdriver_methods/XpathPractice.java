package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/login1.0?sublist=0&scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username:']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pwd");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		driver.get("https://github.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='flex-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='query-builder-test']")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ActionListItem-label text-normal']")).click();
		
		
	}

}
