package POMrepo;

import javax.swing.text.html.CSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.core.sym.Name;


	public class Flipkart {
		
		public Flipkart(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBys({ @FindBy(css = "[class='Pke_EE']"), @FindBy(name = "q")})
		private WebElement serachbar;
		
		 @FindAll({ @FindBy(name = "_2iLD__"),@FindBy(css = "[type='submit']")})
		    private WebElement searchIcon;

		public WebElement getSerachbar() {
			return serachbar;
		}

		public WebElement getSearchIcon() {
			return searchIcon;
		}


}
