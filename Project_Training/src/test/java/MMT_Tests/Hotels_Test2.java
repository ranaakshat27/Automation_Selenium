package MMT_Tests;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import MMT_Pages.Hotels_Homepage;

public class Hotels_Test2 extends Hotels_Homepage {
	
	Hotels_Test2 Homepage; 
	
  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
	  Setup();
	  Homepage = new Hotels_Test2();	  
  }
  
  @Test (priority = 1)                    
  public void Hotels_Upto_button() throws InterruptedException 
  {
	  Homepage.hotels();
	  Thread.sleep(2000);
	  Homepage.upto_5rooms();
  }
  
  @Test (priority = 2)
  public void City_button() throws InterruptedException 
  {
	  Homepage.city_box();
	  Thread.sleep(3000);
  }
  
  @Test (priority = 3)
  public void City_drop() throws InterruptedException 
  {
	  Homepage.city_dropdown();
	  Thread.sleep(4000);
  }
  
  @Test (priority = 4)
  public void City_field() throws InterruptedException 
  {
	  Homepage.city_box();
	  Thread.sleep(3000);
	  Homepage.enter_city().sendKeys(prop.getProperty("City"));
	  Thread.sleep(4000);
	  Homepage.city_dropdown();
	  Thread.sleep(5000);
  }
  
  @Test (priority = 5, enabled = false)
  public void Checkin_button() throws InterruptedException 
  {
	  Homepage.checkin_box();
	  Thread.sleep(4000);
  }
  
  @Test (priority = 6)
  public void Checkin_dropdown() throws InterruptedException 
  {
	  Homepage.checkin_dropbox();
	  Thread.sleep(4000);
  }
  
  @Test (priority = 7, enabled = false)
  public void Checkout_button() throws InterruptedException 
  {
	  Homepage.checkout_box();
	  Thread.sleep(5000);
  }
  
  @Test (priority = 8)
  public void Checkout_dropdown() throws InterruptedException 
  {
	  Homepage.checkout_dropbox();
	  Thread.sleep(4000);
  }
  
  @Test (priority = 9, enabled = false)
  public void Rooms_Guest_button() throws InterruptedException 
  {
	  Homepage.rooms_guest();
	  Thread.sleep(5000);
  }
  
  @Test (priority = 10)
  public void Rooms_button() throws InterruptedException 
  {
	  Homepage.rooms_count();
	  Thread.sleep(4000);
  }
  
  @Test (priority = 11)
  public void Rooms_dropdown() throws InterruptedException 
  {
	  Homepage.rooms_total();
	  Thread.sleep(3000);
  }
  
  @Test (priority = 12)
  public void Adults_button() throws InterruptedException 
  {
	  Homepage.adults_count();
	  Thread.sleep(4000);
  }
  
  @Test (priority = 13)
  public void Adults_dropdown() throws InterruptedException 
  {
	  Homepage.adults_total();
	  Thread.sleep(3000);
  }
  
  @Test (priority = 14)
  public void Children_button() throws InterruptedException 
  {
	  Homepage.children_count();
	  Thread.sleep(4000);
  }
  
  @Test (priority = 15)
  public void Children_dropdown() throws InterruptedException 
  {
	  Homepage.children_total();
	  Thread.sleep(2000);
  }
  
  @Test (priority = 16)
  public void Apply_button() throws InterruptedException 
  {
	  Homepage.apply_button();
	  Thread.sleep(2000);
  }
  
  @Test (priority = 17)
  public void Price_Per_Night() throws InterruptedException 
  {
	  Homepage.price_box();
	  Thread.sleep(4000);
  }
  
  @Test (priority = 18)
  public void Price_dropdown() throws InterruptedException 
  {
	  Homepage.Price_range();
	  Thread.sleep(4000);
  }
  
  @Test (priority = 19)
  public void Search_button() 
  {
	  Homepage.search_button();
  }

}
