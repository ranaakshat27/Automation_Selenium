package Amazon_Test;

import java.io.IOException;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Amazon_Pages.Home_Page;

public class HomePage_Test extends Home_Page {
	HomePage_Test HomePage;
	
	@BeforeSuite
	public void launch() throws IOException, InterruptedException
	{
		initialisation();
		HomePage = new HomePage_Test();		
	}
	
	@Test (priority = 1)
	public void Logo() throws InterruptedException
	{
		String s = HomePage.logo().getText();
		System.out.println("Logo: " + s);
	}
		
	@Test (priority = 2)
	public void Search_Field()
	{
		HomePage.search_field().sendKeys(prop.getProperty("Search"));
		System.out.println("Search field is clearly visible");
	}
	
	@Test (priority = 3)
	public void Search_Button() throws InterruptedException
	{		
		HomePage.search_button();
		System.out.println("Search button is clearly visible");
		Thread.sleep(1000);
		driver.navigate().back();
	}
	
	@Test (priority = 4)
	public void Acc_lists_button()
	{
		HomePage.Acc_lists();
		System.out.println("Account & Lists button is clearly visible");
	}
	
	@Test (priority = 5)
	public void Cart_button() throws InterruptedException
	{
		HomePage.cart();
		System.out.println("Amazon Cart is clearly visible");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	@Test (priority = 6)
	public void All_menu_button() throws InterruptedException
	{
		HomePage.All();
		System.out.println("All menu button is clearly visible");
		Thread.sleep(1000);
	}
	
	@Test (priority = 7)
	public void Close_element() throws InterruptedException
	{
		HomePage.Close();
		Thread.sleep(2000);
	}
	
	@Test (priority = 8)
	public void Previous_slide_button() throws InterruptedException
	{
		HomePage.Previous();
		Thread.sleep(2000);
	}
	
	@Test (priority = 9)
	public void Next_slide_button() throws InterruptedException
	{
		HomePage.Next();
		Thread.sleep(2000);
	}
	
	@Test (priority = 10)
	public void Footer_element()
	{	
		Actions a = new Actions(driver);
		WebElement Footer=driver.findElement(By.xpath("//a[@id='navBackToTop']"));
		a.moveToElement(Footer).click().build().perform();
		
		String ActualResult = "User should back to top of the page";
		String ExpectedResult = "User is not reflecting to the top of the page"; 		
		Assert.assertEquals(ExpectedResult, ActualResult, "Not working properly");
		
	}

}
