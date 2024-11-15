package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasket {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();
		
		 driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys("custard Apple",Keys.ENTER);
//		 Thread.sleep(2000);
//		driver.findElement(By.linkText("View all search results")).click();
//		
//		Thread.sleep(2000);
//		 List<WebElement> names = driver.findElements(By.xpath("//h3[contains(text(),'Custard Apple') and @class='block m-0 line-clamp-2 font-regular text-base leading-sm text-darkOnyx-800 pt-0.5 h-full']"));
//		 System.out.println(names.size());
//		 for(WebElement name : names){
//			 System.out.println(name.getText());
//			 
			 
			 
		

	}
 
	
	}





		
		
		
		
		
		
