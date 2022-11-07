package pageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPage {
	
	WebDriver driver;
	
	By firstName = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
	By lastName = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
	By address = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea");
	By emailAdd = By.xpath("//*[@id=\"eid\"]/input");
	By phone = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
	By genderMale = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input");
	By genderFemale = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input");
	By hobbyCricket = By.xpath("//*[@id=\"checkbox1\"]");
	By hobbyMovies = By.xpath("//*[@id=\"checkbox2\"]");
	By hobbyHockey = By.xpath("//*[@id=\"checkbox3\"]");
	By languages = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select");
	By skills = By.xpath("//*[@id=\"Skills\"]");
	By selectCountry = By.id("country");
	By dobYear = By.xpath("//*[@id=\"yearbox\"]");
	By dobMonth = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select");
	By dobDay = By.xpath("//*[@id=\"daybox\"]");
	By password = By.xpath("//*[@id=\"firstpassword\"]");
	By confirmPass = By.xpath("//*[@id=\"secondpassword\"]");
	By submitBtn = By.xpath("//*[@id=\"submitbtn\"]");
	By refreshBtn = By.xpath("//*[@id=\"Button1\"]");
	
	
	RegistrationPage(WebDriver d)
	{	
		driver = d;
	}
	
	public void setFirstName(String fName)
	{
		driver.findElement(firstName).sendKeys(fName);
	}
	
	public void setLastname(String lName)
	{
		driver.findElement(lastName).sendKeys(lName);
	}
	
	public void setAddress(String addr)
	{
		driver.findElement(address).sendKeys(addr);
	}
	
	public void setEmail(String email)
	{
		driver.findElement(emailAdd).sendKeys(email);
	}
	
	public void setPhone(String phn)
	{
		driver.findElement(phone).sendKeys(phn);
	}
	
	public void selectGenderMale()
	{
		driver.findElement(genderMale).click();
	}
	
	public void selectGenderFemale()
	{
		driver.findElement(genderFemale).click();
	}
	
	public void selectHobCric()
	{
		driver.findElement(hobbyCricket).click();
	}
	
	public void selectHobMovies()
	{
		driver.findElement(hobbyMovies).click();
	}
	
	public void selectHobHockey()
	{
		driver.findElement(hobbyHockey).click();
	}
	
	public void setLanguages(String langua)
	{
		WebElement lan = driver.findElement(languages);
		Select drop = new Select(lan);
		drop.selectByVisibleText(langua);
	}
	
	public void selectSkills(String skill)
	{
		WebElement sk = driver.findElement(skills);
		Select drop = new Select(sk);
		drop.selectByVisibleText(skill);
	}
	
	public void setCountry(String country)
	{
		WebElement con = driver.findElement(selectCountry);
		Select drop = new Select(con);
		drop.selectByVisibleText(country);
	}
	
	public void setDOBYear(String year)
	{
		WebElement yr = driver.findElement(dobYear);
		Select drop = new Select(yr);
		drop.selectByVisibleText(year);
	}
	
	public void setDOBMonth(String month)
	{
		WebElement mon = driver.findElement(dobMonth);
		Select drop = new Select(mon);
		drop.selectByVisibleText(month);
	}
	
	public void setDOBDay(String day)
	{
		WebElement Day = driver.findElement(dobDay);
		Select drop = new Select(Day);
		drop.selectByVisibleText(day);
	}
	
	public void setPassword(String pswrd)
	{
		driver.findElement(password).sendKeys(pswrd);
	}
	
	public void setConfirmPassword(String conPass)
	{
		driver.findElement(confirmPass).sendKeys(conPass);
	}
	
	public void selectSubmit()
	{
		driver.findElement(submitBtn).click();
	}
	
	public void selectRefresh()
	{
		driver.findElement(refreshBtn).click();
	}
	
}
