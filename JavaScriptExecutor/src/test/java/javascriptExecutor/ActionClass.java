package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		WebElement element = driver.findElement(By.id("circle"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(element).build().perform();  
		actions.moveToElement(element).clickAndHold().pause(4000).release().perform();
		
		
		
	}

}
