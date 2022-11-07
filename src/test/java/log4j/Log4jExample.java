/*
package log4j;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log4jExample {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("Log4jExample");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		logger.info("Browser Initialized");
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
	

	}

}
*/
package log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4jExample {
  
	public static void main(final String[] args)
  {
      Logger logger = LoggerFactory.getLogger(Log4jExample.class);

      logger.debug("Debug Message Logged !!!");
      logger.info("Info Message Logged !!!");
      logger.error("Error Message Logged !!!", new NullPointerException("NullError"));
  }
}
