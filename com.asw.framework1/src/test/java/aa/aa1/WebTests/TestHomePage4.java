package aa.aa1.WebTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import aa.aa1.Base.BrowserFactory;
import aa.aa1.Pages.HomePage;
import aa.aa1.Pages.LoginPage;
import junit.framework.Assert;

public class TestHomePage4 extends TestBaseThreads {
	HomePage homepage;// =  new HomePage();
	LoginPage loginpage;// = new LoginPage();

    @Test
	public void verifyHomePageElements() throws Exception
	{
    	homepage = new HomePage(driver);
		loginpage = new LoginPage(driver);

		homepage.navigateToHomePage()
		.clickGmailLink();
		loginpage.clickLoginButton();

		
	}
	
	
	@Test
	public void navigatetoHomeLogtestinPage3() throws Exception
	{ homepage = new HomePage(driver);
	loginpage = new LoginPage(driver);

	homepage.navigateToHomePage()
	.clickGmailLink();
	loginpage.clickLoginButton();
  
	}

}
