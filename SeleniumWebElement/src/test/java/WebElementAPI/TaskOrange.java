package WebElementAPI;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOrange 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
			try {
				driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(25000);
				driver.findElement(By.name("username")).sendKeys("Admin");
				driver.findElement(By.name("password")).sendKeys("admin123");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[type=\"submit\"]")).submit();
				Thread.sleep(4000);
		}
		catch (Exception e) {
			System.err.println(e);
		}
		finally 
		{
			driver.close();
		}
    }
}
