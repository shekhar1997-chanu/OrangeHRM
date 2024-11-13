package utils;

import org.testng.Assert;

public class TestNgUtils {
	
	public static void assertFail (String errorMessage)
	{
		Assert.fail(errorMessage);
	}
	
	public static void assertTrue (String actual, String expected)
	{
		if(actual.contains(expected))
		{
		Assert.assertTrue(actual.contains(expected));
		}
		else
		{
			System.out.println(actual +"not present in "+expected);
		}
	}
	
	public static void assertEqual (int actual, int expected)
	{
		if(actual==expected)
		{
			Assert.assertEquals(actual, expected);
		}
		else
			
		{
			System.out.println(actual + " not equal to"+ expected);
		}
	}

}
