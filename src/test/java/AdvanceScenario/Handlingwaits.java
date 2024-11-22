package AdvanceScenario;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwaits {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//version3 : implicit wait()
		//syntax:
//		Options opt = driver.manage();
//		Timeouts time = opt.timeouts();
//		time.implicitlyWait(10, TimeUnit.SECONDS);
//		
//		//or
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//version 4:
		//syntax:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
