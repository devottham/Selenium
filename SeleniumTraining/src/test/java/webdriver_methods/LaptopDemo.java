package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(3000);
        
        // Add 14.1-inch Laptop
        driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']" +"/ancestor::div[@class='product-item']" +"//input[@value='Add to cart']")).click();
        Thread.sleep(20000);
        driver.quit();
    }
}