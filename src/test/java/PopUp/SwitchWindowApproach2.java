package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowApproach2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		Set<String> allwindow = driver.getWindowHandles();
		
		for (String win : allwindow)
		{
			driver.switchTo().window(win);
			String name = driver.getTitle();
			System.out.println(name);
			if(name.contains("Selenium"))
			{
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Projects']")).click();
		//driver.close();
		//driver.quit();
		
		//----------------------------------------------------------
		
		Set<String> last = driver.getWindowHandles();
		for (String print : last) 
		{
			driver.switchTo().window(print);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Projects | Selenium"));
			break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement cl = driver.findElement(By.xpath("//a[text()='Learn more & submit!']"));
		cl.click();
		
		//------------------------------------------------------------
		Set<String> last1 = driver.getWindowHandles();
		for (String print : last) 
		{
			driver.switchTo().window(print);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Frames & windows"));
			{
				break;
			}
		
	}
		driver.findElement(By.linkText("Home")).click();
	
	
	
	
 
}
}
