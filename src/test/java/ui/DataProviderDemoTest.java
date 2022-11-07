package ui;

import org.testng.annotations.*;

public class DataProviderDemoTest {

	
	
	@Test(dataProvider="create", dataProviderClass=DataProviderDemo.class)
	public void test(String username, String password)
	{
		System.out.println(username+ " and " +password);	
	}
	
	@Test(dataProvider="create", dataProviderClass=DataProviderDemo.class)
	public void test1(String username, String password, String test)
	{
		System.out.println(username+ "---" +password+ "---" +test);
	}
	
	@Test(dataProvider="create", dataProviderClass=DataProviderDemo.class)
	public void test2(String username, String password, String test, int age)
	{
		System.out.println(username+ "---" +password+ "---" +test+ "---"+age);
	}
	
}
