package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

    public static void main(String[] args) throws InterruptedException {

        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1. Navigate to OrangeHRM
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(6000);

        // 2. Enter valid credentials
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

        // 3. Click Login
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        // 4. Click PIM module
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        Thread.sleep(3000);

        // 5. Type employee name
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"))
              .sendKeys("Devottham");

        // 6. Click Search
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        // 7. Verify employee name is displayed
        boolean result = driver.findElement(
                By.xpath("//div[contains(text(),'Devottham')]"))
                .isDisplayed();

        if(result) {
            System.out.println("Employee Found - Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        //driver.quit();
    }
}