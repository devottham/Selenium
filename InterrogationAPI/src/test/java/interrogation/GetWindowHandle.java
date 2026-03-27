package interrogation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetWindowHandle 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle());
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getWindowHandle());
		Thread.sleep(2000);
		driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		System.out.println(driver.getWindowHandle());//fetching unique 32 char unique ID it is taking the same tab id's
		driver.quit();
	}

}
