package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCss {

	public static void main(String[] args)
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http:/www.amazon.in");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("[data-csa-c-id='gmbeiw-8b7mir-q0eoso-7r6v93']")).click();
		
		//driver.findElement(By.cssSelector("[href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']")).click();
		
		driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_bestsellers']")).click();
	}

}
