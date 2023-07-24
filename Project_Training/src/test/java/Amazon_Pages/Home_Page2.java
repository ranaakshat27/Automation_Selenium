package Amazon_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Amazon_TestBase.HomePage_TestBase;

public class Home_Page2 extends HomePage_TestBase {
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement Search_field;
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement Search_button;
	@FindBy(xpath = "//span[text()='Apple iPhone 14 (128 GB) - Midnight']")
	WebElement iphone;
	@FindBy(xpath = "//img[@alt='Purple']")
	WebElement iphone_colour;	
	@FindBy(xpath = "//span[@id='size_name_2']")
	WebElement iphone_size;		
	@FindBy(xpath = "//div[@id='productOverview_feature_div']")
	WebElement iphone_Spec;	
	@FindBy(xpath = "//span[@id='submit.add-to-cart']")
	WebElement Add_cart;
	@FindBy(xpath = "//span[@id='attach-sidesheet-view-cart-button']")
	WebElement View_cart;
	@FindBy(xpath = "//select[@id='quantity']/option[@value='2']")
	WebElement Qty;
	@FindBy(xpath = "//div[@class='a-section sc-buy-box-inner-box']")
	WebElement Subtotal_items;
	@FindBy(xpath = "//span[@id='sc-subtotal-amount-buybox']")
	WebElement Subtotal_price;
	
	
	
	public Home_Page2()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement S_field()
	{
		return Search_field;
	}
	public void S_button()
	{
		Search_button.click();
	}
	public void product()
	{
		iphone.click();
	}
	public void product_colour()
	{
		iphone_colour.click();
	}
	
	public void product_size()
	{
		iphone_size.click();
	}
	
	//public WebElement product_spec()
	//{
		//return iphone_Spec;
	//}
	public void Add_to_cart()
	{
		Add_cart.click();
	}
	public void view_cart()
	{
		View_cart.click();
	}
	public void product_quantity()
	{
		Qty.click();
	}
	public WebElement Total_items()
	{
		return Subtotal_items;
	}
	public WebElement Total_cost()
	{
		return Subtotal_price;
	}

}
