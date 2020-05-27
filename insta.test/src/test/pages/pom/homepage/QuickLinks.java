package pom.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

/**
 * All the Web Element of the QuickLinks
 * 
 * @author kiran.dd
 *
 */
@Getter
public class QuickLinks {

	public QuickLinks(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()=\"Search\"]")
	private WebElement searchdd;

	@FindBy(xpath = "//span[text()=\"Registration\"]")
	private WebElement registrationdd;

	@FindBy(xpath = "//span[text()='Billing']")
	private WebElement billingDd;

	@FindBy(xpath = "//span[text()='Patient']")
	private WebElement patientDd;

}
