package POMrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="user-name")
	private WebElement usertextfield;
	
	@FindBy(css = "[placeholder=\"Password\"]")
	private WebElement passwordTextfield;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	private WebElement loginButton;

	public WebElement getUsertextfield() {
		return usertextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	public void loginToApp(String username,String password)
	{
		usertextfield.sendKeys(username);
		passwordTextfield.sendKeys(password);
		loginButton.click();
	}
}
