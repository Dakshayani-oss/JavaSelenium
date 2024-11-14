package AdvanceScenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoSuggetion {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[id=\"twotabsearchtextbox\"]")).sendKeys("puma");
		Thread.sleep(2000);
		List<WebElement> auto = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]//div"));
		for(WebElement search : auto)
		{
			System.out.println(search.getText());
			
			if(search.getText().contains("puma shoes for woman"))
			{
				search.click();
			}
		}
	}

}
