package handlingFileUploadPop;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		//option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.id("browNotButton")).click();
	}
}
