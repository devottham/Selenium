package handlingPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Alert with Textbox")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[class='btn btn-info']")).click();
        Thread.sleep(2000);
        Alert prompt = driver.switchTo().alert();
        System.out.println(prompt.getText());
        prompt.sendKeys("dev");
        prompt.accept();
	}

}
