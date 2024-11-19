package AdvanceScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html ");
	driver.manage().window().maximize();
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	Actions act = new Actions(driver);
	act.clickAndHold(drag).perform();
	act.clickAndHold(drop).perform();
	
	
	//or
	act.clickAndHold(drag).release(drop).build().perform();
	
	act.dragAndDrop(drag, drop).perform();
		
}
}
