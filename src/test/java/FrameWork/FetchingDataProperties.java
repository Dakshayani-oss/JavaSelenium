package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataProperties {

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
	        driver.findElement(By.id("user-name")).sendKeys(UN); 
	        driver.findElement(By.id("password")).sendKeys(PWD); 
	        driver.findElement(By.id("login-button")).click();
		
	}

}
