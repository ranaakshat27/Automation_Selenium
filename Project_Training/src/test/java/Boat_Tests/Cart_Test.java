package Boat_Tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Boat_Pages.Boat_Cartpage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Cart_Test extends Boat_Cartpage {
	Cart_Test cartpage;
	public ExtentTest test;
	public ExtentReports extent;
	String actual;
	String title;
	
  
  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
	  Setup();
	  cartpage = new Cart_Test();
  }
  
  @BeforeTest
	public void x() 
	{
		//extent=new ExtentReports("D:\\workSpace\\Project_Training\\Extent_report\\Boat_Cart.html",true);	
		extent=new ExtentReports("C:\\Users\\rakshat\\.jenkins\\workspace\\ExtentBuild\\ExtentReportUsingJenkins.html",true);
	}

	@AfterTest
	public void y() 
	{
		extent.endTest(test);
		extent.flush();
	}

  
  @Test (priority = 1)
  public void Cart_Button() throws InterruptedException 
  {
	  test=extent.startTest("Verify whether cart button clicks Successfully");
	  test.log(LogStatus.INFO, "Cart button click is initiated");
	  cartpage.Cart();
	  title = driver.getCurrentUrl();
	  actual = "https://www.boat-lifestyle.com/";
	  Assert.assertEquals(title, actual, "Cart button is not visible");
	  Thread.sleep(2000);
  }
  
  @Test (priority = 2)
  public void Start_Button() throws InterruptedException
  {
	  test=extent.startTest("Verify whether cart start shopping button clicks Successfully");
	  test.log(LogStatus.INFO, "Cart start shopping button click is initiated");
	  cartpage.Start();
	  String title = driver.getCurrentUrl();
	  Assert.assertEquals(title, "https://www.boat-lifestyle.com/collections", "Start Shopping is not visible");
	  Thread.sleep(2000);
  }
  
  @Test (priority = 3)
  public void Wireless_Earbuds() throws InterruptedException
  {
	  test=extent.startTest("Verify whether collections page visible and wireless earbuds icon clicks Successfully");
	  test.log(LogStatus.INFO, "wireless earbuds icon click is initiated");
	  cartpage.Earbuds();
	  String title = driver.getCurrentUrl();
	  Assert.assertEquals(title, "https://www.boat-lifestyle.com/collections/true-wireless-earbuds", "Wireless Earbuds is not visible");
	  Thread.sleep(2000);  
  }
  
  @Test (priority = 4)
  public void Product1_Airdopes() throws InterruptedException
  {
	  test=extent.startTest("Verify whether airdopes 161 product button clicks Successfully");
	  test.log(LogStatus.INFO, "Airdopes 161 product button click is initiated");
	  cartpage.Product1();
	  String title = driver.getCurrentUrl();
	  Assert.assertEquals(title, "https://www.boat-lifestyle.com/products/airdopes-161", "Airdopes is not visible");
	  Thread.sleep(2000);  
  }
  
  @Test (priority = 5)
  public void Product1_Color() throws InterruptedException
  {
	  test=extent.startTest("Verify whether airdopes 161 product color button clicks Successfully");
	  test.log(LogStatus.INFO, "Airdopes 161 product color button click is initiated");
	  cartpage.Color1();
	  String title = driver.getCurrentUrl();
	  Assert.assertEquals(title, "https://www.boat-lifestyle.com/products/airdopes-161", "Airdopes color box is not visible");
	  Thread.sleep(2000);  
  }
  
  @Test (priority = 6)
  public void Product1_Quantity_add() throws InterruptedException
  {
	  test=extent.startTest("Verify whether airdopes 161 product quantity button to add clicks Successfully");
	  test.log(LogStatus.INFO, "Airdopes 161 product quantity button to add click is initiated");
	  cartpage.Quantity1add();
	  String title = driver.getCurrentUrl();
	  Assert.assertEquals(title, "https://www.boat-lifestyle.com/products/airdopes-161", "Airdopes quantity box to add is not visible");
	  Thread.sleep(2000);  
  }
  
  @Test (priority = 7)
  public void Product1_Quantity_remove() throws InterruptedException
  {
	  test=extent.startTest("Verify whether airdopes 161 product quantity button to remove clicks Successfully");
	  test.log(LogStatus.INFO, "Airdopes 161 product quantity button to remove click is initiated");
	  cartpage.Quantity1remove();
	  String title = driver.getCurrentUrl();
	  Assert.assertEquals(title, "https://www.boat-lifestyle.com/products/airdopes-161", "Airdopes quantity box to remove is not visible");
	  Thread.sleep(2000);  
  }
  
  @Test (priority = 8)
  public void Product1_Price() throws InterruptedException
  {
	  test=extent.startTest("Verify whether airdopes 161 product price is displayed Correctly");
	  test.log(LogStatus.INFO, "Airdopes 161 product price is correctly displayed");
	  String expected = cartpage.Price1().getText();
	  String actual = driver.findElement(By.xpath("//div[@class='product-meta__price-list-container d-lg-block']")).getText();
	  Assert.assertEquals(expected, actual, "Product price is not visible");
	  Thread.sleep(2000);  
  }
  
  @Test (priority = 9)
  public void Addtocart() throws InterruptedException
  {
	  test=extent.startTest("Verify whether add to cart button clicks Successfully");
	  test.log(LogStatus.INFO, "Add to cart button click is initiated");
	  cartpage.Add_Cart();
	  String title = driver.getCurrentUrl();
	  Assert.assertEquals(title, "https://www.boat-lifestyle.com/products/airdopes-161", "Cart box is not visible");
	  Thread.sleep(2000);
  }
  
  @Test (priority = 10)
  public void Cartitem()
  {
	  test=extent.startTest("Verify whether cart item is displayed Correctly");
	  test.log(LogStatus.INFO, "Cart item is correctly displayed");
	  String expected = cartpage.Cart_item().getText();
	  String actual = driver.findElement(By.xpath("//div[@class='line-item__content-wrapper']")).getText();
	  Assert.assertEquals(expected, actual, "Cart product is not visible");
  }
  
  @Test (priority = 11)
  public void Cartprice() throws InterruptedException
  {
	  test=extent.startTest("Verify whether cart total price is displayed correctly"); 
	  test.log(LogStatus.INFO, "Cart total price is correctly displayed");
	  String expected = cartpage.Cart_price().getText();
	  String actual = driver.findElement(By.xpath("//span[@class='cart-total-text total-price']")).getText();
	  Assert.assertEquals(expected, actual, "Cart product is not visible");
	  Thread.sleep(2000);
  }
  
  @Test (priority = 12)
  public void Confirmorder() throws InterruptedException
  {
	  test=extent.startTest("Verify whether cart confirm order button clicks Successfully");
	  test.log(LogStatus.INFO, "Cart confirm order button click is initiated");
	  cartpage.Confirm_order();
	  String title = driver.getCurrentUrl();
	  Assert.assertEquals(title, "https://www.boat-lifestyle.com/products/airdopes-161", "Confirm order box is not visible");
	  Thread.sleep(2000);
	  driver.navigate().refresh();
  }
  
  @AfterMethod
	public void run1(ITestResult result) throws IOException
	{

			if(result.getStatus() == ITestResult.FAILURE) 
			{
				String screenShotPath = Get_Screenshot.capture(driver, "screenShotName");
				test.log(LogStatus.FAIL, result.getThrowable());
				test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			}
			else
			{
				test.log(LogStatus.PASS,"pages as well as functionality is working properly");
			}
		}

}
