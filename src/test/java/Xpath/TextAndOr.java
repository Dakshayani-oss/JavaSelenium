package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextAndOr {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[text()='Mobiles' and @data-csa-c-type=\"link\"]")).click();
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_electronics' or text()= 'Electronics ' ]")).click();
		

	}

}
