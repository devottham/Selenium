package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetMethod 
{
	public static void main(String[] args)
	{
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//Navigate to utube
		driver.get("https://youtube.com/");
		//fetching the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		driver.get("https://amazon.com/");
		System.out.println(driver.getTitle());
	}
}
