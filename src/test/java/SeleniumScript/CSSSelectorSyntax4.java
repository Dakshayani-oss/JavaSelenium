package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorSyntax4 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https:/www.amazon.in");
		driver.manage().window().maximize();
		
		//syntax 4: if syntax3 is not working for is use this and write htmltag#AttributeValue
		driver.findElement(By.cssSelector("span#glow-ingress-line2")).click();
		
		
		

	}

}
