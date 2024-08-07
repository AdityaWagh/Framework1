package aa.aa1.WebTests;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import aa.aa1.Base.BrowserFactory;
import aa.aa1.Pages.GmailAboutPage;
import aa.aa1.Pages.HomePage;
import aa.aa1.Pages.HomePage2;
import aa.aa1.Pages.LoginPage;
import junit.framework.Assert;

public class TestHomePage2 extends TestBase {
	HomePage homepage;// =  new HomePage();
	LoginPage loginpage;// = new LoginPage();

	@Test
	public void TestGmailAboutPageHeader() throws Exception
	{
		homepage = new HomePage(driver);
		loginpage = new LoginPage(driver);

		homepage.navigateToHomePage()
		.clickGmailLink();
		loginpage.clickLoginButton();

	}

	@Test
	public void Test2() throws Exception
	{
		/*
		 * homepage.navigateToHomePage() .clickGmailLink();
		 * loginpage.clickLoginButton();
		 */
	}


}
