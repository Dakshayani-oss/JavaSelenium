package AdvanceScenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestion {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> google = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
		for(WebElement drive : google)
		{
			System.out.println(drive.getText());
			if(drive.getText().contains("selenium webdriver"))
			{
				drive.click();
			}
			
		}
	}

}
