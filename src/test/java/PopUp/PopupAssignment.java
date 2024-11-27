package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		
		
		WebElement iframe = driver.findElement(By.cssSelector("[class=\"demo-frame lazyloaded\"]"));
        driver.switchTo().frame(iframe);

        
        WebElement drag1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
       WebElement drag2 = driver.findElement(By.xpath("//img[@alt=\"The chalet at the Green mountain lake\"]"));

       
        WebElement drop = driver.findElement(By.id("trash"));

        
        Actions act = new Actions(driver);
        act.dragAndDrop(drag1, drop).perform();
        act.dragAndDrop(drag2, drop).perform();
	
	
	
	
	
	
	}

}
