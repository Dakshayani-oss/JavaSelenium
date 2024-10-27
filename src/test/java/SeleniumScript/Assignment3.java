package SeleniumScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http:/www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("field-keywords")).sendKeys("puma t shirt");
		driver.findElement(By.id("nav-search-submit-button")).click();
	
		WebElement name=driver.findElement(By.linkText("Men's Regular Fit T-Shirt with Graphic Print Logo"));
		name.click();
		System.out.println(name.getText());
		WebElement price=driver.findElement(By.className("a-price-whole"));
		System.out.println(price.getText());
		
		
	}

}
