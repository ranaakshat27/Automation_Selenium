package Amazon_Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Amazon_Pages.Home_Page2;

public class HomePage_Test2 extends Home_Page2{
	HomePage_Test2 Homepage;
	
	@BeforeSuite
	public void launch() throws IOException, InterruptedException
	{
		initialisation();
		Homepage = new HomePage_Test2();		
	}
	
  @Test (priority = 1)
  public void Functionality() throws InterruptedException 
  {
	  Homepage.S_field().sendKeys(prop.getProperty("Search2"));
  }
  
  @Test (priority = 2)
  public void Search_button()
  {
	  Homepage.S_button();
  }
  
  @Test (priority = 3)
  public void Product() throws InterruptedException
  {
	  
      Homepage.product();
      Thread.sleep(1000);
      
  }
  
  @Test (priority = 4)
  public void Product_tab() throws InterruptedException
  {
	  Set <String> s1= driver.getWindowHandles();
	  Iterator <String> i = s1.iterator();
	  while(i.hasNext()) 
	  {
		  String child=i.next();
		  driver.switchTo().window(child);
	  }
	  
	  System.out.println(driver.getTitle());
  }
  
  @Test (priority = 5)
  public void Product_colour()
	{	  
	  Actions a = new Actions(driver);
	  WebElement product_colour = driver.findElement(By.xpath ("//img[@alt='Purple']"));
	  a.moveToElement(product_colour).click().build().perform();  
	}
	
  @Test (priority = 6)
  public void Product_size() throws InterruptedException
	{
	   Homepage.product_size();
	   Thread.sleep(2000);
	}
  
  @Test (priority = 7)
  public void Product_spec()
  {  
	  String s = driver.findElement(By.xpath("//div[@id='productOverview_feature_div']")).getText();
	  System.out.println("Specifications: " + s);
	  //Homepage.Total_cost().getText();
  }
  
  @Test (priority = 8)
  public void Add_Cart() throws InterruptedException
	  {		 
		  //Actions a = new Actions(driver);
		  System.out.println(" 2  "+driver.getTitle());
		  //Thread.sleep(2000);
		  //WebElement cart = driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']"));
		  //a.moveToElement(cart).click().build().perform();
		  Homepage.Add_to_cart();
		  Thread.sleep(4000);
	  }
  
  @Test (priority = 9)
  public void Cart() throws InterruptedException
  {
	  Homepage.view_cart();
	  Thread.sleep(2000);
  }
  
  @Test (priority = 10)
  public void Quantity() throws InterruptedException
  {  
	 Homepage.product_quantity();
	 Thread.sleep(4000);
  }
  
  @Test (priority = 11)
  public void Total_item()
  {  
	  String s1 = driver.findElement(By.xpath("//span[@class='a-size-medium sc-number-of-items']/../span[@id='sc-subtotal-label-buybox']")).getText();
	
	  System.out.println("Total items added to the cart: " + s1);
	  //Homepage.Total_items().getText();
  }
  
  @Test (priority = 12)
  public void Total_price()
  {  
	  String s2 = driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-buybox']")).getText();
	  System.out.println("Subtotal cost: " + s2);
	  //Homepage.Total_cost().getText();
  }
 
}

