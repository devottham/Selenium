package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 
{
    public static void main(String[] args) throws InterruptedException 
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://icehrmpro.gamonoid.com/login.php");
        driver.findElement(By.cssSelector("[class='btn btn-info btn-medium w-100 text-uppercase']")).click();
        driver.findElement(By.id("username")).sendKeys("user");
        driver.findElement(By.id("password")).sendKeys("pwd");
        driver.findElement(By.cssSelector("[class='btn btn-info btn-medium w-100 text-uppercase']")).click();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin");
        driver.findElement(By.cssSelector("[class='btn btn-info btn-medium w-100 text-uppercase']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Employees']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@href,'admin_Employees')]")).click();
        driver.findElement(By.id("tabEmployeeSkill")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text() =(' Add New')]/..")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("rc_select_1")).sendKeys("IceHrm Employee");
        Thread.sleep(1000);
        driver.findElement(By.id("rc_select_1")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("rc_select_2")).sendKeys("Databases");
        Thread.sleep(1000);
        driver.findElement(By.id("rc_select_2")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("details")).sendKeys("Testing...");
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[class='glyphicon glyphicon-user']")).click();
        driver.findElement(By.xpath("//a[text()='Sign out']")).click();
        Thread.sleep(5000);
        driver.quit();
       
    }
}