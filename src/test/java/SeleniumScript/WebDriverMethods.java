package SeleniumScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods 
{
	public static void main(String[] args)
	{
		//launching empty browser
		WebDriver driver=new ChromeDriver();
		
		//method 1 : get() -----> launching the application
		driver.get("https:/www.flipkart.com");
		
		//method 2: gettitle()---> fetching the title of the web page
		String title = driver.getTitle();
		System.out.println(title);
		
		//method 3 : getCurrentUrl()---> fetching the url of application
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//method 4 : getpagesource--->
		String src =driver.getPageSource();
		System.out.println(src);
		
		//method 5: Manage maximize
		//Options opt= driver.manage();
		//Window win = opt.window();
		//win.maximize();
		
		//or
		driver.manage().window().maximize();
		
		//method 6: Manage minimize
		driver.manage().window().minimize();
		
		driver.manage().window().fullscreen();
		
		//method 7 : closes the single tab/window where driver is currently in focus
		 driver.close();
		 
		 //method 8 : quit closes all the tabs/ windows including browsers
		 driver.quit();
		
		
	}
}
