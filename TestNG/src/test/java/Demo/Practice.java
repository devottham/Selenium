package Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Practice{

	@Test
	public void readData() throws IOException
	{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Our_Power\\SeleniumTraining\\TestNG\\src\\test\\resources\\OrangeHRM_Common_Data\\commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("url");
		String browser = prop.getProperty("browser");
		String validUserName = prop.getProperty("username");
		String validPassword = prop.getProperty("password");
		
		
		
		System.out.println("The default browser for testing is:"+browser);
		System.out.println("The url of the application for testing is:"+url);
		System.out.println("The valid user name of the application for testing is:"+validUserName);
		System.out.println("The valid password of the application for testing is:"+validPassword);
		
		
		
		
	}
	//.src\test\resources\OrangeHRM_Common_Data\commondata.properties

}
