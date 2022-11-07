package ui;

import org.testng.annotations.*;

import common.CommonDataSetup;

@Test(groups="User-Registration")
public class GroupsDemoTest extends CommonDataSetup{
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Run this before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Run this after class");
	}
	
	@BeforeGroups(value="regression")
	public void beforeGroup()
	{
		System.out.println("Run this method before regression");
	}
	
	@AfterGroups(value="regression")
	public void afterGroup()
	{
		System.out.println("Run this method after regression");
	}
	
	@Test(priority=1, groups="regression")
	public void aTest1()
	{
		System.out.println("Testing1");
	}
	
	@Test(priority=2, groups="regression")
	public void bTest2()
	{
		System.out.println("Testing2");
	}
	
	@Test(groups={"regression", "bvt"})
	public void cTest3()
	{
		System.out.println("Testing3");
	}
	
	@Test(groups="bvt")
	public void dTest4()
	{
		System.out.println("Testing4");
	}
	
	

}
