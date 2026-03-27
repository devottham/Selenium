package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningDeselectMethods 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);
	    Select sel = new Select	(driver.findElement(By.id("select-multiple-native")));
	    sel.selectByVisibleText("White Gold Plated Pr...");
	    sel.selectByVisibleText("Solid Gold Petite Mi...");
	    sel.selectByVisibleText("Pierced Owl Rose Gol...");
	    sel.selectByVisibleText("John Hardy Women's L...");
	    Thread.sleep(2000);
	    sel.deselectByIndex(6);
	    Thread.sleep(2000);
	    sel.deselectByValue("John Hardy Women's Legends Naga Gold & Silver Dragon Station Chain Bracelet");
	    Thread.sleep(2000);
	    sel.selectByContainsVisibleText("Pierced Owl Rose Gol...");
	    Thread.sleep(2000);
	    sel.selectByVisibleText("White Gold Plated Pr...");
	    sel.selectByVisibleText("Solid Gold Petite Mi...");
	    sel.selectByVisibleText("Pierced Owl Rose Gol...");
	    sel.selectByVisibleText("John Hardy Women's L...");
	    Thread.sleep(2000);
	    driver.quit();
	}

}
