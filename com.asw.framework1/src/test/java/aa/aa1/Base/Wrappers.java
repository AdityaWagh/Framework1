package aa.aa1.Base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wrappers {
	private WebDriver driver;
	private WebDriverWait wait;
	public Wrappers() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Wrappers(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}


	public void click(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,60); 
		wait.until(ExpectedConditions.visibilityOf(element));
		//wait.until(ExpectedConditions.);
		element.click();
		}
	
	public void click(WebDriver driver,WebElement element,int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver,timeout); 
		wait.until(ExpectedConditions.visibilityOf(element));
		//wait.until(ExpectedConditions.);
		element.click();
	}
	
	public void click(WebDriver driver,WebElement element,int timeout,int retry) throws Exception
	{
		int maxattempt = retry;
		int attempt =0;
		while(attempt<maxattempt)
		{
	    try
	    {
	    	element.click();
	    }
	    catch(StaleElementReferenceException e)
	    {
	    	attempt++;
	    }
		catch(TimeoutException e)
		{
			
		} throw new Exception("Element could not be found after max retry attempts");
	} 

}
}