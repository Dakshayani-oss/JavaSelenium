package SeleniumScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAlllocators2 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		driver.findElement(By.className("Pke_EE")).sendKeys("Bluetootheardbus");
		driver.findElement(By.cssSelector("[xmlns='http://www.w3.org/2000/svg']")).click();
		List<WebElement> bluetooth = driver.findElements(By.className("wjcEIp"));
		
		for(WebElement name :  bluetooth)
		{
			System.out.println(name.getText());
			
		}
	}
}
