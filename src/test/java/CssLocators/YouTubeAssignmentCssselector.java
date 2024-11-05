package CssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeAssignmentCssselector {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.youtube.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("tomandjerry");
		driver.findElement(By.id("search-icon-legacy")).click();
		
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		System.out.println(title);

	}

}
