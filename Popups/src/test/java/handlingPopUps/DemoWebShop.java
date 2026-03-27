package handlingPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("computer");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        Thread.sleep(3000);
        driver.quit();
	}

}
