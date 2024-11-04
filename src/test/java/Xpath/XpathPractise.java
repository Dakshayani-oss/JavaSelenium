package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractise {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@alt='TVs & Appliances']")).click();
		driver.findElement(By.linkText("Flights")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@tabindex='01']")).sendKeys("GOA");
		driver.findElement(By.xpath("//input[@name='0-arrivalcity']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@name='0-dateto']")).click();
		driver.findElement(By.xpath("//input[@name='0-dateto']")).click();
		driver.findElement(By.xpath("//input[@value='1 Traveller | Economy ']")).click();
		driver.findElement(By.linkText("Done")).click();
		driver.findElement(By.className("QqFHMw sgUmTV M5XAsp")).click();
	
		
		
		
		
		
		
		

	}

}
