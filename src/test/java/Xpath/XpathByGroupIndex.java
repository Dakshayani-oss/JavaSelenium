package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByGroupIndex {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search Amazo')]")).sendKeys("bluetooths");
		driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-b')]")).click();
		
		
		String name1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).getText();
		System.out.println(name1);
		
		String name2 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).getText();
		System.out.println(name2);
		
		String price1 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
		System.out.println(price1);
		
		String price2 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[5]")).getText();
		System.out.println(price2);
		
		String discount1 = driver.findElement(By.xpath("(//span[contains(text(), '% off')])[1]")).getText();
		System.out.println(discount1);

		String discount2 = driver.findElement(By.xpath("(//span[contains(text(), '% off')])[2]")).getText();
		System.out.println(discount2);
		
		
		
		
	}

}
