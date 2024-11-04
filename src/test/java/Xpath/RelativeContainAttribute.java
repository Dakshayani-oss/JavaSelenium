package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeContainAttribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//syntax: //htmltag[contains(@AttributeValue,'Attributename')]
		//keep removing letters from right to left or right to left until we get uniqueness
		driver.findElement(By.xpath("//input[contains(@name,'field-keywo')]")).sendKeys("nike");
	}

}
