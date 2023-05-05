package Boat_Tests;

import org.testng.annotations.Test;

import Boat_Pages.Boat_Homepage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

public class Homepage_Test1 extends Boat_Homepage{
	Homepage_Test1 homepage;
  
  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
	  Setup();
	  homepage = new Homepage_Test1();	  
  }
  
  @Test (priority = 1)
  public void logo_visibility() 
  {
	  boolean logo = homepage.Logo().isDisplayed();
	  System.out.println("Logo is visible: " + logo);
	  Assert.assertTrue(logo, "Logo is not visible");
  }
  @Test (priority = 2)
  public void Category() throws InterruptedException
  {
	  homepage.Categories();
	  Thread.sleep(4000);
  }
  @Test (priority = 3)
  public void DailyDeals() throws InterruptedException
  {
	  homepage.Daily_Deals();
	  String title = driver.getCurrentUrl();
	  Assert.assertEquals(title, "https://www.boat-lifestyle.com/collections/daily-deals", "Daily Deals header button is not visible");
	  driver.navigate().back();
	  Thread.sleep(2000);	  
  }
  @Test (priority = 4)
  public void GiftWithBoat() throws InterruptedException
  {
	  homepage.Gift_With_Boat();
	  String title = driver.getCurrentUrl();
	  Assert.assertEquals(title, "https://www.boat-lifestyle.com/pages/quiz", "Gift With Boat header button is not visible");
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 5)
  public void More_() throws InterruptedException
  {
	  homepage.More();
	  Thread.sleep(1000);
  }
  @Test (priority = 6)
  public void Search_() throws InterruptedException
  {
	  homepage.Search().sendKeys(prop.getProperty("Product"));
	  Thread.sleep(1000);
  }
  @Test (priority = 7)
  public void Account_() throws InterruptedException
  {
	  homepage.Account();
	  Thread.sleep(1000);
  }
  @Test (priority = 8)
  public void Cart_() throws InterruptedException
  {
	  homepage.Cart();
	  Thread.sleep(2000);
	  driver.navigate().refresh();
  }
  @Test (priority = 9)
  public void DotsSlider() throws InterruptedException
  {
	  Actions scrol = new Actions(driver);
	  WebElement Dots_Slider = driver.findElement(By.xpath("//ul[@class='MultiCarousel_dots_container']/li[3]"));
	  scrol.moveToElement(Dots_Slider).click().build().perform();
	  Thread.sleep(2000);
  }
  @Test (priority = 10)
  public void CategoryEarbuds() throws InterruptedException
  {
	  homepage.Category_Earbuds();
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 11)
  public void CategoryNeckbands() throws InterruptedException
  {
	  homepage.Category_Neckbands();
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 12)
  public void CategorySmartWatches() throws InterruptedException
  {
	  homepage.Category_SmartWatches();
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 13)
  public void CategoryWirelessHeadphones() throws InterruptedException
  {
	  homepage.Category_WirelessHeadphones();
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 14)
  public void CategoryWirelessSpeakers() throws InterruptedException
  {
	  homepage.Category_WirelessSpeakers();
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 15)
  public void CategoryWiredHeadphones() throws InterruptedException
  {
	  homepage.Category_WiredHeadphones();
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 16)
  public void CategoryWiredEarphones() throws InterruptedException
  {
	  homepage.Category_WiredEarphones();
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 17)
  public void CategorySoundbars() throws InterruptedException
  {
	  homepage.Category_Soundbars();
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 18)
  public void CategoryGamingHeadphones() throws InterruptedException
  {
	  homepage.Category_GamingHeadphones();
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 19)
  public void CategoryPartySpeakers() throws InterruptedException
  {
	  homepage.Category_PartySpeakers();
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 20)
  public void CategoryTrimmers() throws InterruptedException
  {
	  homepage.Category_Trimmers();
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 21)
  public void CategoryChargers() throws InterruptedException
  {
	  homepage.Category_Chargers();
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 22)
  public void CategoryPowerbanks() throws InterruptedException
  {
	  WebElement powerbanks = driver.findElement(By.xpath("//div[@class='shop_by_category_slider only-desktop']/div[13]/div//a/img"));
	  JavascriptExecutor js = (JavascriptExecutor) driver; 
	  js.executeScript("arguments[0].scrollIntoView(true)", powerbanks);
	  js.executeScript("arguments[0].click()", powerbanks);
//	  homepage.Category_Powerbanks();
//	  Actions next = new Actions(driver);
//	  next.scrollToElement(powerbanks).click().build().perform();
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 23)
  public void CategoryCables() throws InterruptedException
  {
	  WebElement cables = driver.findElement(By.xpath("//div[@class='shop_by_category_slider only-desktop']/div[14]/div//a"));
	  JavascriptExecutor js = (JavascriptExecutor) driver; 
	  js.executeScript("arguments[0].scrollIntoView(true)", cables);
	  js.executeScript("arguments[0].click()", cables);  
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 24)
  public void CategoryCarAccessories() throws InterruptedException
  {
	  WebElement caraccessories = driver.findElement(By.xpath("//div[@class='shop_by_category_slider only-desktop']/div[15]/div//img"));
	  JavascriptExecutor js = (JavascriptExecutor) driver; 
	  js.executeScript("arguments[0].scrollIntoView(true)", caraccessories);
	  js.executeScript("arguments[0].click()", caraccessories);  
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 25)
  public void CategoryTRebelRange() throws InterruptedException
  {
	  WebElement trebel = driver.findElement(By.xpath("//div[@class='shop_by_category_slider only-desktop']/div[16]//img"));
	  JavascriptExecutor js = (JavascriptExecutor) driver; 
	  js.executeScript("arguments[0].scrollIntoView(true)", trebel);
	  js.executeScript("arguments[0].click()", trebel);  
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 26)
  public void CategoryLimitedEditions() throws InterruptedException
  {
	  WebElement limitededition = driver.findElement(By.xpath("//div[@class='shop_by_category_slider only-desktop']/div[17]/div[1]//img"));
	  JavascriptExecutor js = (JavascriptExecutor) driver; 
	  js.executeScript("arguments[0].scrollIntoView(true)", limitededition);
	  js.executeScript("arguments[0].click()", limitededition);  
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 27)
  public void HomepageDailyDeals() throws InterruptedException
  {
	  homepage.Homepage_DailyDeals();
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 28)
  public void HomepageNewLaunches() throws InterruptedException
  {
	  homepage.Homepage_NewLaunches();
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 29)
  public void HomepageBestOfBoat() throws InterruptedException
  {
	  homepage.Homepage_BestOfBoat().getText();
	  Thread.sleep(2000);
  }
  @Test (priority = 30)
  public void HomepageBlogs() throws InterruptedException
  {
	  homepage.Homepage_Blogs();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  @Test (priority = 31)
  public void HomepagePress() throws InterruptedException
  {
	  homepage.Homepage_Press().getText();
	  Thread.sleep(2000);
  }
  @Test (priority = 32)
  public void HomepageFooterEmail()
  {
	  homepage.Homepage_Footer_Email().sendKeys(prop.getProperty("Email"));
  }

}
