package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class InsertDatapropertiesFile {
	public static void main(String[] args) throws Throwable {
		FileInputStream file = new FileInputStream("./src\\test\\resources\\Commondata.properties");

		//step 2: load all the keys properrties class
		Properties pr = new Properties();
		
		pr.setProperty("url", "https://www.saucedemo.com/v1/");
		pr.setProperty("username", "standard_user");
		pr.setProperty("password", "secret_sauce");
		
		
		FileOutputStream fos = new FileOutputStream("./src\\\\test\\\\resources\\\\Commondata.properties");
		pr.store(fos, "propertiesFileData");
		
	
	
	
	
	
	}
	
	
	
	
}
