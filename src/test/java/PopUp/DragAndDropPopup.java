package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.xpath("[class='gallery ui-helper-reset ui-helper-clearfix ui-droppable']"));
		WebElement drop = driver.findElement(By.xpath("[class='ui-widget-content ui-state-default ui-droppable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(ele, drop).perform();
	}
	

}
