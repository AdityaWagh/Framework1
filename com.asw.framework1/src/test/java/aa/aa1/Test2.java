package aa.aa1;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class Test2 {
	test1 test = new test1();
	WebDriver driver;
	Logger log = Logger.getLogger(Test2.class);
	/*
  @Test(groups= {"smoke"})
  @Parameters("browsername")
  public void f(String browsername) {
	  /*ChromeOptions opt = new ChromeOptions();
		opt.setCapability("pageLoadStrategy", "none");

		opt.setCapability("platformname", "windows");
		
		//opt.setHeadless(true);
		opt.setAcceptInsecureCerts(true);
		if(browsername.equals(opt))
		System.setProperty("webdriver.chrome.driver", "U:\\Automation\\drivers\\chromedriver.exe");
		thr
		WebDriver driver = new ChromeDriver(opt);
		*/
	  /*try {
		  
	  PropertyConfigurator.configure("U:\\Automation\\Selenium\\seleniumadvanced\\aa.aa1\\src\\test\\resources\\Logs.properties");
	  System.out.println("aaa:"+browsername);
		
	  ChromeOptions opt = new ChromeOptions();
	opt.setCapability("pageLoadStrategy", "none");
	  driver = test.get();
	  driver.navigate().to("https://www.amazon.in/");
	  
	  log.info("log2");

      throw new Exception("sjaljashsclkadcbcjdbcjkdcbj....sdjshdj");
	  //driver.close();
	  }
	  catch(Exception e)
	  {
		  log.error(e);
	  }
		
	  
  }*/
  
  
  @Test(groups= {"regression"})
  public void g() {
	  
	 
	  driver.navigate().to("https://www.amazon.in/");
	  driver.close();
	  log.error("error2");
	  
		
			try {
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Assert.assertFalse(true);
		
	  
		// TODO Auto-generated catch block
  }	
	
		  
  /*
  @Test
  public void h() {
	  ChromeOptions opt = new ChromeOptions();
		opt.setCapability("pageLoadStrategy", "none");

		opt.setCapability("platformname", "windows");
		
		//opt.setHeadless(true);
		opt.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "U:\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.navigate().to("https://www.amazon.in/");
		driver.close();
  }
  @Test
  public void i() {
	  ChromeOptions opt = new ChromeOptions();
		opt.setCapability("pageLoadStrategy", "none");

		opt.setCapability("platformname", "windows");
		
		//opt.setHeadless(true);
		opt.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "U:\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.navigate().to("https://www.amazon.in/");
		driver.close();
  }*/
}
