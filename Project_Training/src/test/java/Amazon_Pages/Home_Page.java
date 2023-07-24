package Amazon_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Amazon_TestBase.HomePage_TestBase;

public class Home_Page extends HomePage_TestBase {
	
	@FindBy(xpath="//div[@id='nav-logo']")
	WebElement Logo;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement Search_field;
	@FindBy(xpath="//input[@type='submit']")
	WebElement Search_button;
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement Acc_lists;
	@FindBy(xpath="//a[@id='nav-cart']")
	WebElement Cart;
	@FindBy(xpath="//a[@id='nav-hamburger-menu']")
	WebElement All_button;
	@FindBy(xpath="//div[@class='nav-sprite hmenu-close-icon']")
	WebElement Close_button;
	@FindBy(xpath="//a[@class='a-carousel-goto-prevpage']")                                                      
	WebElement Pre_slide;
	@FindBy(xpath="//a[@class='a-carousel-goto-nextpage']")
	WebElement Next_slide;
	@FindBy(xpath="//a[@id='navBackToTop']")                 
	WebElement Back_top;
	
	public Home_Page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement logo()
	{
		return Logo;		
	}
	public WebElement search_field()
	{
		return Search_field;		
	}
	public void search_button()
	{
		Search_button.click();		
	}
	public WebElement Acc_lists()
	{
		return Acc_lists;		
	}
	public void cart()
	{
		Cart.click();		
	}
	public void All()
	{
		All_button.click();		
	}
	public void Close()
	{
		Close_button.click();		
	}
	public void Previous()
	{
		Pre_slide.click();		
	}
	public void Next()
	{
		Next_slide.click();		
	}
	public void Footer()
	{
		Back_top.click();		
	}

}
