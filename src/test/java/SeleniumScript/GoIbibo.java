package SeleniumScript;

import java.awt.Window;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoIbibo
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:/www.goibibo.com");
		
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();
		driver.quit();
		
		String title= driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		String page=driver.getPageSource();
		System.out.println(page);
		
		driver.manage().window().fullscreen();
		
		//case : getsize():to get height an dwidth
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		driver.manage().window().maximize();
		
		Dimension size1 = driver.manage().window().getSize();
		System.out.println(size1);
		System.out.println(size1.getHeight());
		System.out.println(size1.getWidth());
		
		Dimension size2 = new Dimension(800, 800);
		driver.manage().window().setSize(size2);
		
		driver.manage().window().setSize(new Dimension(800, 500));
		
		//case : getPosition(): give the cursor position, x and y of the position
		
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		driver.manage().window().setPosition(new Point(20,20));
		
		
	}

}
