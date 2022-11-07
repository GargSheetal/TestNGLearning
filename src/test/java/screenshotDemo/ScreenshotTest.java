package screenshotDemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotTest {

	WebDriver driver;
	
	@Test(description="Screenshot of a complete page")
	public void screenshotOfaPage() throws IOException
	{	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		
		// type-casting--> is basically a conversion from one type to another
		TakesScreenshot ts = (TakesScreenshot)driver; //type-casting driver object into TakesScreenshot class 
		
		String datename = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss.SSSS").format(new Date());
		
		File source = ts.getScreenshotAs(OutputType.FILE);	// this will return the screenshot which is saved in a File variable.
		
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + "HomePage" + datename + ".png");	// created a target file location
		
		// copying the source file in the target file
		FileUtils.copyFile(source, target);	//this statement will copy the screenshot from source file to target file
		
		driver.close();
		
	} 
	
	@Test(description="Screenshot of a Section in a page")
	public void screenshotOfaSectionInaPage() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		
		//capturing a section of the page and storing its location in a webelement
		WebElement pageSection = driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/section/div/div/div/div/div/div/div[2]/div/div[3]"));
		
		highlightElement(pageSection, driver); //calling highlight method to highlight the section of the page 
		
		String datename = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss.SSSS").format(new Date());
		
		File source = pageSection.getScreenshotAs(OutputType.FILE);
		
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + "WhyNopCommerceSection" +datename + ".png");
		FileUtils.copyFile(source, target);
		
		driver.close();
	}
	
	@Test(description="Screenshot of a WebElement")
	public void screenshotOfaElement() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		
		String datename = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss.SSSS").format(new Date());
		
		//capturing the logo element and storing its location in a web element
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/nav/div[2]/a/img"));
		highlightElement(logo, driver); //calling highlight method to highlight logo 
		
		File source = logo.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./Screenshots/" + "NopLogoElement" +datename + ".png");
		FileUtils.copyFile(source, target);
		
		driver.close();
	}
	
	
	void highlightElement(WebElement ele, WebDriver driver)	// takes 2 arguments-- WebElement and the driver object
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;	//type casting driver object into JavascriptExecutor class
		js.executeScript("arguments[0].style.border='2px solid red'", ele);
	}
	
	
	
}
