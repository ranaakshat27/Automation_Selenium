package MMT_Tests;

import org.testng.annotations.Test;

import MMT_Pages.Hotels_Homepage;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;

public class Hotels_Test extends Hotels_Homepage {
	
	Hotels_Test Homepage; 
  
  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
	  Setup();
	  Homepage = new Hotels_Test();	  
  }
  
  @Test (priority = 1)
  public void logo_visibility() 
  {
	  String s = Homepage.logo().getText();
	  System.out.println("Logo is visible: " + s);
  }
  
  @Test (priority = 2)
  public void Flights_icon() throws InterruptedException 
  {
	  Homepage.flights();
	  System.out.println("Flights icon is visible");
	  Thread.sleep(2000);
  }
  
  @Test (priority = 3)
  public void Hotels_icon() throws InterruptedException 
  {
	  Homepage.hotels();
	  System.out.println("Hotels icon is visible");
	  Thread.sleep(3000);
  }
  
  @Test (priority = 4)
  public void Homestays_icon() throws InterruptedException 
  {
	  Homepage.homestays();
	  System.out.println("Homestays icon is visible");
	  Thread.sleep(4000);
  }
  
  @Test (priority = 5)
  public void Holiday_icon() throws InterruptedException 
  {
	  Homepage.holiday_pack();
	  System.out.println("Holiday Package icon is visible");
	  Thread.sleep(4000);
  }
  
  @Test (priority = 6)
  public void Trains_icon() throws InterruptedException 
  {
	  Homepage.trains();
	  System.out.println("Trains icon is visible");
	  Thread.sleep(4000);
  }
  
  @Test (priority = 7)
  public void Buses_icon() throws InterruptedException 
  {
	  Homepage.buses();
	  System.out.println("Buses icon is visible");
	  Thread.sleep(4000);
  }
  
  @Test (priority = 8)
  public void Cabs_icon() throws InterruptedException 
  {
	  Homepage.cabs();
	  System.out.println("Cabs icon is visible");
	  Thread.sleep(3000);
  }
  
  @Test (priority = 9)
  public void Forex_icon() throws InterruptedException 
  {
	  Homepage.forex();
	  System.out.println("Forex icon is visible");
	  Thread.sleep(3000);
  }
  
  @Test (priority = 10)
  public void Charters_icon() throws InterruptedException 
  {
	  Homepage.charter_flight();
	  System.out.println("Charter Flights icon is visible");
	  Thread.sleep(3000);
  }
  
  @Test (priority = 11)
  public void Activities_icon() throws InterruptedException 
  {
	  Homepage.activities();
	  System.out.println("Activities icon is visible");
	  Thread.sleep(3000);
  }

}
