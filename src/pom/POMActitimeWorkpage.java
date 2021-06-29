package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMActitimeWorkpage
{
   @FindBy(xpath="(//div[@class='menu_icon'])[2]")
   private WebElement settingiconlink;
   
   @FindBy(xpath = "//a[.='Types of Work']")
   private WebElement typesofworklink;
   
   @FindBy(xpath="//span[.='Create Type of Work']")
   private WebElement createtypeofworkbutton;
   
   @FindBy(id="name")
   private WebElement nametextfield;
   
   @FindBy(xpath="//select[@name='active']")
   private WebElement statusdropdownlist;
   
   @FindBy(xpath="//input[@type='submit']")
   private WebElement createtypeofworkbutton1;
   
   @FindBy(xpath="//input[@value='      Cancel      ']")
   private WebElement cancelbutton;
   
   public POMActitimeWorkpage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void createworkMethod() throws InterruptedException
   {
	   Thread.sleep(5000);
	   settingiconlink.click();
	   typesofworklink.click();
	   createtypeofworkbutton.click();
	   nametextfield.sendKeys("planning");
	   Select sel=new Select(statusdropdownlist);
	   sel.deselectByVisibleText("archived");
	   createtypeofworkbutton1.click();
   }
   
   public void cancelWorkMethod()
   {
	   cancelbutton.click();
   }
}
