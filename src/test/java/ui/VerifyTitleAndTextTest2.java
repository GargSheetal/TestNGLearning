package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.CommonDataSetup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleAndTextTest2 extends CommonDataSetup{
		
	// Soft asserts do not make the test fail and script continue running even if any assert fails.
		
	SoftAssert softAssert = new SoftAssert();	// making object of softAssert class. 
	
	@Test
	public void titleTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		String expTitle = "Electronics, fty Cars, Fashion, Collectibles & More | eBay";
		String actTitle = driver.getTitle();
		
		String expText = "xdds Search";
		String actText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		
		System.out.println("Verifying Title");
		softAssert.assertEquals(actTitle, expTitle, "Title verification failed --");
		
		System.out.println("Verifying Text");
		softAssert.assertEquals(actText, expText, "Text verification failed --");
		
		System.out.println("Closing Browser");
		driver.close();
		softAssert.assertAll();	//it reports ant failure in the test case. Without this line soft asserts applied above will pass the failed test 
								// without reporting any failure.
		
	}
	
	

}
