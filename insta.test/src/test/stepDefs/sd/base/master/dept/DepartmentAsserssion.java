package sd.base.master.dept;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.Then;
import pom.settings.hospitaladminmaster.Departments.DepartmentMasterWebElements;
import pom.settings.hospitaladminmaster.Departments.sections.addoreditdepartmentscreen.AddOrEditDepartmentWebElements;
import pom.settings.hospitaladminmaster.Departments.sections.departmentmasterdashboard.Search;
import sd.base.ConfigReader;
import sd.base.XLUtils;
import sd.infra.HisTestContext;

public class DepartmentAsserssion {
	public DepartmentScenarios departmentScenarios;
	public Search search;
	public DepartmentMasterWebElements departmentMasterWebElements;
	public AddOrEditDepartmentWebElements addOrEditDepartmentWebElements;

	public static String xlFile;
	public static String xlSheet = "DepartmentData";

	HisTestContext context;
	ConfigReader configReader;

	public DepartmentAsserssion(HisTestContext context) {
		this.context = context;

		departmentScenarios = new DepartmentScenarios(context);
		search = new Search(context);
		departmentMasterWebElements = new DepartmentMasterWebElements(context.getDriver());
		configReader = new ConfigReader();
		xlFile = configReader.getExcelRegInfoDataPath();
	}

	@Then("department should list in dash board")
	public void department_should_list_in_dash_board() throws IOException {

		departmentScenarios.navigated_to_Department_Master_dashboard();
		search.clickOnClearLink();
		search.enterDepartment(XLUtils.getCellData(xlFile, xlSheet, XLUtils.getRowCount(xlFile, xlSheet), 0));
		search.clickOnSearchButton();
		context.getCommonActions().selectToolBarActionOptions(
				XLUtils.getCellData(xlFile, xlSheet, XLUtils.getRowCount(xlFile, xlSheet), 1), "", "View/Edit");
		String value = context.getCommonActions().getAttributeValue("value",
				addOrEditDepartmentWebElements.getDepartment());
		assertEquals(value, "Cardio", "The Department name is not matching");
	}

	@Then("^alert should display with \"([^\"]*)\" message$")
	public void alert_should_display_with_message(String arg1) {
		assertEquals(context.getCommonActions().switchToALert("accept"), arg1, "Error in alert");
		context.getCommonActions().switchToALert("accept");
	}

	@Then("^department name should be updated$")
	public void department_name_should_be_updated() {

	}

	@Then("^department status should be updated$")
	public void department_status_should_be_updated() {

	}

	@Then("^department type should be updated$")
	public void department_type_should_be_updated() {

	}
}
