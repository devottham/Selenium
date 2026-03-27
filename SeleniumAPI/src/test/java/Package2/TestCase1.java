package Package2;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 
{

    public static void main(String[] args) throws InterruptedException 
    {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(4000);

        String parent = driver.getWindowHandle();

        driver.findElement(By.partialLinkText("OrangeHRM")).click();
        Thread.sleep(4000);

        Set<String> windows = driver.getWindowHandles();

        for(String id : windows)
        {
            if(!id.equals(parent))
            {
                driver.switchTo().window(id);
            }
        }

        String url = driver.getCurrentUrl();
        System.out.println(url);

        String title = driver.getTitle();
        System.out.println(title);

        driver.close();

        driver.switchTo().window(parent);

        if(driver.findElement(By.name("username")).isDisplayed())
        {
            System.out.println("Login displayed");
        }

        driver.quit();
    }
}