package interrogationmethods;



import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectangle 
{
	public static void main(String[] arg) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//locate
		WebElement registerLink = driver.findElement(By.linkText("Register"));
		System.out.println(registerLink.getRect());
		//fetch
		Rectangle rect = registerLink.getRect();
		System.out.println(rect.getDimension());
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.height);
		System.out.println(rect.width);
		
		// x and y offsets
		System.out.println(rect.getPoint());
		System.out.println(rect.getX());
		System.out.println(rect.x);
		System.out.println(rect.getY());
		System.out.println(rect.y);
		
		driver.quit();
		
		
	}

}
