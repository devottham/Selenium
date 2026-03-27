package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdMethod {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1️ Google
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
        Thread.sleep(2000);

        // 2️ Quora
        driver.get("https://www.quora.com/login");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        Thread.sleep(2000);

        // 3️ LinkedIn
        driver.get("https://www.linkedin.com/login");
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("linkedin@test.com");
        Thread.sleep(2000);

        // 4️ Amazon
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
        Thread.sleep(2000);

        // 5️ Etsy
        driver.get("https://accounts.spotify.com/en/login");
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("test@gmail.com");
        Thread.sleep(2000);

        // 6️ Wikipedia
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(2000);
        driver.findElement(By.id("searchInput")).sendKeys("Java Programming");
        Thread.sleep(2000);

        // 7️ RedBus
        driver.get("https://www.redbus.in/");
        Thread.sleep(3000);
        driver.findElement(By.id("srcinput")).sendKeys("Chennai");
        Thread.sleep(2000);

        // 8️ Pinterest
        driver.get("https://www.pinterest.com/login/");
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        Thread.sleep(2000);

        // 9️ Wordpress
        driver.get("https://wordpress.com/log-in");
        Thread.sleep(4000);
        driver.findElement(By.id("usernameOrEmail")).sendKeys("user");
        Thread.sleep(2000);

        // 10 Quora
        driver.get("https://www.quora.com/login");
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        Thread.sleep(2000);

        driver.quit();
    }
}