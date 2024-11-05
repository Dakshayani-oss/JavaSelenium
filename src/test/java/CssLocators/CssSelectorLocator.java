package CssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		
		driver.manage().window().maximize();
				//syntax 1:--- [[AttriibuteName ='AttributeValue']]
		driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		// syntax 2: html tag[AttriibuteName ='AttributeValue']

		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		//Syntax 3: it supports only id locator #Attributevalue
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		//syntax 5: attribute values supports only classname attribute and can use .
		driver.findElement(By.cssSelector(".btn_action")).click();
		
		//syntax 6: htmltag.Attributevalue
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
		
	}

}
