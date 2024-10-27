package SeleniumScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocators 
{
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//linkText()--: >complete visible text<
		driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.linkText(" Electronics ")).click();
		
		//partialLinkText()--- we can remove one one word and check for uniquness
		
		driver.findElement(By.partialLinkText("Today's")).click();
		
		//tagName()----> Identify number of images and links
		List<WebElement> allimg = driver.findElements(By.tagName("img"));
		System.out.println(allimg.size());
		
	}

}
