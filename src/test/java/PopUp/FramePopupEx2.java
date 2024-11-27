package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePopupEx2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hi");

		
		//case 2: using Id
		
//		driver.switchTo().frame("singleframe"); // search iframe and take id and put it in frame
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		
		//case 3: using nameattribute
//		driver.switchTo().frame("Singleframe"); // search iframe and take id and put it in frame
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		
		
		
		
		//case4: using webelement
		WebElement frame = driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pookie");
		
		
		
	}

}
