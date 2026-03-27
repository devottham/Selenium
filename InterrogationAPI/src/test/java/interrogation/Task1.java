package interrogation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(3000);
        String parentId = driver.getWindowHandle();
        System.out.println("Parent Window ID: " + parentId);
        driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
        Thread.sleep(3000);
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("All Window IDs:");
        for (String id : allWindows) 
        {
            System.out.println(id);
        }

        driver.quit();
	}

}