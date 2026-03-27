package interrogation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetWindowHandles 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		String parentID = driver.getWindowHandle();
		System.out.println(parentID);
		driver.findElement(By.xpath("//h2[.='Watches']/..//button")).click();
		Thread.sleep(2000);
		Set<String> allWindowID = driver.getWindowHandles();
		System.out.println(allWindowID);
		System.out.println(allWindowID.remove(parentID));
		System.out.println(allWindowID);
		for(String string : allWindowID)
		{
			System.out.println(string);
		}
		driver.quit();

	}

}