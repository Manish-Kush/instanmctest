package pom.quicklinks.patient.patient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class VitalFormElements {

	public VitalFormElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Vitals web elements
	@FindBy(id = "btnAddItem")
	private WebElement addVitalsButton;

	@FindBy(id = "edit4")
	private WebElement temp;

	@FindBy(id = "edit3")
	private WebElement resp;

	@FindBy(id = "edit1")
	private WebElement pulse;

	@FindBy(id = "edit2")
	private WebElement systolic;

	@FindBy(id = "edit16")
	private WebElement diastolic;

	@FindBy(id = "edit5")
	private WebElement Height;

	@FindBy(id = "edit6")
	private WebElement Weight;

	@FindBy(id = "edit15")
	private WebElement bmi;

	@FindBy(id = "vital_add_Ok")
	private WebElement addButton;

	@FindBy(id = "vital_add_Close")
	private WebElement closeButton;

}
