package handlingPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUps 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Alert with OK & Cancel")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[class='btn btn-primary']")).click();
        Alert popup = driver.switchTo().alert();
        System.out.println(popup.getText());
        popup.dismiss();
	}

}
