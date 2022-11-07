package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.CommonDataSetup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest extends CommonDataSetup{
	
	@Test
	public void titleTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		String expTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actTitle = driver.getTitle();
		
		Assert.assertEquals(actTitle, expTitle);
		driver.close();
		
	}
	
	

}
