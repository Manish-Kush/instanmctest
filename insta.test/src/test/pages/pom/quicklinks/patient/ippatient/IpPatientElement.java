package pom.quicklinks.patient.ippatient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class IpPatientElement {

	public IpPatientElement(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "toolbarAction_defaultVitalForms")
	private WebElement vitalFormLink;
	
	@FindBy(name = "save")
	private WebElement vitalSaveButton;
}
