package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeLoginPage 
{
	@FindBy(id="username")
	private WebElement usernametextfield;
	
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passwordtextfield;
	
	@FindBy(css = "input[type='checkbox']")
	private WebElement keepmeloggedincheckbox;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordlink;
	
	@FindBy(xpath = "//a[.='actiTIME Inc.']")
	private WebElement actitimeinclink;
	
	public POMActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod()
	{
		usernametextfield.sendKeys("admin");
		passwordtextfield.sendKeys("manager");
		keepmeloggedincheckbox.click();
		loginbutton.click();
	}

	public void forgotpasswordMethod()
	{
		forgotyourpasswordlink.click();
	}
	
	public void actitimeinclinkMethod()
	{
		actitimeinclink.click();
	}
}
