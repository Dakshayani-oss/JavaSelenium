package SeleniumScript;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.systeminfo.SystemInfo;

public class xpathAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphones");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		 List<WebElement> iphoneNames = driver.findElements(By.className("KzDlHZ"));
		 
	
		 
		 List<WebElement> price = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		 for(int i =0; i<iphoneNames.size();i++)
		 {
			 WebElement phone = iphoneNames.get(i);
			 WebElement cost = price.get(i);
			 System.out.println(phone.getText() + "------>" + cost.getText());
			 
		 }
		 
		

	}

}
