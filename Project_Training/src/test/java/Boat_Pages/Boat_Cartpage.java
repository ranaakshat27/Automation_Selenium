package Boat_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Boat_Testbase.Homepage_Testbase;

public class Boat_Cartpage extends Homepage_Testbase{
	
	@FindBy (xpath = "//a[@aria-label='Cart']")
	WebElement cart;
	@FindBy (xpath = "//a[text()='Start shopping']")
	WebElement start;
	@FindBy (xpath = "//a[@class='list-collections__item image-zoom '][1]")
	WebElement earbuds;
	@FindBy (xpath = "//div[@id='Huratips_Loop']/product-item[1]//a/img")
	WebElement product1;
	@FindBy (xpath = "//div[@class='color-swatch-list']/div[3]")
	WebElement color1;
	@FindBy (xpath = "//quantity-selector[@class='quantity-selector']/button[2]")
	WebElement quantity1add;
	@FindBy (xpath = "//quantity-selector[@class='quantity-selector']/button[1]")
	WebElement quantity1remove;
	@FindBy (xpath = "//div[@class='product-meta__price-list-container d-lg-block']")
	WebElement price1;
	@FindBy (xpath = "//button[@id='AddToCart']")
	WebElement addtocart;
	@FindBy (xpath = "//div[@class='line-item__content-wrapper']")
	WebElement cartitem;
	@FindBy (xpath = "//span[@class='cart-total-text total-price']")
	WebElement cartprice;
	@FindBy (xpath = "//div[@class=' checkout-buttons-div']")
	WebElement confirmorder;
	
	public Boat_Cartpage()
	{
		PageFactory.initElements(driver, this); 
	}
	
	public void Cart()
	{
		cart.click();
	}
	public void Start()
	{
		start.click();
	}
	public void Earbuds()
	{
		earbuds.click();
	}
	public void Product1()
	{
		product1.click();
	}
	public void Color1()
	{
		color1.click();
	}
	public void Quantity1add()
	{
		quantity1add.click();
	}
	public void Quantity1remove()
	{
		quantity1remove.click();
	}
	public WebElement Price1()
	{
		return price1;
	}
	public void Add_Cart()
	{
		addtocart.click();
	}
	public WebElement Cart_item()
	{
		return cartitem;
	}
	public WebElement Cart_price()
	{
		return cartprice;
	}	
	public void Confirm_order()
	{
		confirmorder.click();
	}

}
