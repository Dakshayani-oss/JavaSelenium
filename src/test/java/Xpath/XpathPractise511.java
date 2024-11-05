package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractise511 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(@aria-label,'Grocery')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter pincode']")).sendKeys("890111");
		
		driver.findElement(By.cssSelector("[class='zDPmFV']")).sendKeys("rice");
		driver.findElement(By.xpath("//button[contains(@class,'MJG8Up')]")).click();
	}

}
