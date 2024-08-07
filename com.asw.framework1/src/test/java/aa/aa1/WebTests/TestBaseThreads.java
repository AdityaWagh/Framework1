package aa.aa1.WebTests;

import org.openqa.selenium.WebDriver;
import org.testng.IAttributes;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import aa.aa1.Base.BrowserFactory;
import aa.aa1.Base.BrowserFactoryThread;
import aa.aa1.Pages.HomePage;
import aa.aa1.Pages.LoginPage;

// Base Test to setup the Before and After activity
//  Test execution can be started independently for each class from suite and browser closes after class is done.

public class TestBaseThreads {


	protected WebDriver driver;

	@Parameters("browsername")
	@BeforeClass
	public void getgg(String browsername,ITestContext itestcontext)
	{

		//driver=BrowserFactory.getDriver(browsername,driver);
		//itestcontext.setAttribute("Webdriver", driver);

		driver=BrowserFactoryThread.getDriverlocal(browsername);

	}

	@AfterClass
	public void afterCLass() throws InterruptedException
	{
		System.out.println("Closing Browser Instance:"+driver);
		driver.close();

	}

}
