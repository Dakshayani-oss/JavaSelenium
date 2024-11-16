package AdvanceScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseAction {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//Method 1: moving the cursor to particular element
		
//		WebElement VD = driver.findElement(By.xpath("//div[text()='EN']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(VD).perform();
		
		//Method 2:Rightclick on element
		
//		WebElement link = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
//		Actions act = new Actions(driver);
//		act.contextClick(link).perform();
		
		
		//Method 3: Login the page ,  
//		driver.get("https://www.saucedemo.com/v1/");
//		WebElement name = driver.findElement(By.name("user-name"));
//		WebElement password = driver.findElement(By.name("password"));
//		WebElement login = driver.findElement(By.className("btn_action"));
//		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		//case 1
//		act.sendKeys(name, "standard_user").perform();
//		act.sendKeys(password, "secret_sauce").perform();
//		act.sendKeys(login).perform();
		
		//case2--> use build() if isn't working without it 
		//act.sendKeys(name, "standard_user").sendKeys(password, "secret_sauce").click(login).perform();
		
		//case3: build
		//act.sendKeys(name, "standard_user").sendKeys(password, "secret_sauce").click(login).build().perform();
		
	
	
	
	
	}

}
