package handlingFileUploadPop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/registration/createAccount?");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[contains(text(),'  I have work experience (excluding internships)')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Our_Power\\Downloads\\Devottham D K - Sign.pdf");
        Thread.sleep(3000);
        driver.quit();
		
	}

}
