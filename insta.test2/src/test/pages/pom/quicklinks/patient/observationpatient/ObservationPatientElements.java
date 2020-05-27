package pom.quicklinks.patient.observationpatient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class ObservationPatientElements {

	public ObservationPatientElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Consultation Page Object
	@FindBy(id = "toolbarTitleDiv_defaultObCaseSheet")
	private WebElement observationCaseSheet;
	
	@FindBy(xpath = "//legend[@class='fieldSetLabel']//a[contains(text(),'Vitals')]")
	private WebElement vitalFormLink;
	
	@FindBy(name = "save")
	private WebElement vitalSaveButton;

}
