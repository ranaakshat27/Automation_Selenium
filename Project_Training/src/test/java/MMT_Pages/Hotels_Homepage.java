package MMT_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MMT_TestBase.Hotels_Testbase;

public class Hotels_Homepage extends Hotels_Testbase {
	
	@FindBy(xpath = "//img[@alt='Make My Trip']")
	WebElement Logo;
	@FindBy(xpath = "//li[@class='menu_Flights']")
	WebElement Flights;
	@FindBy(xpath = "//li[@class='menu_Hotels']")
	WebElement Hotels;
	@FindBy(xpath = "//li[@class='menu_Homestays']")
	WebElement Homestays;
	@FindBy(xpath = "//li[@class='menu_Holidays removeItemMargin']")
	WebElement Holiday_Packages;
	@FindBy(xpath = "//li[@class='menu_Trains']")
	WebElement Trains;
	@FindBy(xpath = "//li[@class='menu_Buses']")
	WebElement Buses;
	@FindBy(xpath = "//li[@class='menu_Cabs']")
	WebElement Cabs;
	@FindBy(xpath = "//li[@class='menu_Forex']")
	WebElement Forex;
	@FindBy(xpath = "//li[@class='menu_Charters']")
	WebElement Charter_Flights;
	@FindBy(xpath = "//li[@class='menu_Activities']")
	WebElement Activities;
	@FindBy(xpath = "//span[text()='UPTO 5 ROOMS']")
	WebElement Upto_5Rooms;
	//@FindBy(xpath = "//img[@alt='Make My Trip']")
	//WebElement Group_Deals;
	@FindBy(xpath = "//label[@for='city']")
	WebElement City_Box;
	@FindBy(xpath = "//ul[@role='listbox']/li[3]")
	WebElement City_Dropdownbox;
	@FindBy(xpath = "//input[@placeholder='Enter city/ Hotel/ Area/ Building']")
	WebElement Enter_City;
	@FindBy(xpath = "//label[@for='checkin']")
	WebElement Checkin_Box;
	@FindBy(xpath = "//div[@class='DayPicker Selectable Range']/div/div[2]/div[2]/div[3]/div[3]/div[4]")
	WebElement Checkin_Dropdownbox;
	@FindBy(xpath = "//label[@for='checkout']")
	WebElement Checkout_Box;
	@FindBy(xpath = "//div[@class='DayPicker Selectable Range']/div/div[2]/div[2]/div[3]/div[4]/div[1]")
	WebElement Checkout_Dropdownbox;
	@FindBy(xpath = "//label[@for='guest']")
	WebElement Rooms_Guests;
	@FindBy(xpath = "//span[@data-testid='room_count']")
	WebElement Rooms_Count;
	@FindBy(xpath = "//ul[@class='gstSlct__list']/li[2]")
	WebElement Rooms_Total;
	@FindBy(xpath = "//span[@data-testid='adult_count']")
	WebElement Adults_Count;
	@FindBy(xpath = "//ul[@class='gstSlct__list']/li[4]")
	WebElement Adults_Total;
	@FindBy(xpath = "//span[@data-testid='children_count']")
	WebElement Children_Counts;
	@FindBy(xpath = "//ul[@class='gstSlct__list']/li[2]")
	WebElement Children_Total;
	@FindBy(xpath = "//div[@class='rmsGst__footer']/button")
	WebElement Apply_Button;
	@FindBy(xpath = "//label[@for='appliedFilter']")
	WebElement Price_Box;
	@FindBy(xpath = "//ul[@class='ppn__list']/li[1]")
	WebElement Price_Range;
	@FindBy(xpath = "//button[@id='hsw_search_button']")
	WebElement Search_Button;
	
	public Hotels_Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement logo()
	{
		return Logo;
	}
	public void flights()
	{
		Flights.click();
	}public void hotels()
	{
		Hotels.click();
	}
	public void homestays()
	{
		Homestays.click();
	}
	public void holiday_pack()
	{
		Holiday_Packages.click();
	}
	public void trains()
	{
		Trains.click();
	}
	public void buses()
	{
		Buses.click();
	}
	public void cabs()
	{
		Cabs.click();
	}
	public void forex()
	{
		Forex.click();
	}
	public void charter_flight()
	{
		Charter_Flights.click();
	}
	public void activities()
	{
		Activities.click();
	}
	public void upto_5rooms()
	{
		Upto_5Rooms.click();
	}
	public void city_box()
	{
		City_Box.click();
	}
	public void city_dropdown()
	{
		City_Dropdownbox.click();
	}
	public WebElement enter_city()
	{
		return Enter_City;
	}
	public void checkin_box()
	{
		Checkin_Box.click();
	}
	public void checkin_dropbox()
	{
		Checkin_Dropdownbox.click();
	}
	public void checkout_box()
	{
		Checkout_Box.click();
	}
	public void checkout_dropbox()
	{
		Checkout_Dropdownbox.click();
	}
	public void rooms_guest()
	{
		Rooms_Guests.click();
	}
	public void rooms_count()
	{
		Rooms_Count.click();
	}
	public void rooms_total()
	{
		Rooms_Total.click();
	}
	public void adults_count()
	{
		Adults_Count.click();
	}
	public void adults_total()
	{
		Adults_Total.click();
	}
	public void children_count()
	{
		Children_Counts.click();
	}
	public void children_total()
	{
		Children_Total.click();
	}
	public void apply_button()
	{
		Apply_Button.click();
	}
	public void price_box()
	{
		Price_Box.click();
	}
	public void Price_range()
	{
		Price_Range.click();
	}
	public void search_button()
	{
		Search_Button.click();
	}	

}
