package PopUp;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNativepopUp {

	public static void main(String[] args) {
		ChromeOptions popup = new ChromeOptions();
		popup.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(popup);
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en");
		
		
		
		

	}

}
