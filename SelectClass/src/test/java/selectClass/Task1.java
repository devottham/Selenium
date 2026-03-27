package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 
{
	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(3000);
        WebElement dropdown = driver.findElement(By.id("cars"));
        Select select = new Select(dropdown);

        if(select.isMultiple()) 
        {
            System.out.println("Dropdown is Multi Select");
        } 
        else 
        {
            System.out.println("Dropdown is Single Select");
        }

        driver.quit();
    }

}
