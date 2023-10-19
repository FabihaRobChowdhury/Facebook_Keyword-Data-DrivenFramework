package com.facebook.baseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.facebook.Ulitilities.ReadPropertise;

public class BaseTest {

	protected WebDriver driver;
	
	ReadPropertise readproperties;
	//String browser="chrome";

	@BeforeMethod(groups = { "smoke", "regression" })
	
	
	public void openapp() {
		readproperties = new ReadPropertise();
		
		String browser=readproperties.getBrowser();  
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("firebox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Wrong Browser");
		}
		
		
		driver.get(readproperties.getURL());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	/*
	 * public void openBrowser() { edge(); }
	 * 
	 * public WebDriver chrome() {
	 * 
	 * driver = new ChromeDriver(); driver.get("https://www.facebook.com/");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); return
	 * driver;
	 * 
	 * }
	 */
	  
	/*
	 * public WebDriver edge() {
	 * 
	 * driver = new EdgeDriver(); driver.get("https://www.facebook.com/");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); return
	 * driver;
	 * 
	 * }
	 * 
	 * public WebDriver firefox() {
	 * 
	 * driver = new FirefoxDriver(); driver.get("https://www.facebook.com/");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); return
	 * driver;
	 * 
	 * }
	 */
	 

	//@AfterMethod(groups = { "smoke", "regression" })
	public void colseApp() {
		if (driver != null) {
			driver.close();

		}
	}

}
