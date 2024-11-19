package AdvanceScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGScenario {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.clinique.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[@class='product-card-add-to-bag-button'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name() and @class=\"ufc-cart-icon-svg\"]")).click();

	}

}
