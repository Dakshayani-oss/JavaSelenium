package AdvanceScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingdropdownusingSelectClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		//selectByValue
		//selectByindex
		//selectByVisibleText
		
		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select select = new Select(day);
		//select.selectByIndex(6);
		//select.selectByValue("15");
		select.selectByVisibleText("5");//inspect and see in list and values
		
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select select1 = new Select(month);
		//select1.selectByIndex(8);
		//select1.selectByValue("4");
		select1.selectByVisibleText("Jan");
		
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select select3 = new Select(year);
		//select3.selectByIndex(9);
		//select3.selectByValue("1999");
		select3.selectByVisibleText("2022");
		
		
	}

}
