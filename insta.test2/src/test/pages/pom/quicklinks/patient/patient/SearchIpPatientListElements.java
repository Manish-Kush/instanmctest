package pom.quicklinks.patient.patient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class SearchIpPatientListElements {

	public SearchIpPatientListElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Consultation Page Object
	@FindBy(linkText = "In Patient List")
	private WebElement ipPatientList;

	// Consultation Page Object
	@FindBy(linkText = "Out Patient List")
	private WebElement outPatientList;

	// Consultation Page Object
	@FindBy(linkText = "Observation Patient List")
	private WebElement observationPatientList;

	// Patient List page object
	@FindBy(linkText = "Clear")
	private WebElement clearLink;

	@FindBy(id = "mrno")
	private WebElement mrNoDd;

	@FindBy(id = "Search")
	private WebElement searchBtn;

}
