package extentReportingDemoRevision;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportingDemo {

	public WebDriver driver;
	
	// make objects of the 3 classes of extent reports as follows
	
	public ExtentSparkReporter sparkReporter;	//This class is responsible for look and feel of your report
	public ExtentReports extent;	//This class is used to create entries in your report
	public ExtentTest test;	//This class is used to update status in your report
	
	
	@BeforeTest
	public void setExtent()
	{
		// instantiate the objects of the extent report classes
		
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/ExtentReports.html"); //provide the path of the folder where you want to generate extent reports
		
		sparkReporter.config().setDocumentTitle("Automation Report");	// setting the Title of the report
		sparkReporter.config().setReportName("Functional Reports");	// setting the name of the report
		sparkReporter.config().setTheme(Theme.DARK);	// setting the name of the report. Theme can be set by using Theme class
		
		extent=new ExtentReports();		// instantiate the object of the ExtentReports class
		extent.attachReporter(sparkReporter);	//attaching the sparkReporter to the object of ExtentReports class
		
		// setting system info 
		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("TesterName", "Sheetal");
		extent.setSystemInfo("Browser", "Chrome");	
	}
	
	@AfterTest
	public void endReport()
	{
		extent.flush(); 	// this method will flush the reports after completion of the test
	}
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException // this method will generate the status of the test methods and store it in the result variable
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "Test Case FAILED is: " + result.getName());	// this will add name of the failed test in the extent report
			test.log(Status.FAIL, "Test Case FAILED is: " + result.getThrowable());	// to add error or exception in the extent reports
			
			String screenshotPath = ExtentReportingDemo.getScreenshot(driver, result.getName());	// return the location of screenshot
			test.addScreenCaptureFromPath(screenshotPath);	// adding screenshot to extent report
			
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "Test case SKIPPED is: " + result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Test case PASSED is: " + result.getName());
		}
		
		driver.quit();
	}
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException
	{
		String dateName = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss.SSSS").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		// after execution you will a folder "Screenshots" under your project 
		String target = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
		File finalTarget = new File(target);
		FileUtils.copyFile(source, finalTarget);
		return target;
		
	}
	
}

