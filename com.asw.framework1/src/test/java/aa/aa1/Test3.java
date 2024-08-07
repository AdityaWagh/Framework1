package aa.aa1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	
	Logger log = Logger.getLogger(Test3.class);
	
	@BeforeTest(alwaysRun=true)
	public void get()
	{
		System.out.println("before");
		PropertyConfigurator.configure("U:\\Automation\\Selenium\\seleniumadvanced\\aa.aa1\\src\\test\\resources\\Logs.properties");
		
	}
	
	@Test(groups = {"smoke"})
	public void Test4()
	{
		
		System.out.println("test3");
		log.trace("Second Class");
	}

}
