package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Open eBay
        driver.get("https://www.ebay.com/");
        Thread.sleep(3000);
        // Search box using multiple attributes
        driver.findElement(By.xpath("//input[@id='gh-ac' and @name='_nkw']")).sendKeys("Laptop");
        Thread.sleep(3000);
        // Click search button using multiple attributes
        driver.findElement(By.xpath("//input[@id='gh-search-btn' and @class]")).click();
        Thread.sleep(4000);
        // Click first product using multiple attributes
        driver.findElement(By.xpath("(//a[@class='s-item__link' and @target='_blank'])[1]")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}