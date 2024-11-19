package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkdlnPractise {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/feed/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dakshayaniachari@gmail.com");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("Dakshu@24");
		WebElement submit = driver.findElement(By.className("btn__primary--large from__button--floating"));
		Thread.sleep(2000);
		submit.click();
		
	}

}
