package AdvanceScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplcitWait {

		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/v1/");
			driver.manage().window().maximize();
			
//			// is should be written in form of condition
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			
			WebElement login = driver.findElement(By.id("login-button"));
//			WebDriverWait ex = new WebDriverWait(driver, Duration.ofSeconds(10));
//			ex.until(ExpectedConditions.elementToBeClickable(login));
//			login.click();
//			
//			ex.until(ExpectedConditions.titleContains("Swag Labs"));
//			driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
//			
//			//or
//			ex.until(ExpectedConditions.titleContains("Hello"));
//			driver.findElement(By.xpath("//button[text()='ADD TO CART'])[1]")).click();
	
		//---------Fluent wait-------------------
		
		FluentWait fluent = new FluentWait(driver);
		fluent.withTimeout(Duration.ofSeconds(10));
		fluent.pollingEvery(Duration.ofSeconds(1));
		fluent.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		
		//and
		
		fluent.until(ExpectedConditions.titleContains("Hello"));
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[2]")).click();
		
		}
		
}
