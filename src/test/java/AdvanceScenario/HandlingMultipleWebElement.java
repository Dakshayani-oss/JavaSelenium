package AdvanceScenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWebElement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		List<WebElement> tag = driver.findElements(By.tagName("a"));
		int count =0;
		for (WebElement names : tag) {
           // System.out.println(names.getText()); //fetches all the visible text from links
			System.out.println(names.getAttribute("href"));
			count++;
	}
		System.out.println("Total links present" + count);
	}
}
