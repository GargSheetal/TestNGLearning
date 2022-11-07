package pageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTest{

	@Test
	public void verifyRegistrationForm()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//RegistrationPage regPage = new RegistrationPage(driver);
		RegistrationPage2 regPage = new RegistrationPage2(driver);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		regPage.setFirstName("Shikha");
		regPage.setLastname("Pareekh");
		regPage.setAddress("489 Joshua Dr, Vorhees, PA");
		regPage.setEmail("abc@gmail.com");
		regPage.setPhone("4567891234");
		regPage.selectGenderFemale();
		regPage.selectHobCric();
		regPage.selectHobMovies();
		//regPage.setLanguages("Hindi");
		//regPage.setLanguages("English");
		regPage.selectSkills("CSS");
		regPage.setCountry("India");
		regPage.setDOBYear("1987");
		regPage.setDOBMonth("October");
		regPage.setDOBDay("10");
		regPage.setPassword("abcd1234");
		regPage.setConfirmPassword("abcd1234");
		regPage.selectSubmit();
		
		// write validation here
		
		//driver.close();
		
	}
	
	
}
