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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.IResultMap;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import aa.aa1.Base.BrowserFactory;
import aa.aa1.Pages.HomePage;
import aa.aa1.Pages.LoginPage;
import junit.framework.Assert;

public class TestforTestContext extends TestBase {
	HomePage homepage;// =  new HomePage();
	
	LoginPage loginpage;// = new LoginPage();

    @Test
	public void verifyHomePageElements(ITestContext itestcontext) throws Exception
	{

		IResultMap iresulttest=itestcontext.getPassedTests();
		System.out.println("Result"+iresulttest.toString());

		
	}
	
	 @DataProvider(name="customerData") public Object[][] getdata() { return new
	 Object [][]{ {new CustomerData()}, {new CustomerData()}, {new
	 CustomerData()}, {new CustomerData()}}; }
	 /* 
	 * @Test public void test2(ITestContext itestcontext) throws Exception {
	 * //CustomerData customerdata = new CustomerData();
	 * //customerdata.setfname("GLaurenUpdate");
	 * 
	 * //Customer customer2 = new Customer(customerdata);
	 * 
	 * //itestcontext.setAttribute("CustomerData", customer2);
	 * //System.out.println(customer2.getid());
	 * //System.out.println(customer2.getfname());
	 * //System.out.println(customer2.getlname());
	 * 
	 * }
	 * 
	 * @Test(dataProvider="customerData") public void test3(CustomerData
	 * customerdata,ITestContext itestcontext) throws Exception {
	 * System.out.println(customerdata.getid());
	 * 
	 * }
	 * 
	 *}
*/
		@Test(dataProvider="customerData") 
		public void test3(CustomerData customerdata,ITestContext itestcontext) throws Exception {
		  
		  }
		  
		 }
