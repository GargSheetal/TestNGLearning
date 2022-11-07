package ui;

import org.testng.annotations.*;

import common.CommonDataSetup;


public class GroupsDemoTest2 extends CommonDataSetup{
	
	
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
