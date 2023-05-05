package Naukri_TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Register_Testbase {
	public static WebDriver driver;
	public static Properties prop;
	
	public void Initialisation() throws IOException
	{
		try 
		{
			FileInputStream file = new FileInputStream("D:\\workSpace\\Project_Training\\src\\test\\java\\Configuration_Properties\\Naukri_config_properties");
			prop = new Properties();
			prop.load(file);
			
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();		
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
	}
	
	public void Quit()
	{
		driver.quit();
	}

}
