package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Method1 {
	public  void MTest(){
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		//method1:-sendKeys()
		//	driver.findElement(http://By.name("q")).sendKeys("puma");
		
		//method2:-click()
		//	driver.findElement(By.cssSelector("[type=\"submit\"]")).click();

			//method3:-submit()
			WebElement search = driver.findElement(By.name("q"));
			search.sendKeys("Bluetooth");
			search.submit();
		
	}
	
}
