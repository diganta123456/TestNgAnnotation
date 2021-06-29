package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeCustomerPage 
{
	@FindBy(id="container_tasks")
	private WebElement tasks;
	
	@FindBy(xpath="//div[@class='title ellipsis']")
	private WebElement addnewbutton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement createnewcustomer;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomernametextfield;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcustomerbutton;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelbutton;
	
	public POMActitimeCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createcustomermethod()
	{
		tasks.click();
		addnewbutton.click();
		createnewcustomer.click();
		entercustomernametextfield.sendKeys("diganta");
		createcustomerbutton.click();
	}
	
	public void cancelCustomerMethod()
	{
		cancelbutton.click();
	}


		
	
}
