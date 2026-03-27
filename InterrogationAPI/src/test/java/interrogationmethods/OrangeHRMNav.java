package interrogationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMNav
{
    public static void main(String[] args) throws InterruptedException
      {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[starts-with(@name,'user')]")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@name, 'pass')]")).sendKeys("admin123");
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Change Password']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        System.out.println("Current URL: " + driver.getCurrentUrl());
        driver.quit();
    }
}