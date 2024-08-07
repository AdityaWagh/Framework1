package aa.aa1.Base;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IAttributes;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;


public class CustomListeners implements ISuiteListener,ITestListener {
	Logger log =  Logger.getLogger(CustomListeners.class);
	public CustomListeners() {
		// TODO Auto-generated constructor stub
	}

	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
		//WebDriver driver = (WebDriver) arg0.getAttribute("Webdriver");
		//WebDriver driver = (WebDriver) iattribute.getAttribute("Webdriver");
		//BrowserFactory.closeBrowser(driver);
		
		//WebDriver driver = (WebDriver) itestcontext.getAttribute("Webdriver");
		WebDriver driver = BrowserFactory.getDriver();
		System.out.println("Shutting Down Browser Instance on Suite Completion:"+driver);
		driver.quit();
		
	}

	public void onStart(ISuite arg0) {

		PropertyConfigurator.configure("U:\\Automation\\Selenium\\seleniumadvanced\\aa.aa1\\src\\test\\resources\\Logs.properties");

		// TODO Auto-generated method stub
		String rootdir = System.getProperty("user.dir");
		File file1 = new File(rootdir+"\\src\\test\\resources\\Logs.properties");
		File file2 = new File(rootdir+"\\src\\test\\resources\\Application.properties");
		if(!file1.exists() || !file2.exists()) { 
			// do something
			throw new SkipException("The Logging or Application Property file are not setup for the project");
		}
		else {System.out.println("The Logging and Application Property file is loaded..");
		log.info("The Logging and Application Property file is loaded..");}


	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		String classname=arg0.getInstanceName();
		String classmethod=arg0.getName();
		
		ITestContext itestcontext=arg0.getTestContext();
		
		WebDriver driver = (WebDriver) itestcontext.getAttribute("Webdriver");
		
		Utility.createScreenshot(driver,classname,classmethod);
		
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("Started Test Method: "+arg0.getName());
		log.info("Started Test Method: "+arg0.getInstanceName()+" => "+arg0.getName());
		/*
		 * System.out.println(arg0.getTestName());
		 * System.out.println(arg0.getTestClass());
		 * System.out.println(arg0.getMethod());
		 * 
		 * System.out.println(arg0.getTestContext());
		 * System.out.println("On Test Start....");
		 * System.out.println(arg0.getInstanceName());
		 */
		 

	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		String classname=arg0.getInstanceName();
		String classmethod=arg0.getName();
		
	}
	

}
