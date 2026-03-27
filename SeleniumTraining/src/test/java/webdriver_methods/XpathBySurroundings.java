package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBySurroundings {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(3000);
        // Click on Computers
        driver.findElement(By.xpath("//a[starts-with(text(),'Computers')]")).click();
        Thread.sleep(2000);
        // Click on Desktops
        driver.findElement(By.xpath("//h1[contains(text(),'Computers')]/../..//a[contains(text(),'Desktops')]")).click();
        Thread.sleep(2000);
        // Click on Build your own computer 
        driver.findElement(By.xpath("//h2[@class='product-title']/a[text()='Build your own computer']")).click();
        Thread.sleep(3000);
        // Click Add to cart button using surroundings
        driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
1
        Thread.sleep(3000);

        driver.quit();
    }
}
