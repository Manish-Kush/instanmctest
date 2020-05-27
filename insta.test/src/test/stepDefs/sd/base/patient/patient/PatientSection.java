package sd.base.patient.patient;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pom.homepage.QuickLinks;
import pom.quicklinks.patient.patient.SearchIpPatientListElements;
import sd.base.CommonActions;
import sd.infra.HisTestContext;

public class PatientSection {

	private QuickLinks quickLinks;
	private HisTestContext context;
	private CommonActions commonActions;
	private SearchIpPatientListElements patientList;

	public PatientSection(HisTestContext context) {
		// TODO Auto-generated constructor stub
		this.context = context;
		quickLinks = new QuickLinks(this.context.getDriver());
		commonActions = context.getCommonActions();
		patientList = new SearchIpPatientListElements(this.context.getDriver());
	}

	@Then("Navigate to patient section")
	public void navigateToPatientSection() throws InterruptedException {
		commonActions.clickElement(quickLinks.getPatientDd());
		Thread.sleep(1000);
	}

	@Given("Clean all serach element")
	public void cleanAllSerachElement() throws InterruptedException {
		commonActions.clickElement(patientList.getClearLink());
		Thread.sleep(1000);
	}

	// set data to fields
	@And("Search MR Number {string} and click search button")
	public void searchBasedOnKey(String mrNo) throws Exception {
		commonActions.selectTextFieldOption(mrNo, patientList.getMrNoDd());
		commonActions.clickElement(patientList.getSearchBtn());
	}

	// redirect to vital edit page
	@And("Select MR Number {string} from toolbar")
	public void editConsultationRecord(String mrNo) throws InterruptedException {
		commonActions.clickElement(context.getDriver().findElement(By.xpath("//td[contains(text(),'" + mrNo + "')]")));
		Thread.sleep(1000);
	}

	// set data to fields
	@Given("Select first patient from list and open toolbar")
	public void searchPatientAndClickToolbar() throws Exception {
		commonActions.clickElement(context.getDriver().findElement(By.xpath("//tr[@id='toolbarRow0']//td[2]")));
		Thread.sleep(1000);
	}
}
