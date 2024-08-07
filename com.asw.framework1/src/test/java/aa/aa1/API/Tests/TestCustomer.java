package aa.aa1.API.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import aa.aa1.Pages.HomePage;

public class TestCustomer {
	HomePage homepage = new HomePage();
	
	@BeforeMethod
	public void beforeTestCutomer()
	{
		//homepage.clickGmailLink();
	}
	
	@Test
	public void test1()
	{
		
	}
	
	@Test()
	public void test2()
	{}
}
