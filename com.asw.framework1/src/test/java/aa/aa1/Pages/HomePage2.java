package aa.aa1.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Parameters;

import aa.aa1.Base.BrowserFactory;
import aa.aa1.Base.Wrappers;

public class HomePage2 extends Wrappers{
	private WebDriver driver;
	private WebDriverWait wait;
	Logger log = Logger.getLogger(HomePage2.class);
	//By button = By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]");
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/img")
	WebElement brand;
	
	@FindBy(xpath="//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")
	WebElement gmailLink;
	
	@FindBy(xpath="//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")
	WebElement imagesLink;
	
	@FindBy(xpath="//*[@id=\"gbwa\"]/div/a")
	WebElement appsLink;
	
	@FindBy(xpath="//*[@id=\"gb\"]/div/div[2]/a")
	WebElement signinButton;
	
	public HomePage2()
	{
		
			}
	
	public HomePage2(WebDriver driver)
	{

		System.out.println("aadjjf"+driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//restrict object creation
	}
	

	public HomePage2 navigateToHomePage()
	{
		//Reporter.log("Navigating to Home Page");
		log.info("Navigaing to homepage.");
		driver.navigate().to("https://www.google.com/");
		return this;
		
	}
	
	public HomePage2 verifyBrandIsDisplayed()
	{
		log.info("Verify brand is displayed.");
		
		try {
			//Reporter.log("Verifying Home Brand Page");
			driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]")).isDisplayed();
			//.isDisplayed();
			//err.isDisplayed();
			//throw new NoSuchElementException("Inside Exception");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println(""+e.getMessage());
		}
		catch (ElementNotVisibleException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return this;
	}
	
	public HomePage2 verifyHeader()
	{
		return this;
	}
	
	public HomePage2 verifyFooter()
	{
		return this;
	}
	
	public HomePage2 enterSearchString()
	{
		return this;
		
	}
	
	
	public LoginPage clickGmailLink()
	{ 
		log.info("Clicking gmail link");
		click(driver, gmailLink);
		//click(element,40);
		//click(element,40,5);
		return new LoginPage();
		
	}
	

}
