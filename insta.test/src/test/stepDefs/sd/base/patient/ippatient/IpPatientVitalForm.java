package sd.base.patient.ippatient;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pom.quicklinks.patient.ippatient.IpPatientElement;
import pom.quicklinks.patient.patient.SearchIpPatientListElements;
import sd.base.AssertsCheck;
import sd.base.CommonActions;
import sd.infra.HisTestContext;

public class IpPatientVitalForm {

	private HisTestContext context;
	private CommonActions commonActions;
	private SearchIpPatientListElements patientList;
	private IpPatientElement ipPatientElement;
	private AssertsCheck assertsCheck;

	public IpPatientVitalForm(HisTestContext context) {
		// TODO Auto-generated constructor stub
		this.context = context;
		commonActions = context.getCommonActions();
		patientList = new SearchIpPatientListElements(this.context.getDriver());
		ipPatientElement = new IpPatientElement(this.context.getDriver());
		assertsCheck = new AssertsCheck(context);
	}

	@And("Navigate to ip patient list")
	public void navigateToOutPatientList() throws InterruptedException {
		commonActions.clickElement(patientList.getIpPatientList());
	}

	// redirect to vital edit page
	@Then("User click on vital froms in toolbar section")
	public void editConsultationRecord() throws InterruptedException {
		commonActions.clickElement(ipPatientElement.getVitalFormLink());
	}
	
	@Then("Click vital form save button and check message {string}")
	public void saveVitalForm(String message) throws InterruptedException, IOException {
		commonActions.clickElement(ipPatientElement.getVitalSaveButton());
		assertsCheck.checkAssertUsingAlertRelativeMessage(message);
	}
}
