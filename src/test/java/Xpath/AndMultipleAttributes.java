package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AndMultipleAttributes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http:/www.flipkart.com");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//input[@class='Pke_EE' and @name='q']")).sendKeys("puma");
//		driver.findElement(By.xpath("//button[contains(@aria-label,'Search for Products, Brands and More') and @type='submit']")).click();
		
		driver.findElement(By.xpath("//a[@class='_1ch8e' or  @aria-label='Grocery']")).click();
		driver.findElement(By.className("_1UOrqe")).sendKeys("600069");

	}

}
