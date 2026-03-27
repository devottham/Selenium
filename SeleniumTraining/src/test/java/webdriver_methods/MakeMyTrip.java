package webdriver_methods;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip{

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://www.makemytrip.com/");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//body")).click();
        Thread.sleep(3000);

//        driver.findElement(By.xpath("//a[@href='/superOffersTab_ALL/']")).click();
//        Thread.sleep(5000);

        driver.findElement(By.xpath("//p[contains(text(), \"For Your Dream Europe Trip: Get Up to 40%OFF*\")]/parent::div/parent::div/parent::div/child::div[@class=\"sliderFoot\"]/child::div/child::a")).click();
        Thread.sleep(5000);

        //driver.quit();
    }
}