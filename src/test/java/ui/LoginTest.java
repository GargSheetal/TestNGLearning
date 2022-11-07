package ui;


import org.testng.annotations.*;

import common.CommonDataSetup;


public class LoginTest extends CommonDataSetup{

	@BeforeTest	// run before all the tests
	public void loginToApplication()
	{
		System.out.println("Login to Application");
	}
	
	@AfterTest	// run after all the tests
	public void logoutFromApplication()
	{
		System.out.println("Logout from Application");
	}
	
	@BeforeMethod	// executed before every test
	public void connectToDB()
	{
		System.out.println("DB Connected");
	}
	
	@AfterMethod	// executed after every test
	public void disconnectFromDB()
	{
		System.out.println("DB Disconnected");
	}
	
	@Test(priority=1, description="Testing 1", groups="regression")
	public void bTest1()
	{
		System.out.println("Testing1");
	}
	
	@Test(priority=2, description="Testing 2")
	public void aTest2()
	{
		System.out.println("Testing2");
	}
	
}
