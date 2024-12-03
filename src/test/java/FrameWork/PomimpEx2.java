package FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMrepo.Flipkart;

public class PomimpEx2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		Flipkart pom = new Flipkart(driver);
		pom.getSerachbar().sendKeys("puma");
		pom.getSearchIcon().click();
	}

}
