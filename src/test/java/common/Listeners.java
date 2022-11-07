package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.TestUtils;

public class Listeners extends TestUtils implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is - " + result.getName());
		System.out.println("Test case is starting");
	}

	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("Status of execution is - " +result.getStatus());
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		System.out.println("Test failed - Screenshot Captured");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reporter.log("<a href=\"C:\\Sheetal\\QA_training\\eclipse-workspace\\TestNGLearning\\screenshot\\Tue-Nov-23-10-55-58-EST-2021.png\">Test Results</a>");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
}
