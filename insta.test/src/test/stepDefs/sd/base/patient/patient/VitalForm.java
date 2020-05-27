package sd.base.patient.patient;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pom.quicklinks.patient.patient.VitalFormElements;
import sd.base.AssertsCheck;
import sd.base.CommonActions;
import sd.infra.HisTestContext;

public class VitalForm {

	private HisTestContext context;
	private CommonActions commonActions;
	private VitalFormElements vitalFormElements;
	private AssertsCheck assertsCheck;

	public VitalForm(HisTestContext context) {
		// TODO Auto-generated constructor stub
		this.context = context;
		commonActions = context.getCommonActions();
		vitalFormElements = new VitalFormElements(this.context.getDriver());
		assertsCheck = new AssertsCheck(context);
	}

	// vital details
	@Then("User clicks on Add Vitals icon")
	public void clickAddVitals() throws Exception {
		commonActions.clickElement(vitalFormElements.getAddVitalsButton());
	}

	// vital details
	@And("Fill the vital Detail with Parameters Temp {string}, Resp {string}, Pulse {string}, SystolicBP {string}, DiastolicBP {string}, Height {string}, Weight {string} and BMI {string}")
	public void addVitalsDetails(String temp, String resp, String pulse, String systolicBP, String diastolicBP,
			String height, String weight, String bmi) throws Exception {
		commonActions.enterData(temp, vitalFormElements.getTemp());
		commonActions.enterData(resp, vitalFormElements.getResp());
		commonActions.enterData(pulse, vitalFormElements.getPulse());
		commonActions.enterData(systolicBP, vitalFormElements.getSystolic());
		commonActions.enterData(diastolicBP, vitalFormElements.getDiastolic());
		commonActions.enterData(height, vitalFormElements.getHeight());
		commonActions.enterData(weight, vitalFormElements.getWeight());
		commonActions.enterData(bmi, vitalFormElements.getBmi());
	}

	// vital details
	@And("Fill the vital detail with high range Parameters Temp {string}, Resp {string}, Pulse {string}, SystolicBP {string}, DiastolicBP {string}, Height {string}, Weight {string} and BMI {string}")
	public void addVitalsDetailsWithRange(String temp, String resp, String pulse, String systolicBP, String diastolicBP,
			String height, String weight, String bmi) throws Exception {
		String color = null;
		String defaultColor = "rgb(192, 192, 192)";
		vitalFormElements.getTemp().clear();
		commonActions.enterData(temp, vitalFormElements.getTemp());
		vitalFormElements.getResp().clear();
		vitalFormElements.getResp().click();
		color = vitalFormElements.getTemp().getCssValue("background-color");
		Assert.assertTrue(color.equalsIgnoreCase(defaultColor));
		commonActions.enterData(resp, vitalFormElements.getResp());
		vitalFormElements.getPulse().clear();
		vitalFormElements.getPulse().click();
		color = vitalFormElements.getResp().getCssValue("background-color");
		Assert.assertTrue(color.equalsIgnoreCase(defaultColor));
		commonActions.enterData(pulse, vitalFormElements.getPulse());
		vitalFormElements.getSystolic().clear();
		vitalFormElements.getSystolic().click();
		color = vitalFormElements.getPulse().getCssValue("background-color");
		Assert.assertTrue(color.equalsIgnoreCase(defaultColor));
		commonActions.enterData(systolicBP, vitalFormElements.getSystolic());
		vitalFormElements.getDiastolic().clear();
		vitalFormElements.getDiastolic().click();
		color = vitalFormElements.getSystolic().getCssValue("background-color");
		Assert.assertTrue(color.equalsIgnoreCase(defaultColor));
		commonActions.enterData(diastolicBP, vitalFormElements.getDiastolic());
		vitalFormElements.getHeight().clear();
		vitalFormElements.getHeight().click();
		color = vitalFormElements.getDiastolic().getCssValue("background-color");
		Assert.assertTrue(color.equalsIgnoreCase(defaultColor));
		commonActions.enterData(height, vitalFormElements.getHeight());
		commonActions.enterData(weight, vitalFormElements.getWeight());
		commonActions.enterData(bmi, vitalFormElements.getBmi());
	}

	@And("Click Ok button and check message {string}")
	public void saveAndCheck(String message) throws InterruptedException, IOException {
		commonActions.clickElement(vitalFormElements.getAddButton());
		assertsCheck.checkAssertTrueUsingAlert(message);
	}

	@And("Click close button")
	public void closeVitalForm() {
		commonActions.clickElement(vitalFormElements.getCloseButton());
	}

}
