package extentReportsDemo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NoCommerceSiteTest extends ExtentReportSetup{
	
	@Test
	public void noCommerceTitleTest()
	{
		test = extent.createTest("noCommerceTitleTest");
		
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		Assert.assertEquals(actTitle, "Freeand open-source eCommerce platform. ASP.NET based shopping cart. - nopCommerce");
		
	}
	
	@Test
	public void noCommerceLogoTest()
	{
		test = extent.createTest("noCommerceLogoTest");
		
		Boolean logoStatus = driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/div/div[1]/a/img")).isDisplayed();
		Assert.assertTrue(logoStatus);
	}
	
	@Test
	public void noCommerceLoginTest()
	{
		test = extent.createTest("noCommerceLoginTest");
		
		test.createNode("Testing with valid data");
		Assert.assertTrue(true);
		
		test.createNode("Testing with invalid data");
		Assert.assertTrue(true);
		
	}

}
