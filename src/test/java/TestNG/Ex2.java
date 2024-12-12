package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Ex2 {
	public class AncestorFlipkart {

		public void Ex2Test() {
			 WebDriver driver = new ChromeDriver();
		        driver.get("https://www.flipkart.com");
		        driver.manage().window().maximize();
		        
		        driver.findElement(By.name("q")).sendKeys("iPhone", Keys.ENTER);
		        
	String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/ancestor::div[@data-id]//div[contains(text(),'₹')]")).getText();
		System.out.println(price);
		
		
		}
		

	}
}
