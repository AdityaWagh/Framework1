package aa.aa1.Base;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserFactoryThread   {
	private static WebDriver driver;
	private static WebDriverWait wait;
	private static final ThreadLocal<WebDriver> driverl = new ThreadLocal<WebDriver>();
	
	private  BrowserFactoryThread()
	{
//
	}
	   
		
	 public static WebDriver getDriverlocal(String browsername) 
	 {
	        WebDriver driverLocal = driverl.get();
	        if(browsername.equalsIgnoreCase("Chrome"))
	        {
	        if (driverLocal == null) {
	        System.setProperty("webdriver.chrome.driver", "U:\\Automation\\drivers\\chromedriver.exe");
			driverLocal = new ChromeDriver();
			System.out.println("Chrome Browser Instance Created :"+driver);
			
	            driverl.set(driverLocal);
	        }
	        }
	        if(browsername.equalsIgnoreCase("Edge"))
	        {
	        	if (driverLocal == null) {
	    	        System.setProperty("webdriver.edge.driver", "U:\\Automation\\drivers\\msedgedriver.exe");
	    			driverLocal = new EdgeDriver();
	    			System.out.println("Edge Browser Instance Created :"+driver);
	    			
	    	            driverl.set(driverLocal);
	    	        }	
	        }
	        return driverLocal;
	    }

	    public static void removeDriver() {
	        driverl.remove();
	    }
	

}

