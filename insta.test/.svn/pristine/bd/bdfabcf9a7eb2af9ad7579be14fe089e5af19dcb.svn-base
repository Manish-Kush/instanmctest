package pom.settings.hospitaladminmaster.Departments.sections.departmentmasterdashboard;

import io.cucumber.java.en.When;
import pom.settings.hospitaladminmaster.Departments.DepartmentMasterWebElements;
import sd.base.CommonActions;
import sd.infra.HisTestContext;

public class Search {

	public DepartmentMasterWebElements departmentMasterWebElements;

	HisTestContext context;

	public Search(HisTestContext context) {
		this.context = context;

		departmentMasterWebElements = new DepartmentMasterWebElements(context.getDriver());
	}

	@When("^\"([^\"]*)\" is entred in Department Name$")
	public void enterDepartment(String department) {
		context.getCommonActions().enterData(department, departmentMasterWebElements.getDepartmentName());
	}

	@When("clicked on Clear link")
	public void clickOnClearLink() {
		context.getCommonActions().clickElement(departmentMasterWebElements.getClearLink());
	}

	@When("click on Search button")
	public void clickOnSearchButton() {
		context.getCommonActions().clickElement(departmentMasterWebElements.getSearchButton());
	}

	@When("Exam Organ Category is selected as \"([^\"]*)\"")
	public void selectExamOrganCategory(String Category) {
		switch (Category) {
		case "All":
			context.getCommonActions().clickElement(departmentMasterWebElements.getStatusAllCheckBox());
			break;

		case "Single":
//			CommonActions.clickElement(departmentMasterWebElements.);
			break;
		case "Multiple":

			break;

		default:

			break;
		}
	}

	public DepartmentMasterWebElements getObj() {
		return departmentMasterWebElements;
	}

}
