package com.facebook.LoginTests;

import org.testng.annotations.Test;

import com.facebook.LoginPages.LoginPage_Dynamic;
import com.facebook.Ulitilities.ReadPropertise;
import com.facebook.baseTest.BaseTest;

public class LoginTest_Dynamic extends BaseTest {
	
	ReadPropertise readproperties;
	LoginPage_Dynamic dy;

//	@Test (priority=1)
	public void ValidLoginTest() {
		readproperties = new ReadPropertise();
		 dy = new LoginPage_Dynamic(driver);
		 
		dy.email(readproperties.getEmail());
		dy.password(readproperties.getPassword());
		dy.login_button();
	}
	
	@Test (priority=2)
	public void InValidLoginTest() {
		readproperties = new ReadPropertise();

		 dy = new LoginPage_Dynamic(driver);
		dy.email(readproperties.getEmail2());
		dy.password(readproperties.getPassword());
		dy.login_button();
	}
	
//	@Test (priority=3)
	public void InValidLoginTest2() {
		dy = new LoginPage_Dynamic(driver);
		dy.email("abcdef@gmail.com");
		dy.password("def147822");
		dy.login_button();
	}
	
}
