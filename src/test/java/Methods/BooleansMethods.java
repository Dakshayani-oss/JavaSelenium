package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooleansMethods {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Create new account']"));
		if(link.isEnabled())
		{
			link.click();
		}
		else
			System.out.println("Element is not enabled");
	}


	}


