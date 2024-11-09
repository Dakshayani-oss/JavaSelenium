package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingSiblingTable2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://olympics.com/en/paris-2024/medals ");
		driver.manage().window().maximize();
		
		 driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		
		String M1 = driver.findElement(By.xpath("//span[text()='United States of America']/../following-sibling::span[@class='e1oix8v91 emotion-srm-19huvme'][1]")).getText();
		System.out.println("Gold is --->" + M1);
		

	}

}
