package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class EX1Test
{
	public void EX1Test() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("puma");	
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));
		for(WebElement sugg : list)
		{
			System.out.println(sugg.getText());
			
			if(sugg.getText().contains("puma flip flops"))
			{
				sugg.click();
			}
		}
		
		}
	}


