package PopUp;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowFlipkart {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();

      
        driver.findElement(By.name("q")).sendKeys("iPhone", Keys.ENTER);
        Thread.sleep(2000);

       
        driver.findElement(By.xpath("(//a[contains(@href, '/apple-iphone')])[1]")).click();

       
        Set<String> windows = driver.getWindowHandles();
        for (String win : windows) {
            driver.switchTo().window(win);
            String title = driver.getTitle();
            System.out.println("Window Title: " + title);

            
            if (title.contains("Apple iPhone 15 (Black, 128 GB)")) {
               
                driver.findElement(By.id("pincodeInputId")).sendKeys("581330");
                break;
            }
        }

        
    }
}
