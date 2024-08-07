package aa.aa1.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import aa.aa1.Base.BrowserFactory;

public class GmailAboutPage {
	
	private WebDriver driver;
	private WebDriverWait wait;

	@FindBy(xpath="/html/body/header/div/a/span")
	WebElement headerLogo;

	@FindBy(xpath="/html/body/header/div/div/div/a[2]")
	WebElement signinButton;

	@FindBy(xpath="/html/body/header/div/div/div/a[3]/span[1]")
	WebElement getGmailButton;
	
	@FindBy(xpath="/html/body/header/div/div/div/details/summary/div[1]")
	WebElement createAccountButton;

	@FindBy(xpath="/html/body/header/div/div/div/details/div/a[1]")
	WebElement personalAccountSubmenu;

	public GmailAboutPage()
	{
		this.driver = BrowserFactory.getDriver();
		PageFactory.initElements(driver, this);
		//restrict object creation
	}

	public GmailAboutPage verifyLogoDisplayed()
	{
		headerLogo.isDisplayed();
		return this;
	}

	public GmailAboutPage verifySigninDisplayed()
	{
		signinButton.isDisplayed();
		return this;
	}

	public GmailAboutPage verifyGetGmailDisplayed()
	{
		getGmailButton.isDisplayed();
		return this;

	}
	
	public UserAccountSubMenuPage clickUserAccountSubMenu()
	{
		Actions actions = new Actions(driver);
		actions.click(createAccountButton)
		.moveToElement(personalAccountSubmenu)
		.click()
		.build()
		.perform();
		
		return new UserAccountSubMenuPage();

	}
	
	
}
