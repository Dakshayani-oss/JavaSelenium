package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoooleanMethods {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement img = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		if(img.isDisplayed())
		{
			System.out.println("Element is displayed");
		}
		else
			System.out.println("Element is not displayed");
	}

}
