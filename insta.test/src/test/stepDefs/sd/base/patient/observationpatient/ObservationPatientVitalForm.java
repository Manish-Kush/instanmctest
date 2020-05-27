package sd.base.patient.observationpatient;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pom.quicklinks.patient.observationpatient.ObservationPatientElements;
import pom.quicklinks.patient.patient.SearchIpPatientListElements;
import sd.base.AssertsCheck;
import sd.base.CommonActions;
import sd.infra.HisTestContext;

public class ObservationPatientVitalForm {

	private HisTestContext context;
	private CommonActions commonActions;
	private SearchIpPatientListElements patientList;
	private ObservationPatientElements observationPatientElements;
	private AssertsCheck assertsCheck;

	public ObservationPatientVitalForm(HisTestContext context) {
		// TODO Auto-generated constructor stub
		this.context = context;
		commonActions = context.getCommonActions();
		patientList = new SearchIpPatientListElements(this.context.getDriver());
		observationPatientElements = new ObservationPatientElements(this.context.getDriver());
		assertsCheck = new AssertsCheck(context);
	}

	@And("Navigate to Obseravtion patient list")
	public void navigateToOutPatientList() throws InterruptedException {
		commonActions.clickElement(patientList.getObservationPatientList());
	}

	// vital details section
	@Then("Navigate to Obseravtion case sheet")
	public void navigateToObseravtionCaseList() throws InterruptedException {
		commonActions.clickElement(observationPatientElements.getObservationCaseSheet());
	}
	
	@And("Navigate to Vitals section")
	public void navigateToObseravtionVitals() throws InterruptedException {
		commonActions.clickElement(observationPatientElements.getVitalFormLink());
	}

	@Then("Click vital form save button and check message {string}")
	public void saveVitalForm(String message) throws InterruptedException, IOException {
		commonActions.clickElement(observationPatientElements.getVitalSaveButton());
		assertsCheck.checkAssertUsingAlertRelativeMessage(message);
	}
}
