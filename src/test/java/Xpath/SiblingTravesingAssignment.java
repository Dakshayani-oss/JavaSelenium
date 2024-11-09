package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingTravesingAssignment {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/search?q=pro+kabaddi+points+table+2024 ");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("(//span[contains(@class,'U8v51e S3PB2d')])[3]")).click();
        Thread.sleep(2000);
        WebElement headerrow = driver.findElement(By.xpath("//tr[@class='tsp-ftlg tsp-fs tsp-thr']")); 
        List<WebElement> followingSiblings = headerrow.findElements(By.xpath("following-sibling::*"));
        
        for(WebElement w : followingSiblings )
        {
        	WebElement teamNameSpan = w.findElement(By.xpath(".//span[@class='tsp-w tsp-el tsp-db']"));
        	WebElement pointsTd = w.findElement(By.xpath(".//td[@class='tsp-kscs tsp-cm tsp-fb']"));
        	WebElement points =pointsTd.findElement(By.xpath(".//span"));
        	System.out.println(teamNameSpan.getText() + "=" + points.getText());
        }
        WebElement row7 = driver.findElement(By.xpath("(//tr[contains(@class,'tsp-trtb tsp-rr tsp-cbd tsp-hbd')])[7]")); 
        List<WebElement> followingSiblings1 = row7.findElements(By.xpath("following-sibling::*"));
        followingSiblings1.add(0, row7);
        
        for(WebElement w : followingSiblings1 )
        {
        	WebElement teamNameSpan = w.findElement(By.xpath(".//span[@class='tsp-w tsp-el tsp-db']"));
        	WebElement pointsTd = w.findElement(By.xpath(".//td[@class='tsp-kscs tsp-cm tsp-fb']"));
        	WebElement points =pointsTd.findElement(By.xpath(".//span"));
        	System.out.println(teamNameSpan.getText() + "=" + points.getText());
        }
	}
}
        
        
