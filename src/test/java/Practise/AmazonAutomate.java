package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutomate {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in");
	      
	        driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
driver.findElement(By.xpath("(//span[@class=\"nav-a-content\"])[2]")).click();
driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[1]")).click();
driver.findElement(By.xpath("(//h2[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-4\"])[1]")).click();
//driver.findElement(By.xpath("(//span[@class='a-button-text'])[1]")).click();

	}

}
