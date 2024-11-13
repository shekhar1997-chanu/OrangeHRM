package tests;

import org.testng.annotations.Test;

import base.BasePage;
import page.HomePage;
import page.LoginPage;
import utils.CommonUtils;
import utils.TestNgUtils;

public class TestLoginPage extends BasePage{

	@Test(description="verify login functionality", priority=0)
	public void TestLogin () throws Exception
	{
		CommonUtils.clickElement(LoginPage.getMyaccount());

		CommonUtils.clickElement(LoginPage.getLogin());

		LoginPage.login();

		TestNgUtils.assertTrue(CommonUtils.getText(HomePage.getText()), "My Account");

	}
	
	@Test(description="verify edit account", priority=1)
	public void EditAccount ()
	{
	CommonUtils.clickElement(HomePage.getEditAccount());
	CommonUtils.enterValue(HomePage.getTelepbone(), "111111111", true);
	CommonUtils.clickElement(HomePage.getContinue());
	CommonUtils.isDisplayed(HomePage.getSuccessMsg ());

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


//	@Test(description = "verify logout", priority=1)
//	public static void LogoutApp ()
//	{
//		CommonUtils.clickElement(HomePage.getLogout());
//	}
//
//	@Test(priority=2)
//	public static void Verify_Logout_Text ()
//	{
//
//		TestNgUtils.assertTrue(CommonUtils.getText(HomePage.getLogoutText()), "Account Logout");
//	}

}
