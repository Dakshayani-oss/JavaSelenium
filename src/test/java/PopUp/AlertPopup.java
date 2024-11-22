package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
		
//		 Alert alt = driver.switchTo().alert();
//		String text = alt.getText(); // read alert message
//		System.out.println(text);
//		alt.accept(); // to click on alert
		
//		driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
//		
//		//driver.switchTo().alert().accept(); // accepts the alert, i.e click on ok
//		driver.switchTo().alert().dismiss(); // to click on cancel
		
		
		driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Time"); // to add message on textfeild
		alt.accept();
	 
	
	}

}
