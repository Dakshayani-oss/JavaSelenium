package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowAssignmentInClass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		String main = driver.getWindowHandle();
		System.out.println(main);
		
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		
		for (String use : all)
		{
			if(!main.equals(use))
				driver.switchTo().window(use);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Documentation']")).click();
	}
	

}
