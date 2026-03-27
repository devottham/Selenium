package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		
		WebElement listbox = driver.findElement(By.id("cars"));
		Select sel = new Select(listbox);
		sel.selectByVisibleText("Audi");
		sel.selectByVisibleText("Saab");
		sel.selectByVisibleText("Volvo");
		List<WebElement> allSelectedOpts = sel.getAllSelectedOptions();
		for(WebElement opt : allSelectedOpts)
		{
			System.out.println(opt.getText());
		}
		
		driver.quit();
	}


}
