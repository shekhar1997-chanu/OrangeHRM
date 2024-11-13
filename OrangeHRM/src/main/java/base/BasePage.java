package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.CommonUtils;

public class BasePage {
	WebDriver driver;
	
	@BeforeClass
	public void setup () throws Exception
	{
		CommonUtils.initialize();
		CommonUtils.navigateBrowserAndLaunchApplication();
	}
	
	@AfterClass
	public void close ()
	{
		//driver.quit();
	}

}
