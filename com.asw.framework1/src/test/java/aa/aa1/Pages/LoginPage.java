package aa.aa1.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import aa.aa1.Base.BrowserFactory;

public class LoginPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public LoginPage()
	{
		//this.driver = BrowserFactory.getDriver();
		//restrict object creation
	}
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}

	public LoginPage enterUserName()
	{
		return this;
	}
	
	public LoginPage enterPassword()
	{
		return this;
	}
	
	public GmailAboutPage clickLoginButton()
	{
		return new GmailAboutPage();
	}
	
	public LoginPage verifyuserNameLabel()
	{
		return this;
	}
	public LoginPage verifypasswordabel()
	{
		return this;
	}
	public LoginPage verifyLoginButton()
	{
		return this;
	}
	
	//funcitional/business case
	
	
}
