package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calendarpopup {

	public static void main(String[] args) throws Throwable {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.makemytrip.com");
	        driver.manage().window().maximize();
	        
	       Actions act = new Actions(driver);
	       act.moveByOffset(10, 20).click().perform();
	       
	       driver.findElement(By.xpath("//span[text()='Departure']")).click();
	       
	      Robot robo = new Robot();
	      robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	      robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
	       
	       
	      //case1
	      // driver.findElement(By.xpath("//div[text()='November 2024']/../..//p[text()='30']")).click();
	
	      
	      //case2
	     // driver.findElement(By.xpath("//div[text()='November 2024']/ancestor::div[@class=\"DayPicker-Month\"]//p[text()='30']")).click();
	      
	      //case 3
	      //driver.findElement(By.xpath("//div[text()='November 2024']/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()='30']")).click();
	
	      //case4
	     // driver.findElement(By.xpath("//div[text()='December 2024']/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()='30']")).click();
	
	      String month = "December 2024";
	      String date = "15";
	      driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()='"+date+"']")).click();

	
	}

}
