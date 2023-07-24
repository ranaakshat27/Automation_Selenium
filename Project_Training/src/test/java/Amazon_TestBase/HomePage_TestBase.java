package Amazon_TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage_TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public void initialisation() throws IOException, InterruptedException {
		try 
		{
			FileInputStream f = new FileInputStream("D:\\workSpace\\Project_Training\\src\\test\\java\\Configuration_Properties\\Amazon_config_properties");
			prop = new Properties();
			prop.load(f);
			
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();
			Thread.sleep(2000);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
		
	}
	
	public void terminate()
	{
		driver.quit();
	}

}
