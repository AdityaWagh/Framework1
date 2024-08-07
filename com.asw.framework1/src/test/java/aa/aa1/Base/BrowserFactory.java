package aa.aa1.Base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import aa.aa1.WebTests.PropertiesUtility;
import okio.Options;

public class BrowserFactory   {
	private static WebDriver driver;
	private static WebDriverWait wait;
	public static String baseurl;
	
	private  BrowserFactory()
	{
//
	}

	  public static WebDriver getDriver() { 
			
			return driver;
	  }
	   
	

	public static WebDriver getDriver(String browsername, WebDriver driver2) {
		// TODO Auto-generated method stub
		if(browsername.equals("Edge"))
		{
		if(driver2==null)
		{
		System.setProperty("webdriver.edge.driver", "U:\\Automation\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		System.out.println("Edge Browser Instance Created :"+driver);
		
		}
		}
		if(browsername.equals("Firefox"))
		{
			if(driver2==null)
			{
			System.setProperty("webdriver.chrome.driver", "U:\\Automation\\drivers\\chromedriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox Browser Instance Created :"+driver);
			
			}	
		}
		if(browsername.equals("Chrome"))
		{
			if(driver2==null)
			{
			System.setProperty("webdriver.chrome.driver", "U:\\Automation\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome Browser Instance Created :"+driver);
			
			driver.navigate().to(baseurl);
			//System.out.println("Base URL :"+PropertiesUtility.getProperty("baseurl"));
			}
		}
		return driver;
	}

	public static WebDriver getDriver(String browsername, WebDriver driver2, String baseurl2) {
		// TODO Auto-generated method stub
		if(browsername.equals("Edge"))
		{
		if(driver2==null)
		{
		System.setProperty("webdriver.edge.driver", "U:\\Automation\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		System.out.println("Edge Browser Instance Created :"+driver);
		
		}
		}
		if(browsername.equals("Firefox"))
		{
			if(driver2==null)
			{
			System.setProperty("webdriver.chrome.driver", "U:\\Automation\\drivers\\chromedriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox Browser Instance Created :"+driver);
			driver.navigate().to(baseurl2);
			}	
		}
		if(browsername.equals("Chrome"))
		{
			if(driver2==null)
			{
			System.setProperty("webdriver.chrome.driver", "U:\\Automation\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome Browser Instance Created :"+driver);
			
			driver.navigate().to(baseurl2);
			//System.out.println("Base URL :"+PropertiesUtility.getProperty("baseurl"));
			}
		}
		return driver;
	}

	public static WebDriver getDriver(String browsername, WebDriver driver2, String baseurl2, String environment) {
		// TODO Auto-generated method stub
		if(browsername.equals("Edge"))
		{
			EdgeOptions options = new EdgeOptions();

	        // Example options
	        //options.addArguments("--headless"); // Run in headless mode
	        //options.addArguments("--disable-gpu"); // Disable GPU
	        //options.addArguments("--start-maximized"); // Start maximized
	        //options.addArguments("--disable-extensions"); // Disable extensions

	        // Custom preferences
	        HashMap<String, Object> prefs = new HashMap<String,Object>();
	        prefs.put("profile.default_content_settings.popups", 0); // Disable popups
	        prefs.put("download.default_directory", "C:\\Downloads"); // Set download path
	        
	        //options.setExperimentalOption("prefs", prefs);
		if(driver2==null)
		{
		System.setProperty("webdriver.edge.driver", "U:\\Automation\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		System.out.println("Edge Browser Instance Created :"+driver);
		
		}
		}
		if(browsername.equals("Firefox"))
		{
			if(driver2==null)
			{
			System.setProperty("webdriver.chrome.driver", "U:\\Automation\\drivers\\chromedriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox Browser Instance Created :"+driver);
			driver.navigate().to(baseurl2);
			System.out.println("Environment:"+environment);
			}	
		}
		if(browsername.equals("Chrome"))
		{

			ChromeOptions options = new ChromeOptions();
			
			Map<String, Object> prefs = new HashMap<String,Object>();
	        prefs.put("profile.default_content_settings.popups",0); // Disable popups
	        prefs.put("download.default_directory", ""); // Set download path
	        options.setExperimentalOption("prefs", prefs);
	        
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			options.setHeadless(false);
			
			options.addArguments("--incognito");
			options.addArguments("--start-maximized");
			options.addArguments("--window-size=800,600");
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-popup-blocking");
			options.addArguments("--disable-notifications");
			if(driver2==null)
			{
			System.setProperty("webdriver.chrome.driver", "U:\\Automation\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome Browser Instance Created :"+driver);
			
			driver.navigate().to(baseurl2);
			System.out.println("Environment:"+environment);
			//System.out.println("Base URL :"+PropertiesUtility.getProperty("baseurl"));
			}
		}
		return driver;
	}

}
