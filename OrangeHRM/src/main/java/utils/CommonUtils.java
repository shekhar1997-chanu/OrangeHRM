package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonUtils {
	public static WebDriver driver;
	public static Properties config;
	public static String configFilePath = "\\src\\test\\resources\\config.properties";
	
	public static Properties readPropertiesFile (String filename) throws IOException
	{ 
		try {
		FileInputStream fis = new FileInputStream (filename);
		config = new Properties ();
		config.load(fis);
		}
		catch (Exception e)
		{
			TestNgUtils.assertFail(e.getMessage());
		}
		return config;
	}
	
	public static void initialize () throws IOException
	{
		config= readPropertiesFile(System.getProperty("user.dir")+configFilePath);
	}
	
	public static void navigateBrowserAndLaunchApplication ()
	{
		try {
			String browserName = config.getProperty("browser");
			if(browserName.equalsIgnoreCase("chrome")) {
				
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}else if(browserName.equalsIgnoreCase("firefox")){
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			}else if(browserName.equalsIgnoreCase("edge")) {
				
				driver = new EdgeDriver();
				driver.manage().window().maximize();
			}
				
			driver.get(config.getProperty("url"));
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void hardWait (int millies) throws Exception
	{
		try {
		Thread.sleep(millies * 1000);
		}
		catch (Exception e)
		{
			TestNgUtils.assertFail(e.getMessage());
		}
	}
	
	public static WebElement findElement (By by)
	{
		WebElement element= null;
		try {
		 element = driver.findElement(by);
		}
		catch (Exception e)
		{
			TestNgUtils.assertFail(e.getMessage());
		}
		return element;
	}
	
	public static List<WebElement> findElements (By by)
	{
		List<WebElement> elements= null;
		try {
		 elements = driver.findElements(by);
		}
		catch (Exception e)
		{
			TestNgUtils.assertFail(e.getMessage());
		}
		return elements;
	}
	
	public static void clickElement (By by)
	{
		try {
		findElement(by).click();
		}
		catch (Exception e)
		{
			TestNgUtils.assertFail(e.getMessage());
		}
	}
	
	public static void enterValue (By by, String name, boolean isClear)
	{
		if(isClear)
		{
			clearWhloleText(by);
		}
		findElement(by).sendKeys(name);
	}
	
	public static void clearWhloleText(By by)
	{
		findElement(by).clear();
	}
	
	public static String getTitle ()
	{
		String title=null;
		try {
		 title = driver.getTitle();
		}
		catch (Exception e)
		{
			TestNgUtils.assertFail(e.getMessage());
		}
		return title;
	}
	
	public static String getText (By by)
	{
		String text=null;
		try {
		 text = findElement(by).getText();
		}
		catch (Exception e)
		{
			TestNgUtils.assertFail(e.getMessage());
		}
		return text;
	}
	
	public static boolean  isDisplayed (By by)
	{
		boolean dispayed=false;
		try {
		 dispayed=findElement(by).isDisplayed();
		}
		catch (Exception e)
		{
			TestNgUtils.assertFail(e.getMessage());
		}
		return dispayed;
	}
	
	

}
