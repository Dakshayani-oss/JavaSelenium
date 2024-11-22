package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveWebPopo {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		Robot close = new Robot();
		close.keyPress(KeyEvent.VK_TAB); //---close
		close.keyRelease(KeyEvent.VK_TAB);
		
//		close.keyPress(KeyEvent.VK_ENTER);
//		close.keyRelease(KeyEvent.VK_ENTER);
		
		close.keyPress(KeyEvent.VK_TAB); //---Allow
		close.keyRelease(KeyEvent.VK_TAB);
		
//		close.keyPress(KeyEvent.VK_ENTER);
//		close.keyRelease(KeyEvent.VK_ENTER);
		
		close.keyPress(KeyEvent.VK_TAB); //---block
		close.keyRelease(KeyEvent.VK_TAB);
		
		close.keyPress(KeyEvent.VK_ENTER);
		close.keyRelease(KeyEvent.VK_ENTER);
	}
	
	

}
