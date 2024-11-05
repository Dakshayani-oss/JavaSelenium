package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathByTravesing {

    public static void main(String[] args) throws Throwable {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//input[contains(@title,'Search for Products, Brands and More')]")).sendKeys("iphone");
        driver.findElement(By.xpath("//button[contains(@aria-label,'Search for Products, Brands and More')]")).click();
        
        String price = driver.findElement(By.xpath("//div[@class='col col-5-12 BfVC2z']/div/div[1]/div[1]")).getText();
        System.out.println(price);
        
      String name = driver.findElement(By.xpath("//div[@class='yKfJKb row']/div[1]/div")).getText();
      System.out.println(name);
    }
}
