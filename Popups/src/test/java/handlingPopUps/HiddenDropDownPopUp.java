package handlingPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDropDownPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='ng-tns-c69-9 ui-calendar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("22")).click();
		Thread.sleep(2000);
		driver.quit();
		////div[@class="ui-datepicker-title ng-tns-c69-9"]//following::a[.="11"]
		
		
	}

}
