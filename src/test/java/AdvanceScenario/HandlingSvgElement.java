package AdvanceScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSvgElement {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.kayak.co.in/");
		driver.manage().window().maximize();
		
		
		//SVG-- scalar vector graphics
		//SVG Syntax: //*[name()='svg' and @Attributename='AttributeValue']
		
		driver.findElement(By.xpath("//*[name() and @class=\"A_8a-icon\"]")).click();

	}

}
