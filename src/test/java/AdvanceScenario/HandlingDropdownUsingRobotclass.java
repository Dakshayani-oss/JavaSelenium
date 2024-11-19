package AdvanceScenario;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdownUsingRobotclass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		day.click();
		
		Robot act = new Robot();
		act.keyPress(KeyEvent.VK_DOWN);
		act.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		act.keyPress(KeyEvent.VK_DOWN);
		act.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		act.keyPress(KeyEvent.VK_DOWN);
		act.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		act.keyPress(KeyEvent.VK_UP);
		act.keyPress(KeyEvent.VK_UP);
		
		Thread.sleep(2000);
		act.keyPress(KeyEvent.VK_UP);
		act.keyPress(KeyEvent.VK_UP);
		
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		month.click();
		act.keyPress(KeyEvent.VK_DOWN);
		act.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		act.keyPress(KeyEvent.VK_DOWN);
		act.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		act.keyPress(KeyEvent.VK_DOWN);
		act.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		act.keyPress(KeyEvent.VK_UP);
		act.keyPress(KeyEvent.VK_UP);
		
		Thread.sleep(2000);
		act.keyPress(KeyEvent.VK_UP);
		act.keyPress(KeyEvent.VK_UP);
		
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		year.click();
		act.keyPress(KeyEvent.VK_DOWN);
		act.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		act.keyPress(KeyEvent.VK_DOWN);
		act.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		act.keyPress(KeyEvent.VK_DOWN);
		act.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		act.keyPress(KeyEvent.VK_UP);
		act.keyPress(KeyEvent.VK_UP);
		
		Thread.sleep(2000);
		act.keyPress(KeyEvent.VK_UP);
		act.keyPress(KeyEvent.VK_UP);
		
		


	}

}
