package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByVisibleText {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//syntax : //htmltag[text()='AttributeValue'] : >visible text<
		
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	}

}
