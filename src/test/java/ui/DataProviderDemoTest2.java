package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemoTest2 {

	
	@Test(dataProvider="create")
	public void test(String username, String password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		
		String expTitle="Swag Labs";
		String actTitle= driver.getTitle();
		Assert.assertEquals(expTitle, actTitle, "Test Failed");
		
		driver.close();
	}
	
	
	@DataProvider(name="create")
	public Object[][] DataSet1()
	{
		return new Object[][]
			{
			{"standard_user", "secret_sauce"},
			{"locked_out_user", "secret_sauce"},
			{"problem_user", "secret_sauce"},
			{"performance_glitch_user", "secret_sauce"}
			};
		
	}
	
	
}
