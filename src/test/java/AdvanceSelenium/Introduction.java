package AdvanceSelenium;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		 java.util.List<WebElement> names = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
	
		for (WebElement name : names)
		{
			System.out.println(name.getText());
		}
	
	
	
	
	
	
	}

}


