package SeleniumScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch 
{
	public static void main(String[] args)
	{
		//case 2: selenium version : 3.141.59, webdrivermanager version
		
			//WebDriverManager.chromedriver().setup();
			//WebDriver driver=new ChromeDriver();
		
		//case 3: selenium version : 4.25.0, webdrivermanager version
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver=new EdgeDriver();
		
		//case 4: only 4.25.0 directcommunicating with browser
		WebDriver driver=new ChromeDriver();
	}
	
}
