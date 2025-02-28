package AdvanceScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollbarUsingjavaScriptExecutorex2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.linkText("Places"));
		
		
		System.out.println(ele.getLocation().getX());
		System.out.println(ele.getLocation().getY());
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(610,786)");
//		ele.click();
		
		
		//or
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",ele);
		ele.click();
	}

}
