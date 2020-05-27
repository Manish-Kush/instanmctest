package pom.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class UserLogOut {

	public UserLogOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title=\"Logout\"]")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}
	
	
}
