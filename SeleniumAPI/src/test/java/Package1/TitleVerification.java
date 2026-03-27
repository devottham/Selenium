package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String expectedTitle = "Demo Web Shop";
		String title = driver.getTitle();
		if(title.equals(expectedTitle))
		{
			System.out.println("Successful");
		}
		else 
		{
			System.out.println("Failed");
		}
		driver.quit();
	}

}
