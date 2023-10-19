package com.facebook.Ulitilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//helper class
//test.propertise read korbo
//2 ta kaj korbo

public class ReadPropertise {
	Properties properties; // Properties file's job read something

	public ReadPropertise() { // constructor - name start with Upper case letter
		properties = new Properties();

		//test.propertise e niye jawa readprooertise re path dekaiya
		try {
			FileInputStream fis = new FileInputStream("src/test/resources/test.properties");  //direct the path to go to test.properties file
			properties.load(fis);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public String getBrowser() {
		return properties.getProperty("browser");
	}
	
	public String getURL() {
		return properties.getProperty("url");	
	}
	
	public String getEmail() {
		return properties.getProperty("email");	
	}
	
	
	public String getEmail2() {
		return properties.getProperty("email2");	
	}
	
	public String getPassword() {
		return properties.getProperty("password");	
	}
	
	
	//checking code is running well or not
	public static void main(String[] args) {
		ReadPropertise rd = new ReadPropertise();
		System.out.println(rd.getURL());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
