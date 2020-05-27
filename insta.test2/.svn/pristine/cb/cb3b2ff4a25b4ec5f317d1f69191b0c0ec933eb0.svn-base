package sd.base.master.dept;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pom.settings.hospitaladminmaster.Departments.sections.addoreditdepartmentscreen.AddOrEditDepartmentWebElements;
import sd.base.CommonActions;
import sd.infra.HisTestContext;

public class Department {

	public AddOrEditDepartmentWebElements addOrEditDepartmentWebElements;

	// HisTestContext context;

	CommonActions commonActions;

	public Department(CommonActions commonActions) {
		

		
	}

	public Department(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.commonActions = new CommonActions(driver);
		addOrEditDepartmentWebElements = new AddOrEditDepartmentWebElements(driver);
	}

	@When("^\"([^\"]*)\" is entered in department$")
	public void is_entered_in_department(String arg1) {
		commonActions.enterData(arg1, addOrEditDepartmentWebElements.getDepartment());
	}

	@When("^clear the department$")
	public void clear_the_department() {
		commonActions.clearField(addOrEditDepartmentWebElements.getDepartment());
	}

	@When("^\"([^\"]*)\" option is selected in status drop down$")
	public void option_is_selected_in_status_drop_down(String arg1) {

		commonActions.selectDropdownByOption(arg1, addOrEditDepartmentWebElements.getStatus());
	}

	@When("^\"([^\"]*)\" option is selected in Department Type drop down$")
	public void option_is_selected_in_Department_Type_drop_down(String arg1) {
		commonActions.selectDropdownByOption(arg1, addOrEditDepartmentWebElements.getDepartmentType());

	}

	public String GetId() {
		return commonActions.getAttributeValue("value", addOrEditDepartmentWebElements.getDeptId());
	}
}
