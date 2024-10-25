package SeleniumScript;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https:/www.flipkart.com");
		driver.manage().window().maximize();
		
		// method 1: to("url")---. launching the application
		driver.navigate().to("https:/www.flipkart.com");
		
		
		// method 1: to(URL url)---. launching the application
		driver.navigate().to(new URL("https:/www.flipkart.com"));
		
		
		Thread.sleep(1000);
		driver.get("https:/www.flipkart.com");
		
		Thread.sleep(1000);
		driver.navigate().back();
		
		Thread.sleep(1000);
		driver.navigate().forward();
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		
		
		
	}
}
