package AdvanceScenario;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyboardUsingRobot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("user-name")).sendKeys("Pookie");
		
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL); //VK---> Virtual Key
		rob.keyPress(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_C);
		
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_TAB );
		rob.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
	}

}
