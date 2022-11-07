package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseTest;

public class TestUtils extends BaseTest{
	
	public void getScreenshot() throws IOException
	{
		String dateName = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss.SSSS").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		// after execution you will a folder "Screenshots" under your project 
		String destination =  "./Screenshots/" + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		
	}

}
