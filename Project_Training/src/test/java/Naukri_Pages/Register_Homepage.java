package Naukri_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Naukri_TestBase.Register_Testbase;

public class Register_Homepage extends Register_Testbase{
	@FindBy (xpath = "//img[@src='https://static.naukimg.com/s/4/100/i/naukri_Logo.png']")
	WebElement Logo;
	@FindBy (xpath = "//input[@id='name']")
	WebElement Name;
	@FindBy (xpath = "//input[@id='email']")
	WebElement Email;
	@FindBy (xpath = "//input[@id='password']")
	WebElement Pass;
	@FindBy (xpath = "//input[@id='mobile']")
	WebElement Phone;
	@FindBy (xpath = "//div[@data-val='exp']")
	WebElement Work_exp;
	@FindBy (xpath = "//div[@data-val='fresher']")
	WebElement Work_fresh;
	@FindBy (xpath = "//input[@id='currentCity']")
	WebElement City;
	@FindBy (xpath = "//ul[@class=\"dropdown \"]/li[1]")
	WebElement City_drop;
	
	@FindBy (xpath = "//div[@class='initialLocation-section']")
	WebElement Locations;	
	@FindBy (id = "resumeUpload")
	WebElement Resume;
	@FindBy (xpath = "//button[text()='Register Now']")
	WebElement Register;
	
	public Register_Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement logo()
	{
		return Logo;
	}
	public WebElement name()
	{
		return Name;
	}
	public WebElement email()
	{
		return Email;
	}
	public WebElement password()
	{
		return Pass;
	}
	public WebElement phone()
	{
		return Phone;
	}
	public void workexp()
	{
		Work_exp.click();
	}
	public void workfresh()
	{
		Work_fresh.click();
	}
	public WebElement city()
	{
		return City;
	}
	public void city_drop()
	{
		City_drop.click();
	}
	public WebElement location()
	{
		return Locations;
	}
	public WebElement resume()
	{
		return Resume;
	}
	public void register()
	{
		Register.click();
	}

}
