package SeleniumScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https:/www.amazon.in");
		
		driver.manage().window().maximize();
		
		//method 2: getwindow Handle----.used to get window id/session id where driver is current in focus
		
				String mainId = driver.getWindowHandle();
				System.out.println(mainId);
				
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER); 
				driver.findElement(By.xpath("(//div[@class='aok-relative'])[1]")).click();
				
				Set<String> allwins = driver.getWindowHandles();
				System.out.println(allwins);
				
				
	}
}
