package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingSibling2 {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com/search?q=pro+kabaddi+points+table+2024 ");
	        driver.manage().window().maximize();
	        
	       String win = driver.findElement(By.xpath("//span[text()='Puneri Paltan']/../../following-sibling::td[2]//span[1]")).getText();
	       System.out.println(win);
	       
	       String point = driver.findElement(By.xpath("//span[text()='Puneri Paltan']/../../following-sibling::td[6]//span[1]")).getText();
	       System.out.println(point);

	}

}
