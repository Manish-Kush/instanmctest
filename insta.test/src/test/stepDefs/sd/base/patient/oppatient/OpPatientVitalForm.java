package sd.base.patient.oppatient;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pom.quicklinks.patient.oppatient.OpPatientElement;
import pom.quicklinks.patient.patient.SearchIpPatientListElements;
import sd.base.AssertsCheck;
import sd.base.CommonActions;
import sd.infra.HisTestContext;

public class OpPatientVitalForm {

	private HisTestContext context;
	private CommonActions commonActions;
	private SearchIpPatientListElements patientList;
	private OpPatientElement opPatientElement;
	private AssertsCheck assertsCheck;

	public OpPatientVitalForm(HisTestContext context) {
		// TODO Auto-generated constructor stub
		this.context = context;
		commonActions = context.getCommonActions();
		patientList = new SearchIpPatientListElements(this.context.getDriver());
		opPatientElement = new OpPatientElement(this.context.getDriver());
		assertsCheck = new AssertsCheck(context);
	}

	@And("Navigate to out patient list")
	public void navigateToOutPatientList() throws InterruptedException {
		commonActions.clickElement(patientList.getOutPatientList());
	}
	
	// redirect to vital edit page
	@Then("User click on vital froms in toolbar section")
	public void editConsultationRecord() throws InterruptedException {
		commonActions.clickElement(opPatientElement.getVitalFormLink());
	}
	
	@Then("Click vital form save button and check message {string}")
	public void saveVitalForm(String message) throws InterruptedException, IOException {
		commonActions.clickElement(opPatientElement.getVitalSaveButton());
		assertsCheck.checkAssertUsingAlertRelativeMessage(message);
	}
}
