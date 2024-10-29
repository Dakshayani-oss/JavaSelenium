package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseSelenium {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("casio watch");
		driver.findElement(By.id("nav-search-submit-button")).click();
			
			WebElement watch = driver.findElement(By.linkText("Vintage A158WA-1DF Black Digital Dial Silver Stainless Steel Band D011"));
			watch.click();
			System.out.println(watch.getText());
			WebElement price = driver.findElement(By.partialLinkText("a-price-whole"));
			 price.click();
			 System.out.println(price.getText());
			
		
			 
	}
}
