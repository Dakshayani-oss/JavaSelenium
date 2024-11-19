package AdvanceScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class popUpHandle {

	public static void main(String[] args) throws Throwable {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.makemytrip.com");
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			act.moveByOffset(10, 20).click().perform();
			

	}

}
