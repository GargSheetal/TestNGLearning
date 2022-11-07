package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;

public class ListenerDemoTest extends BaseTest{

	@Test(retryAnalyzer = common.Retry.class)
	public void LaunchApp()
	{
		driver.get("https://www.ebay.com/");
		Assert.assertTrue(false);
	}
	
}
