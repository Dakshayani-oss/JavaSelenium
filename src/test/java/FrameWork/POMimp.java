package FrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMrepo.LoginPage;

public class POMimp {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//step1 : path connection
		FileInputStream file = new FileInputStream("C:\\Users\\dakshayani\\OneDrive\\Desktop\\Commondata.properties");
		
		
		//step 2: load all the keys into properties class
		Properties pr = new Properties();
		pr.load(file);
		
		//step 3: read all the keys using getProperty()
		String URL = pr.getProperty("url");
		String UN = pr.getProperty("username");
		String PWD = pr.getProperty("password");
		
		
		 driver.get(URL);
		//normal
//	        driver.findElement(By.id("user-name")).sendKeys(UN); 
//	        driver.findElement(By.id("password")).sendKeys(PWD); 
//	        driver.findElement(By.id("login-button")).click();
		 
		LoginPage open = new LoginPage(driver);
		
		//getterMethods
//		open.getUsertextfield().sendKeys(UN);
//		open.getPasswordTextfield().sendKeys(PWD);
//		open.getLoginButton().click();
		
		
		//Business logic
		open.loginToApp(UN, PWD);

	}

}
