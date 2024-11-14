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
		
		//Method 11:getTagName()
		WebElement search = driver.findElement(By.name("field-keywords"));
		System.out.println(search.getTagName());
		
		//Method 12 : getAttribute()
		System.out.println(search.getAttribute("role"));
		
		//Method 13:getDomAttribute()
		System.out.println(search.getDomAttribute("id"));
		
		//Method 14 :getDomProperty()
		WebElement dom = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		System.out.println(dom.getDomProperty("textContent"));
		
		//Method 15:getAriaRole()
		System.out.println(search.getAriaRole()); //what type of element
		
		//Method 16:getAccessibleName()
		WebElement access = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		System.out.println(access.getAccessibleName());
		
		//Method 17 :getCssValue()
		WebElement css = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		System.out.println(css.getCssValue("color"));
		System.out.println(css.getCssValue("font-size"));
	}

}
