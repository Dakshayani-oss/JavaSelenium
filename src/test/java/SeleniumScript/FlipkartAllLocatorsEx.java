package SeleniumScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAllLocatorsEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		driver.findElement(By.className("Pke_EE")).sendKeys("Iphones");
		driver.findElement(By.cssSelector("[xmlns='http://www.w3.org/2000/svg']")).click();
		 List<WebElement> iphoneNames = driver.findElements(By.className("KzDlHZ"));
		 for (WebElement name : iphoneNames) {
	            System.out.println(name.getText());
		
	}
		}
}
