package interrogationmethods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize 
{
	public static void main(String[] arg) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		Dimension dims = searchBtn.getSize();
		System.out.println(dims);
		System.out.println(dims.getHeight());
		System.out.println(dims.height);
		System.out.println(dims.getWidth());
		System.out.println(dims.width);
		System.out.println(searchBtn.getCssValue("height"));
	}

}
