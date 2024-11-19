package AdvanceScenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzonColourNameSVGAssignment {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement click = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		click.sendKeys("iphone");
		click.submit();
		
		//find common path for all colors after finding name path for mobile then find by one by one colours
		List<WebElement> color = driver.findElements(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight']/../../../..//div[@class=\"a-section a-spacing-none a-spacing-top-mini s-color-swatch-container-list-view\"]//a"));
            for (WebElement list : color)
            {
				String names = list.getAttribute("aria-label");
				System.out.println(names);
			}
        }

}

