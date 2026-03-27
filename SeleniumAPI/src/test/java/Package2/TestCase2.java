package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 
{

    public static void main(String[] args) throws InterruptedException 
    {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//span[text()='Admin']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()=' Add ']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='Admin']")).click();
        Thread.sleep(2000);

        String role1 = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).getText();
        System.out.println(role1);

        driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='ESS']")).click();
        Thread.sleep(2000);

        String role2 = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).getText();
        System.out.println(role2);

        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//img[@alt=\"profile picture\"]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Logout']")).click();

        driver.quit();
    }
}