package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartCss {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[placeholder='Search for Products, Brands and More']")).sendKeys("nikeshoes");
		driver.findElement(By.cssSelector("[xmlns='http://www.w3.org/2000/svg']")).click();
		WebElement nike = driver.findElement(By.cssSelector("[title='Winflo 10 Running Shoes For Men']"));
		nike.click();
		System.out.println(nike.getText());
		WebElement price = driver.findElement(By.cssSelector("[class='Nx9bqj CxhGGd']"));
		price.click();
		System.out.println(price.getText());
	}
	
	
}
