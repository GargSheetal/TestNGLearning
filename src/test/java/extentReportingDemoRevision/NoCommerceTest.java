package extentReportingDemoRevision;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class NoCommerceTest extends ExtentReportingDemo 
{
	@Test
	public void noCommerceTitleTest()
	{
		test=extent.createTest("noCommerceTitleTest"); 	// create a new entry of the test in the extent reports
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Free and open-source eCommerce platform. ASP.NET Core based shopping cart. - nopCommerce");
	}
	
	@Test
	public void noCommerceLogoTest()
	{
		test=extent.createTest("noCommerceLogoTest"); 	// create a new entry of the test in the extent reports
		
		Boolean logoStatus=driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/nav/div[2]/a/img")).isDisplayed();
		Assert.assertTrue(logoStatus);
	}
	
	@Test
	public void noCommerceLoginTest()
	{
		test=extent.createTest("noCommerceLoginTest"); 	// create a new entry of the test in the extent reports
		
		test.createNode("Login with valid input");
		Assert.assertTrue(true);
		
		test.createNode("Login with invalid input");
		Assert.assertTrue(true);
		
	}

	
}

