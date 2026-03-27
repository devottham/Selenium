package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("automation");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tools");
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.quit();
		
	}

}
