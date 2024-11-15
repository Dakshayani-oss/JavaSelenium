package AdvanceScenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasketAutoSugg {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys("Apple");
		 
		 Thread.sleep(2000);
		 
		 List<WebElement> big = driver.findElements(By.xpath("//ul[@class=\"overscroll-contain\"]//a"));
		 WebElement s = big.get(big.size()-1);
		  System.out.println("last item----->"+s.getText());
	       s.click();

	}

}
