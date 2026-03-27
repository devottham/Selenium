package WebElementAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextField 
{
 public static void main(String[] args) throws InterruptedException
 {
	 WebDriver driver  = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demo.automationtesting.in/Register.html");
	 Thread.sleep(2000);
	 WebElement firstname = driver.findElement(By.cssSelector("[placeholder='First Name']"));
	 firstname.sendKeys("Devo");
	 WebElement lastname = driver.findElement(By.cssSelector("[placeholder='Last Name']"));
	 Thread.sleep(2000);
	 firstname.clear();
	 firstname.sendKeys("Devottham");
	 lastname.sendKeys("D K");
	 Thread.sleep(2000);
	 driver.quit();
	 
 }
}
