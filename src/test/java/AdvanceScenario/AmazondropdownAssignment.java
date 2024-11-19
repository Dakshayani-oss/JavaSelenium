package AdvanceScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazondropdownAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	
		WebElement act = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions account = new Actions(driver);
		account.moveToElement(act).perform();
		
		driver.findElement(By.xpath("//span[text()='Your Account']")).click();
		
		driver.findElement(By.xpath("(//div[@class='a-box-inner'])[1]")).click();
		
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		
		driver.findElement(By.name("customerName")).sendKeys("santa");
		
		driver.findElement(By.name("email")).sendKeys("dakshayaniachari1599@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Santa@25");
		
		driver.findElement(By.xpath("//input[@name='passwordCheck']")).sendKeys("Santa@25");
		
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();

		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("4bhtzg");
		
		
		driver.findElement(By.xpath("//input[@class=\"a-button-input notranslate\"]")).click();
	}

}
