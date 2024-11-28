package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopup {

	public static void main(String[] args) {
		
		
		//Approach 1--- Using Window id: Can handle only two windows
		//Approach 2---- Using Title/URL : Can handle Multiple windows
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("puma" , Keys.ENTER);
		driver.findElement(By.xpath("(//a[@class=\"WKTcLC BwBZTg\"])[1]")).click();
		
		String mainId = driver.getWindowHandle();
		System.out.println(mainId);
		
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		
		for (String id : allIds)
		{
			if(!mainId.equals(id))
			{
				driver.switchTo().window(id);
			}
		}
		
		String price = driver.findElement(By.xpath("//div[@class=\"Nx9bqj CxhGGd\"]")).getText();
		System.out.println(price);
	}

}
