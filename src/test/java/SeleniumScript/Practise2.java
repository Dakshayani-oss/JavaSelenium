package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise2
{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.cssSelector("[alt='Grocery']")).click();
//		driver.findElement(By.className("_1UOrqe")).sendKeys("581330");
		
		driver.findElement(By.xpath("//a[@aria-label='Mobiles']")).click();	
		driver.findElement(By.className("CDJO0-")).click();
		driver.findElement(By.linkText("Start Selling")).click();
				

	}

}
