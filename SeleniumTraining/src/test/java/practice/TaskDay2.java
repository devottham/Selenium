package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/* Using xpath
    5 attribute
    
    5 text function
    
    5 contains
 */

public class TaskDay2 {
	
	public void attribute() {
		WebDriver driver = new EdgeDriver();
		
		try {
			driver.get("https://youtube.com");
			Thread.sleep(5000);
	
			driver.findElement(By.xpath("//input[@name=\"search_query\"]")).sendKeys("Ravanan Mavanda", Keys.ENTER);
			Thread.sleep(3000);
//			driver.findElement(By.xpath("//a[@id='video-title']")).click();
			driver.findElement(By.xpath("//yt-formatted-string[text()='Jana Nayagan - Raavana Mavandaa Lyrical | Thalapathy Vijay | Pooja Hegde | H Vinoth | Anirudh | KVN']")).click();
			
			Thread.sleep(8000);
			
			driver.get("https://demo.automationtesting.in/Register.html");
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]")).sendKeys("Sanjai");
			driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys("Kumar");
			
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
//			driver.quit();
		}
	}
	
	public void attribute2() {
		WebDriver driver = new EdgeDriver();
		
		try {
			driver.get("https://www.github.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@data-target=\"qbsearch-input.inputButtonText\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("query-builder-test")).sendKeys("sanjai451", Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class=\"Link__StyledLink-sc-1syctfj-0 prc-Link-Link-9ZwDx\"]")).click();
			System.out.println("Title : " + driver.getTitle());
			driver.findElement(By.id("_R_75ab_")).click();
			Thread.sleep(1000);
//			driver.findElement(By.xpath("//span[text()='Download ZIP']")).click(); // Working
//			driver.findElement(By.xpath("//button[@aria-labelledby=\"_r_o_\"]")).click(); // not working
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e);			
		}
		finally {
			
//			driver.close();
		}
	}
	
	public void usingContains() {
		WebDriver driver = new EdgeDriver();
		
		try {
			driver.get("https://www.github.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'View page as Markdown')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'The GitHub Terms of Service')]")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e);			
		}
		finally {
			
			driver.quit();
		}
	}
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		try {
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			System.out.println("Title : " + driver.getTitle());
			driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
			Thread.sleep(3000);
			System.out.println("Title : " + driver.getTitle());
			driver.findElement(By.xpath("//span[text()=\"Smartwatches\"]")).click();
			Thread.sleep(2000);
			System.out.println("Title : " + driver.getTitle());
			driver.findElement(By.xpath("//span[text()=\"All Discounts\"]")).click();
			Thread.sleep(2000);
			System.out.println("Title : " + driver.getTitle());
			driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();
			Thread.sleep(2000);
			System.out.println("Title : " + driver.getTitle());
			driver.findElement(By.xpath("//button[text()=\"Lightning Deals\"]")).click();
			Thread.sleep(3000);
			System.out.println("Title : " + driver.getTitle());
		} catch (Exception e) {
			System.out.println(e);			
		}
		finally {
			
			driver.quit();
		}
	}
}