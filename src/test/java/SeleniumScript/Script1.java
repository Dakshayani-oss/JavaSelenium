package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[ng-model='FirstName']")).sendKeys("Dakshayani");
		driver.findElement(By.cssSelector("[ng-model='LastName']")).sendKeys("Acharya");
		driver.findElement(By.cssSelector("[ng-model='Adress']")).sendKeys("sonarkeri,Hegde,Kumta");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dakshayaniachari@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9845642590");
		
		
		WebElement photo = driver.findElement(By.cssSelector("[type='file']"));
		photo.sendKeys("D:\\PHOTOS\\camera\\IMG_20170618_142415.jpg");
		
		
		WebElement radiobutton = driver.findElement(By.cssSelector("input[value='FeMale']"));
		radiobutton.click();
		WebElement checkbox = driver.findElement(By.cssSelector("input[value='Movies']"));
		checkbox.click();
		
		driver.findElement(By.cssSelector("[ng-model='Password']")).sendKeys("Dakshu@15");
		driver.findElement(By.cssSelector("[ng-model='CPassword']")).sendKeys("Dakshu@15");
		
		
		
			
//		driver.findElement(By.cssSelector("[placeholder='Year']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("[placeholder='Month']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("[placeholder='Day']")).click();
		
	
		
		WebElement year = driver.findElement(By.cssSelector("[value='1999']"));
		year.click();
		
	Thread.sleep(2000);
	WebElement month = driver.findElement(By.cssSelector("[value='April']"));
	month.click();
	
	Thread.sleep(2000);
	WebElement date = driver.findElement(By.cssSelector("[value='15']"));
	date.click();
	
	
	driver.findElement(By.cssSelector("[value='Engineering']")).click();
	
	WebElement c = driver.findElement(By.cssSelector("span[role='presentation']"));
	c.click();
	WebElement skill = driver.findElement(By.xpath("(//li[contains(@aria-selected,'false')])[5]"));
	skill.click();
	
	
	driver.findElement(By.id("submitbtn")).click();
	
	
	
	
	
	
	
	
	
	}

}
