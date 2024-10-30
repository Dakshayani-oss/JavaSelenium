package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubePractise {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.youtube.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("mukhbang");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.linkText("Live")).click();	
		driver.findElement(By.linkText("Shorts")).click();
		
		}
}
