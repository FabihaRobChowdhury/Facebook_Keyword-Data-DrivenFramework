package com.facebook.LoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Dynamic {
	WebDriver driver;
	
	public LoginPage_Dynamic(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void email(String enterUsername) {
		driver.findElement(By.id("email")).sendKeys(enterUsername);
	}

	
	/*
	 * public void email11() {
	 * driver.findElement(By.id("email")).sendKeys("abc@gmail.com"); }
	 */
	
	
	public void password(String enterPassword) {
		driver.findElement(By.id("pass")).sendKeys(enterPassword);
	}
	
	/*
	 * public void password11() {
	 * driver.findElement(By.id("pass")).sendKeys("123456"); }
	 */
	public void login_button() {
		driver.findElement(By.name("login")).click();
	}
}
