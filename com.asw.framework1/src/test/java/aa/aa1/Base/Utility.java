package aa.aa1.Base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import aa.aa1.WebTests.TestHomePage;

public class Utility {
	static WebDriver driver;
	static Logger log= Logger.getLogger(TestHomePage.class);
	public static void createScreenshot(WebDriver driver, String classname,String classmethod)
	{
		
		System.out.println("Inside Take Screenshot");
		
		TakesScreenshot taskesscreenshot=(TakesScreenshot)driver;

		String file=taskesscreenshot.getScreenshotAs(OutputType.BASE64);
		System.out.println("Screenshot File in String:"+file);
		//File file=taskesscreenshot.getScreenshotAs(OutputType.FILE);
		//try {
			//FileUtils.copyFile(file,new File(""));
		//} catch (IOException e) {
			// TODO Auto-generated catch block
			//log.warn(e);
			//e.printStackTrace();
		//}
		


	}

}
