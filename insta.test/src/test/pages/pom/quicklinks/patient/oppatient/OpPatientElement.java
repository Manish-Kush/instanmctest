package pom.quicklinks.patient.oppatient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class OpPatientElement {

	public OpPatientElement(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "toolbarTitleDiv_defaultVitalParameters")
	private WebElement vitalFormLink;
	
	@FindBy(name = "save")
	private WebElement vitalSaveButton;
}
