package Naukri_Tests;

import org.testng.annotations.Test;

import Naukri_Pages.Register_Homepage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

public class Register_Test extends Register_Homepage {
	Register_Test Homepage;
	
  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
	  Initialisation();
	  Homepage = new Register_Test();	  
  }
  
  @Test (priority = 1)
  public void logo_visibility() 
  {
	boolean logo = Homepage.logo().isDisplayed();
	System.out.println("Logo is visible: " + logo);
	Assert.assertTrue(logo);
  }
  
  @Test (priority = 2)
  public void full_name() throws InterruptedException 
  {
	  Homepage.name().sendKeys(prop.getProperty("Name"));
	  String Title = driver.getTitle();
	  Assert.assertEquals(Title, "Register on Naukri.com: Apply to Millions of Jobs Online", "Full Name field is not visible");
	  System.out.println("Full Name field is visible");
	  Thread.sleep(2000);
  }
  
  @Test (priority = 3)
  public void email_id() throws InterruptedException 
  {
	  Homepage.email().sendKeys(prop.getProperty("Email"));
	  String Title = driver.getTitle();
	  Assert.assertEquals(Title, "Register on Naukri.com: Apply to Millions of Jobs Online", "Email id field is not visible");
	  System.out.println("Email id field is visible");
	  Thread.sleep(2000);
  }
  
  @Test (priority = 4)
  public void Password() throws InterruptedException 
  {
	  Homepage.password().sendKeys(prop.getProperty("Password"));
	  String Title = driver.getTitle();
	  Assert.assertEquals(Title, "Register on Naukri.com: Apply to Millions of Jobs Online", "Password field is not visible");
	  System.out.println("Password field is visible");
	  Thread.sleep(2000);
  }
  
  @Test (priority = 5)
  public void mobile_no() throws InterruptedException 
  {
	  Homepage.phone().sendKeys(prop.getProperty("Number"));
	  String Title = driver.getTitle();
	  Assert.assertEquals(Title, "Register on Naukri.com: Apply to Millions of Jobs Online", "Mobile no field is not visible");
	  System.out.println("Mobile no field is visible");
	  Thread.sleep(2000);
  }
  
  @Test (priority = 6)
  public void work_exp() throws InterruptedException 
  {
	  Homepage.workexp();
	  String Title = driver.getTitle();
	  Assert.assertEquals(Title, "Register on Naukri.com: Apply to Millions of Jobs Online", "Work status box for experienced is not visible");
	  System.out.println("Work status box for experienced is visible");
	  Thread.sleep(2000);
  }
  
  @Test (priority = 7)
  public void work_fresh() throws InterruptedException 
  {
	  Homepage.workfresh();
	  String Title = driver.getTitle();
	  Assert.assertEquals(Title, "Register on Naukri.com: Apply to Millions of Jobs Online", "Work status box for fresher is not visible");
	  System.out.println("Work status box for fresher is visible");
	  Thread.sleep(2000);
  }
  
  @Test (priority = 8)
  public void current_city() throws InterruptedException 
  {
	  Homepage.city().sendKeys(prop.getProperty("City"));
	  String Title = driver.getTitle();
	  Assert.assertEquals(Title, "Register on Naukri.com: Apply to Millions of Jobs Online", "Current city field is not visible");
	  System.out.println("Current city field is visible");
	  Thread.sleep(2000);	  
  }
  
  @Test (priority = 9)
  public void city_dropdown() throws InterruptedException
  {
	    Homepage.city_drop();
	    String Title = driver.getTitle();
		Assert.assertEquals(Title, "Register on Naukri.com: Apply to Millions of Jobs Online", "Current city drop down list is not visible");
	    System.out.println("Current city drop down list is visible");
	    Thread.sleep(3000);
  }
  
  @Test (priority = 9, enabled = false)
  public void suggestions() 
  {
	  String s = driver.findElement(By.xpath("//div[@class='initialLocation-section']")).getText();
	  System.out.println("City suggestions: " + s);
  }
  
  @Test (priority = 10)
  public void resume_upload() throws InterruptedException 
  {
	  Homepage.resume().sendKeys("C:\\Users\\rakshat\\Desktop\\Upload.rtf");
	  System.out.println("Resume button is visible");
	  Thread.sleep(3000);
	  System.out.println("File uploaded");
  }
  
  @Test (priority = 11)
  public void register_now() 
  {
	  Homepage.register();
	  String s = driver.getCurrentUrl();
	  Assert.assertEquals(s, "https://www.naukri.com/registration/createAccount?", "Register now button is not visible");
	  System.out.println("Register now button is visible");
  }
  
}
