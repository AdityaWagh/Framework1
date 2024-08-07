package aa.aa1.WebTests;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import aa.aa1.Base.BrowserFactory;
import aa.aa1.Pages.HomePage;
import aa.aa1.Pages.LoginPage;
import junit.framework.Assert;

//The tests here will execute on the browser spcified as paramter from the testng xml file

public class TestHomePage extends TestBase{
	HomePage homepage; // = new HomePage();
	LoginPage loginpage;// = new LoginPage();
	Logger log= Logger.getLogger(TestHomePage.class);

	@Test
	public void verifyHomePageElements() throws Exception
	{
		homepage = new HomePage(driver);
		loginpage = new LoginPage(driver);

		homepage.navigateToHomePage()
		.verifyBrandIsDisplayed()
		.verifyHeader()
		.verifyFooter();

	}

 
	@Test
	public void navigatetoHomeLogtestinPage3() throws Exception
	{
		homepage = new HomePage(driver);
		loginpage = new LoginPage(driver);


		homepage.navigateToHomePage()
		.clickGmailLink();
		loginpage.clickLoginButton();

	}



}
