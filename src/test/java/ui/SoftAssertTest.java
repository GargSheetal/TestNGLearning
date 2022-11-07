package ui;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.CommonDataSetup;

public class SoftAssertTest extends CommonDataSetup{

	SoftAssert softAssert1 = new SoftAssert();
	SoftAssert softAssert2 = new SoftAssert();
	
	@Test
	public void Test1()
	{
		softAssert1.assertEquals("wel", "Welcome", "Test Failed--");
		softAssert1.assertAll();
	}
	
	@Test
	public void Test2()
	{
		softAssert2.assertEquals("SELENIUM", "SELENIUM");
		softAssert2.assertAll();
	}
	
	
}
