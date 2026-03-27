package selectClass;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.id("Skills"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(9);
		sel.selectByValue("Data Analytics");
		Thread.sleep(2000);
		sel.selectByVisibleText("Engineering");
		Thread.sleep(2000);
		sel.selectByContainsVisibleText("script");
	    List<WebElement> allOpt = sel.getOptions();
	    for(WebElement opt : allOpt)
	    {
	    	System.out.println(opt.getText());
	    }
		driver.quit();
	}

}
