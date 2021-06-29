package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pom.POMActitimeLoginPage;

public class BaseTest 
{
	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void loginToapp()
	{
		POMActitimeLoginPage login=new POMActitimeLoginPage(driver);
		login.loginMethod();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void executionstop()
	{
		Reporter.log("execution is over",true);
	}
	
	@BeforeSuite
	public void executionstart()
	{
		Reporter.log("execution is start",true);
	}
}
