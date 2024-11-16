package AdvanceScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteKeys {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		WebElement un = driver.findElement(By.name("user-name"));
		un.sendKeys("standard_user");
	
//		un.sendKeys(Keys.CONTROL +"a");
//		un.sendKeys(Keys.CONTROL+"c");
//		
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys(Keys.CONTROL + "v");
		
		un.sendKeys("user-name",Keys.CONTROL+"a");
		un.sendKeys(Keys.CONTROL+"c");
		un.sendKeys(Keys.TAB,Keys.CONTROL+"v");

	}

}
