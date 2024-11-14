package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		//Method 8:getLocation()
		WebElement ele = driver.findElement(By.name("q")); //searchtext
		System.out.println(ele.getLocation().getX());
		System.out.println(ele.getLocation().getY());
		
		
		System.out.println(ele.getSize().getHeight());
		System.out.println(ele.getSize().getWidth());
		
		
		//Method 9:getSize()
		WebElement HW = driver.findElement(By.xpath("//a[@aria-label='Grocery']"));
		System.out.println(HW.getSize().getHeight());
		System.out.println(HW.getSize().getWidth());
		
		//Method 10: getRect()
		System.out.println(ele.getRect().getX());
		System.out.println(ele.getRect().getY());
		System.out.println(ele.getRect().getHeight());
		System.out.println(ele.getRect().getWidth());
	}

}
