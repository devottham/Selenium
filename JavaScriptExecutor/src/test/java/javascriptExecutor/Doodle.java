package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Doodle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://doodles.google/");
		WebElement bday = driver.findElement(By.xpath("//div[.=\"When is your birthday?\"]"));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", bday);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)", bday);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()", bday);
		Thread.sleep(2000);
		
	}

}
