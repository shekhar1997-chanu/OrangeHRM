package page;

import org.openqa.selenium.By;

public class HomePage {
	
	public static final By by_myaccountTxt = By.xpath("//h2[normalize-space()='My Account']");
	public static final By by_logout =By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']");
	public static final By by_logouttxt=By.xpath("//h1[normalize-space()='Account Logout']");
	public static final By by_editaccount =By.xpath("//a[normalize-space()='Edit Account']");
	public static final By by_telephone =By.xpath("//input[@id='input-telephone']");
	public static final By by_continue =By.xpath("//input[@value='Continue']");
	public static final By by_successmsg =By.xpath("//div[@class='alert alert-success alert-dismissible']");
	
	public static By getText ()
	{
		return by_myaccountTxt;
	}
	
	public static By getLogout ()
	{
		return by_logout;
	}
	
	public static By getLogoutText ()
	{
		return by_logouttxt;
	}
	
	public static By getEditAccount ()
	{
		return by_editaccount;
	}
	
	public static By getTelepbone ()
	{
		return by_telephone;
	}
	
	public static By getContinue ()
	{
		return by_continue;
	}
	
	public static By getSuccessMsg ()
	{
		return by_successmsg;
	}

}
