package Boat_Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homepage_Testbase {
	public static WebDriver driver;
	public static Properties prop;
	
	public void Setup() throws IOException
	{
		try 
		{
			FileInputStream file = new FileInputStream("D:\\workSpace\\Project_Training\\src\\test\\java\\Configuration_Properties\\Boat_config_properties");
			prop = new Properties();
			prop.load(file);
			
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			ChromeOptions chromeoptions = new ChromeOptions();
			chromeoptions.addArguments("--remote-allow-origns=*","ignore-certificate-errors");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeoptions);
			
			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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
