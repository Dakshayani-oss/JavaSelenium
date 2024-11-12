package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methodclear {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.name("user-name"));
		name.sendKeys("standard_user");
		Thread.sleep(2000);
		name.clear();
		Thread.sleep(2000);
		name.sendKeys("Dakshvishal");
		
		

	}

}
