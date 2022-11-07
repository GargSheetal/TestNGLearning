package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	
	@DataProvider(name="create")
	public Object[][] DataSet1(Method m)
	{
		Object[][] testData = null;
		
		if(m.getName().equals("test"))
		{
			testData = new Object[][]
			{
			{"Username1", "password1"},
			{"Username2", "password2"},
			{"Username3", "password3"},
			{"Username4", "password4"}
			};
		}
		
		else if(m.getName().equals("test1"))
		{
			testData = new Object[][]
			{		
				{"Username1", "password1", "test1"},
				{"Username2", "password2", "test2"},
				{"Username3", "password3", "test3"},
				{"Username4", "password4", "test4"}
			};
		}
		
		else if(m.getName().equals("test2"))
		{
			testData = new Object[][]
			{		
				{"Username1", "password1", "test1", 25},
				{"Username2", "password2", "test2", 29},
				{"Username3", "password3", "test3", 32},
				{"Username4", "password4", "test4", 40}
			};
		}
		return testData;
	
	}
	
}
