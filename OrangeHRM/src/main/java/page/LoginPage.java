package page;

import org.openqa.selenium.By;

import utils.CommonUtils;

public class LoginPage {
	
	public static final By by_myaccount =By.xpath("//span[normalize-space()='My Account']");
	public static final By by_login = By.xpath("//a[normalize-space()='Login']");
	public static final By by_email =By.xpath("//input[@id='input-email']");
	public static final By by_password =By.xpath("//input[@id='input-password']");
	public static final By by_loginbtn =By.xpath("//input[@value='Login']");
	
	
	public static By getMyaccount ()
	{
		return by_myaccount;
	}
	
	public static By getLogin ()
	{
		return by_login;
	}
	
	public static By getEmail ()
	{
		return by_email;
	}
	
	public static By getPassword ()
	{
		return by_password;
	}
	
	public  static By getLoginbtn()
	{
		return by_loginbtn;
	}
	
	
	public static void login () throws Exception
	{
		CommonUtils.enterValue(getEmail(), "ramyabehra@gmail.com", true);
		CommonUtils.enterValue(getPassword(), "ramya@1997", true);
		CommonUtils.hardWait(5);
		CommonUtils.clickElement(getLoginbtn());
	}
	

}
