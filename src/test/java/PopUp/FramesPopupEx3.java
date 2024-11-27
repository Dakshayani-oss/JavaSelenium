package PopUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPopupEx3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/frames");
		
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		
		driver.switchTo().frame("frame-top");
		
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("frame-left");
//		WebElement left = driver.findElement(By.tagName("body"));
//		System.out.println(left.getText());
		
		//or
		driver.switchTo().frame("frame-left");
		String left = driver.findElement(By.xpath("(//body[contains(text (),' LEFT')])")).getText();
		System.out.println(left);
		
		
		 driver.switchTo().parentFrame();
		 driver.switchTo().frame("frame-middle");
	  String middle = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
	        System.out.println(middle);
	        
	        driver.switchTo().defaultContent();
//	        driver.switchTo().parentFrame();
//	        driver.switchTo().parentFrame();
	        driver.switchTo().frame("frame-bottom");
	       String bottom = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
	        System.out.println(bottom);
	        
	        
	        driver.switchTo().parentFrame();

	        
	        driver.switchTo().frame("frame-top");
	        driver.switchTo().frame("frame-right");
	        String rightAgain = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();
	        System.out.println(rightAgain);
	        
	        
		
		
			
		}
		
	}


