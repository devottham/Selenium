package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FLName {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder='First Name']"))
              .sendKeys("user");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder='Last Name']"))
              .sendKeys("useree");

        Thread.sleep(2000);

        driver.close();
    }
}