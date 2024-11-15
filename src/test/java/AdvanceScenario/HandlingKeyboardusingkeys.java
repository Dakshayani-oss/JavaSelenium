package AdvanceScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyboardusingkeys {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//case1
//		driver.findElement(By.name("user-name")).sendKeys("standard_user");
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("secret_sauce");
//		password.sendKeys(Keys.ENTER);

		
		//case2
//		WebElement tab = driver.findElement(By.name("user-name"));
//		tab.sendKeys("standard_user");
//		tab.sendKeys(Keys.TAB,"secret_sauce",Keys.ENTER);
		
		//case3:
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		
	}

}
