package pom.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;
/**
 * All the Web Element of the Login page
 * @author manish
 *
 */
@Getter
public class UserLogin
{
	// PageFactory for initializing webElements
	public UserLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Web elements in the login page
	 */
	@FindBy(id = "hospital")
	private WebElement hospital;
	
	@FindBy(id = "userId")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "button")
	private WebElement submitButton;
	
	@FindBy(linkText = "Remind Me Later")
	private WebElement remindMeLaterLink;
	
	@FindBy(xpath = "//span[contains(text(),'Forgot Password?')]")
	private WebElement forgotPassLink;

}
