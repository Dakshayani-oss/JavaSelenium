package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptAgain {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Vishal");
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("N");
		driver.findElement(By.cssSelector("[ng-model='Adress']")).sendKeys("Hegde,Sonarkeri,Kumta");
		driver.findElement(By.cssSelector("[type='email']")).sendKeys("dalshayani@gamil.com");
		driver.findElement(By.cssSelector("[ng-model='Phone']")).sendKeys("9845642590");
		WebElement female = driver.findElement(By.cssSelector("[value='FeMale']"));
		female.click();
		WebElement hockey = driver.findElement(By.cssSelector("[value='Hockey']"));
		hockey.click();
//		WebElement l = driver.findElement(By.className("ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all"));
//		l.sendKeys("danish");
		
		WebElement c = driver.findElement(By.cssSelector("span[role='presentation']"));
		c.click();
//		WebElement c1 = driver.findElement(By.xpath("(//li[contains(@aria-selected,'false')])[5]"));
//		c1.click();
	}
	

}
