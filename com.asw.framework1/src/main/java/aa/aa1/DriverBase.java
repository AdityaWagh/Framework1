package aa.aa1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class DriverBase {
private static WebDriver driver;
	
	static WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver", "U:\\Automation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

}
