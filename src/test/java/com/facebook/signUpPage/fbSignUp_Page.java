package com.facebook.signUpPage;
//Repository class

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class fbSignUp_Page {
	WebDriver driver;
	
	
	//data driven framework
	
	
	public fbSignUp_Page(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy (how=How.XPATH,using="//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']") private WebElement login;
	public WebElement clickLogin() {
		login.click();
		return login;
		
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@data-type='text'][1]") private WebElement firstName; //instance variable create korchi
	
	public WebElement userName(String enterUserName) {
		firstName.sendKeys(enterUserName);
		return firstName;
	}
	
	public WebElement uName(String enterUName) {
		firstName.sendKeys(enterUName);
		return firstName;
	}
	
	/*
	 * public void Surname(String enterSurname) {
	 * driver.findElement(By.xpath("(//input[@data-type='text'])[2]")).sendKeys(
	 * enterSurname); }
	 *  //@FindBy(how=How.XPATH,using="//input[@data-type='text'][2]") private WebElement surname;
	 */
	
	  
	 @FindBy(how=How.XPATH,using="(//input[@data-type='text'])[2]") private WebElement lastname; 
	 public WebElement surName(String enterSurname) {
		 lastname.sendKeys(enterSurname);
		return lastname;
	 }
	 
	
	@FindBy(how=How.XPATH,using="(//input[@data-type='text'])[3]") private WebElement email;
	
	public WebElement enterEmail(String enterEmail) {
		email.sendKeys(enterEmail);
		return email;
	}
	
@FindBy(how=How.XPATH,using="(//input[@data-type='text'])[4]") private WebElement emailConfirm;
	
	public WebElement reEnterEmail(String enterEmailConfirm) {
		emailConfirm.sendKeys(enterEmailConfirm);
		return emailConfirm;
	}
	
	@FindBy (how=How.XPATH,using="//input[@data-type='password']") private WebElement password;
	
	public WebElement newPassword(String enterPassword) {
		password.sendKeys(enterPassword);
		return password;
	}
	
	
	@FindBy (how=How.XPATH,using="//input[@value='1']") private WebElement gender;
	public WebElement clickGender() {
		gender.click();
		return gender;
		
	}
	
	
	@FindBy (how=How.XPATH,using="//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']") private WebElement sign;
	public WebElement SignUp() {
		sign.click();
		return sign;	
	}
	
	
	/*
	 * @FindBy(how=How.NAME,using="birthday_day") private WebElement day;
	 * 
	 * public WebElement selectDay() { day.click(); return day; }
	 */
	
	@FindBy(how=How.ID,using="day") private WebElement day;
	public WebElement getDay(String enterDay) {
		Select sec = new Select(day);
		sec.selectByValue(enterDay);
		return day;	
	}
	
	@FindBy(how=How.ID,using="month") private WebElement month;
	public WebElement getMonth(String enterMonth) {
		Select sec = new Select(month);
		sec.selectByVisibleText(enterMonth);
		return month;	
	}
	
	@FindBy(how=How.ID,using="year") private WebElement year;
	public WebElement getYear(String enterYear) {
		Select sec = new Select(year);
		sec.selectByValue(enterYear);
		return year;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//WebElement is a return type method
	//how is a formula
	//By is same as How
	//FindBy annotation line e access modifier dile o oibo na dile o oibo
	//page object model is design pattern
}
