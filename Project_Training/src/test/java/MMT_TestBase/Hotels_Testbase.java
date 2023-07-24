package MMT_TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hotels_Testbase {
	public static Properties prop;
	public static WebDriver driver;
	
	public void Setup() throws IOException
	{
		try 
		{
			FileInputStream file = new FileInputStream("D:\\workSpace\\Project_Training\\src\\test\\java\\Configuration_Properties\\MMT_Hotels_config_properties");
			prop = new Properties();
			prop.load(file);
			
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
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
