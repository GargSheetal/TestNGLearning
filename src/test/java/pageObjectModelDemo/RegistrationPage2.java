package pageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage2 {
	
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")		// Syntax1
	WebElement firstName;
	
	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")		// Syntax2
	WebElement lastName;
	
	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")		
	WebElement address;
	
	@FindBy(xpath = "//*[@id=\"eid\"]/input")		
	WebElement emailAdd;
	
	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")	
	WebElement phone;
	
	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")		
	WebElement genderMale;
	
	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")		
	WebElement genderFemale;
	
	@FindBy(id = "checkbox1")	
	WebElement hobbyCricket;
	
	@FindBy(id = "checkbox2")		
	WebElement hobbyMovies;
	
	@FindBy(id = "checkbox3")		
	WebElement hobbyHockey;
	
	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul")		
	WebElement languages;
	
	@FindBy(id = "Skills")		
	WebElement skills;
	
	@FindBy(id = "country")		
	WebElement selectCountry;
	
	@FindBy(id = "yearbox")		
	WebElement dobYear;
	
	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")		
	WebElement dobMonth;
	
	@FindBy(id = "daybox")		
	WebElement dobDay;
	
	@FindBy(xpath = "//*[@id=\"firstpassword\"]")		
	WebElement password;
	
	@FindBy(id = "secondpassword")		
	WebElement confirmPass;
	
	@FindBy(id = "submitbtn")		
	WebElement submitBtn;
	
	@FindBy(id = "Button1")		
	WebElement refreshBtn;
	
	RegistrationPage2(WebDriver d)
	{	
		driver = d;
		PageFactory.initElements(d, this);		//additional method
	}
	
	public void setFirstName(String fName)
	{
		firstName.sendKeys(fName);
	}
	
	public void setLastname(String lName)
	{
		lastName.sendKeys(lName);
	}
	
	public void setAddress(String addr)
	{
		address.sendKeys(addr);
	}
	
	public void setEmail(String email)
	{
		emailAdd.sendKeys(email);
	}
	
	public void setPhone(String phn)
	{
		phone.sendKeys(phn);
	}
	
	public void selectGenderMale()
	{
		genderMale.click();
	}
	
	public void selectGenderFemale()
	{
		genderFemale.click();
	}
	
	public void selectHobCric()
	{
		hobbyCricket.click();
	}
	
	public void selectHobMovies()
	{
		hobbyMovies.click();
	}
	
	public void selectHobHockey()
	{
		hobbyHockey.click();
	}
	
	public void setLanguages(String langua)
	{
		//WebElement lan = languages;
		Select drop = new Select(languages);
		drop.selectByVisibleText(langua);
	}
	
	public void selectSkills(String skill)
	{
		Select drop = new Select(skills);
		drop.selectByVisibleText(skill);
	}
	
	public void setCountry(String country)
	{
		Select drop = new Select(selectCountry);
		drop.selectByVisibleText(country);
	}
	
	public void setDOBYear(String year)
	{
		Select drop = new Select(dobYear);
		drop.selectByVisibleText(year);
	}
	
	public void setDOBMonth(String month)
	{
		Select drop = new Select(dobMonth);
		drop.selectByVisibleText(month);
	}
	
	public void setDOBDay(String day)
	{
		Select drop = new Select(dobDay);
		drop.selectByVisibleText(day);
	}
	
	public void setPassword(String pswrd)
	{
		password.sendKeys(pswrd);
	}
	
	public void setConfirmPassword(String conPass)
	{
		confirmPass.sendKeys(conPass);
	}
	
	public void selectSubmit()
	{
		submitBtn.click();
	}
	
	public void selectRefresh()
	{
		refreshBtn.click();
	}
	
	

}
