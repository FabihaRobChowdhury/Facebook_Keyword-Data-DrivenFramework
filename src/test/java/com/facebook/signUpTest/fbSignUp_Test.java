package com.facebook.signUpTest;
//client class

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.Ulitilities.ReadExcel;
import com.facebook.baseTest.BaseTest;
import com.facebook.signUpPage.fbSignUp_Page;



public class fbSignUp_Test extends BaseTest{
	//WebDriver driver;
	
	fbSignUp_Page fb;
	
	ReadExcel rd;
	
	@Test
	public void ValidTest() {
		//has a relationship
		
		String filelocation = "src/test/resources/fbsignup.xlsx";

		String sheetName = "Sheet1";

		 rd = new ReadExcel(filelocation, sheetName);
		
		
		 fb = new fbSignUp_Page(driver); //Nested driver/element
		
		fb.clickLogin();
		
		String f_Name= rd.getStringData(1, 0);
		String Surname = rd.getStringData(1, 1);
		String email = rd.getStringData(1, 2);
		String reemail = rd.getStringData(1, 3);
		String password = rd.getStringData(1, 4);
		String day = rd.getStringData(1, 5);
		String month = rd.getStringData(1, 6);
		String year = rd.getStringData(1, 7);
	//	String gender = rd.getStringData(1, 8);
		
		fb.userName(f_Name);
		fb.surName(Surname);
		fb.enterEmail(email);
		fb.reEnterEmail(reemail);
		fb.newPassword(password);
		fb.getDay(day);
		fb.getMonth(month);
		fb.getYear(year);
		fb.clickGender();
		//fb.SignUp();
		
		
		
		
		
		//fb.uName(null);
		//fb.firstName(); findby e public dile instance variable call kora jay.
		
		
	}
}

