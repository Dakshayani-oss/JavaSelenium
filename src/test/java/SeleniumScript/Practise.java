package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https:/www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("field-keywords")).sendKeys("puma");
		
}
 }
