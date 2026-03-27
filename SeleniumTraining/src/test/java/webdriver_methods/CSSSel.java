package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSel 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".orangehrm-login-button")).click();
		Thread.sleep(2000);		

		driver.get("https://www.youtube.com/");
        Thread.sleep(5000);
        driver.findElement(By.name("search_query")).sendKeys("Epadi vanthayo" + Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
//        Thread.sleep(10000);
//        driver.quit();
	}

}
