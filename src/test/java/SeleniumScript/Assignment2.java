package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.className("_2iLD__")).click();
	WebElement	name= driver.findElement(By.partialLinkText("Apple iPhone 15 (Pink"));
	name.click();
	System.out.println(name.getText());
		
	}

}
