package aa.aa1;

import java.io.IOException;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;

public class test1 {
	WebDriver driver;
	
	
	/*
	 * public test1() { //System.out.println(browsername);
	 * //System.setProperty("webdriver.chrome.driver",
	 * "U:\\Automation\\drivers\\chromedriver.exe"); //WebDriver driver = new
	 * ChromeDriver(); //driver.navigate().to("https://www.amazon.in/");
	 * 
	 * 
	 * 
	 * }
	 * 
	 * public WebDriver get() { try { driver = DriverBase.getDriver();
	 * 
	 * } catch(Exception e) { e.printStackTrace(); } return driver; }
	 * 
	 * 
	 * public void enterUserName() throws Exception {
	 * 
	 * driver.findElement(By.id("")).sendKeys("User1");
	 * 
	 * throw new Exception("ELement"); }
	 */
	@Test
	public void  enterUserName1() throws Exception 
	{ 
		
		driver.navigate().to("https://www.facebook.com/?gclid=CjwKCAjwko21BhAPEiwAwfaQCDRn1e-vGvd-bQAVulYCAXjoJTy5uXhOv6_GmrGWdjswPrVPOdv2lBoCU6MQAvD_BwE");
		WebElement element= driver.findElement(By.name("email"));
		Actions actions = new Actions(driver);
		actions.sendKeys("aa@aa.com");
		
		WebElement element2= driver.findElement(By.name("pass"));
		actions.sendKeys("Paaass");
		
		actions.keyDown(element, Keys.CONTROL).sendKeys("A");
		actions.sendKeys(Keys.DELETE);
		
		
		
		throw new Exception("ELement");
	}
}

			
		
	

