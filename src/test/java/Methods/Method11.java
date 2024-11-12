package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method11 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("field-keywords"));
		System.out.println(search.getTagName());
		System.out.println(search.getAttribute("role"));
		
		System.out.println(search.getDomAttribute("id"));
		
		WebElement dom = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		System.out.println(dom.getDomProperty("textContent"));
		
	}

}
