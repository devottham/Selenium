package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingBrowser 
{
	public static void main(String[] args)
	{
		//Launching the browser
		//ChromeDriver driver = new ChromeDriver();
		//RemoteWebDriver driver = new ChromeDriver();//upcasted - not optimized version
		WebDriver driver = new ChromeDriver();//Effective one allows code optimization,runtime polymorphism,cross border testing.
		//WebDriver driver1 = new FirefoxDriver();//will open
		String browserString = "edge";
		WebDriver driver2 = null;
		if(browserString.contains("edge"))
		{
			driver2 = new EdgeDriver();
		}
		else if(browserString.contains("firefox"))
		{
			driver2 = new FirefoxDriver();
		}
		else if(browserString.contains("chrome"))
		{
			driver2 = new ChromeDriver();
		}

	}
}
