package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {
	public static void main(String[] args) throws Exception {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//Navigate to the web
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(10000);
		//Enter UN and PWD
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123", Keys.ENTER);
		Thread.sleep(10000);
		//Verification
		WebElement homepage = driver.findElement(By.xpath("//h6"));
		if(homepage.isDisplayed())
		{
			System.out.println("Displayed-Status-Success");
		}
		else
		{
			System.out.println("Displayed-Status-Failed");
		}
		
		
	}
}