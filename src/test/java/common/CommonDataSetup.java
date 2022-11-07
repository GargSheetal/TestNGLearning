package common;

import org.testng.annotations.*;

public class CommonDataSetup {

	@BeforeSuite
	public void dataSetup()
	{
		System.out.println("Common Data Setup");
	}
	
	@AfterSuite
	public void dataCleanup()
	{
		System.out.println("Common Data Cleanup");
	}
	
	
}
