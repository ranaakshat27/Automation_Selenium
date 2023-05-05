package Boat_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Boat_Testbase.Homepage_Testbase;

public class Boat_Homepage extends Homepage_Testbase {
	
	@FindBy (xpath = "//img[@class='header__logo-image']")
	WebElement logo;
	@FindBy (xpath = "//li[@data-item-title='Categories']")
	WebElement categories;
	@FindBy (xpath = "//li[@data-item-title='Daily Deals']")
	WebElement Daily_deals;
	@FindBy (xpath = "//li[@data-item-title='Gift With boAt']")
	WebElement Gift_With_boat;
	@FindBy (xpath = "//li[@data-item-title='More']")
	WebElement more;
	@FindBy (xpath = "//input[@class='search__input predictive-search__input predictive-search__input_desk']")
	WebElement search;
	@FindBy (xpath = "//span[@class='toggle-link custom-account-icon']")
	WebElement account;
	@FindBy (xpath = "//a[@aria-label='Cart']")
	WebElement cart;
	@FindBy (xpath = "//ul[@class='MultiCarousel_dots_container']/li[3]")
	WebElement Dots_slider;
	@FindBy (xpath = "//div[@class='shop_by_category_slider only-desktop']/div[1]")
	WebElement Category_earbuds;
	@FindBy (xpath = "//div[@class='shop_by_category_slider only-desktop']/div[2]")
	WebElement Category_neckbands;
	@FindBy (xpath = "//div[@class='shop_by_category_slider only-desktop']/div[3]")
	WebElement Category_Smartwatches;
	@FindBy (xpath = "//div[@class='shop_by_category_slider only-desktop']/div[4]")
	WebElement Category_Wirelessheadphones;
	@FindBy (xpath = "//div[@class='shop_by_category_slider only-desktop']/div[5]")
	WebElement Category_Wirelessspeakers;
	@FindBy (xpath = "//div[@class='shop_by_category_slider only-desktop']/div[6]")
	WebElement Category_Wiredheadphones;
	@FindBy (xpath = "//div[@class='shop_by_category_slider only-desktop']/div[7]")
	WebElement Category_Wiredearphones;
	@FindBy (xpath = "//div[@class='shop_by_category_slider only-desktop']/div[8]")
	WebElement Category_soundbars;
	@FindBy (xpath = "//div[@class='shop_by_category_slider only-desktop']/div[9]")
	WebElement Category_Gamingheadphones;
	@FindBy (xpath = "//div[@class='shop_by_category_slider only-desktop']/div[10]")
	WebElement Category_Partyspeakers;
	@FindBy (xpath = "//div[@class='shop_by_category_slider only-desktop']/div[11]")
	WebElement Category_trimmers;
	@FindBy (xpath = "//div[@class='shop_by_category_slider only-desktop']/div[12]")
	WebElement Category_chargers;
	@FindBy (xpath = "//div[@class='shop_by_category_slider only-desktop']/div[13]")
	WebElement Category_powerbanks;
	@FindBy (xpath = "//div[@class='shop_by_category_slider only-desktop']/div[14]")
	WebElement Category_cables;
	@FindBy (xpath = "//div[@class='shop_by_category_slider only-desktop']/div[15]")
	WebElement Category_Caraccessories;
	@FindBy (xpath = "//div[@class='shop_by_category_slider only-desktop']/div[16]")
	WebElement Category_TRebelrange;
	@FindBy (xpath = "//div[@class='shop_by_category_slider only-desktop']/div[17]")
	WebElement Category_Limitededitions;
	@FindBy (xpath = "(//h3[@class='ui2-heading'])[1]")
	WebElement Homepage_Dailydeals;
	@FindBy (xpath = "(//h3[@class='ui2-heading'])[2]")
	WebElement Homepage_Newlaunches;
	@FindBy (xpath = "(//h3[@class='ui2-heading'])[3]")
	WebElement Homepage_BestOfboat;
	@FindBy (xpath = "(//h3[@class='ui2-heading'])[4]")
	WebElement Homepage_blogs;
	@FindBy (xpath = "(//h3[@class='ui2-heading'])[5]")
	WebElement Homepage_press;
	@FindBy (xpath = "//input[@id='subscriber-email']")
	WebElement Homepage_Footer_email;
	
	public Boat_Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Logo()
	{
		return logo;
	}
	
	public void Categories()
	{
		categories.click();
	}
	
	public void Daily_Deals()
	{
		Daily_deals.click();
	}
	
	public void Gift_With_Boat()
	{
		Gift_With_boat.click();
	}
	
	public void More()
	{
		more.click();
	}
	
	public WebElement Search()
	{
		return search;
	}
	
	public void Account()
	{
		account.click();
	}
	
	public void Cart()
	{
		cart.click();
	}
	
	public void Dots_Slider()
	{
		Dots_slider.click();
	}
	
	public void Category_Earbuds()
	{
		Category_earbuds.click();
	}
	
	public void Category_Neckbands()
	{
		Category_neckbands.click();
	}
	
	public void Category_SmartWatches()
	{
		Category_Smartwatches.click();
	}
	
	public void Category_WirelessHeadphones()
	{
		Category_Wirelessheadphones.click();
	}
	
	public void Category_WirelessSpeakers()
	{
		Category_Wirelessspeakers.click();
	}
	
	public void Category_WiredHeadphones()
	{
		Category_Wiredheadphones.click();
	}
	
	public void Category_WiredEarphones()
	{
	    Category_Wiredearphones.click();
	}
	
	public void Category_Soundbars()
	{
		Category_soundbars.click();
	}
	
	public void Category_GamingHeadphones()
	{
		Category_Gamingheadphones.click();
	}
	
	public void Category_PartySpeakers()
	{
		Category_Partyspeakers.click();
	}
	
	public void Category_Trimmers()
	{
		Category_trimmers.click();
	}
	
	public void Category_Chargers()
	{
		Category_chargers.click();
	}
	
	public void Category_Powerbanks()
	{
		Category_powerbanks.click();
	}
	
	public void Category_Cables()
	{
		Category_cables.click();
	}
	
	public void Category_CarAccessories()
	{
		Category_Caraccessories.click();
	}
	
	public void Category_TRebelRange()
	{
		Category_TRebelrange.click();
	}
	
	public void Category_LimitedEditions()
	{
		Category_Limitededitions.click();
	}
	
	public void Homepage_DailyDeals()
	{
		Homepage_Dailydeals.click();
	}
	
	public void Homepage_NewLaunches()
	{
		Homepage_Newlaunches.click();
	}
	
	public WebElement Homepage_BestOfBoat()
	{
		return Homepage_BestOfboat;
	}
	
	public void Homepage_Blogs()
	{
		Homepage_blogs.click();
	}
	
	public WebElement Homepage_Press()
	{
		return Homepage_press;
	}
	
	public WebElement Homepage_Footer_Email()
	{
		return Homepage_Footer_email;
	}
	

}
