package handlingPopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("dress");
        driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
        driver.findElement(By.xpath("(//li[contains(@class,'product-base')])[1]")).click();
        Thread.sleep(3000);
        Set<String> windows = driver.getWindowHandles();
        for(String id : windows)
        {
            driver.switchTo().window(id);
        }

        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
        Thread.sleep(3000);
        String title = driver.getTitle();

        if(title.contains("Myntra"))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
        }

        driver.quit();


	}

}
