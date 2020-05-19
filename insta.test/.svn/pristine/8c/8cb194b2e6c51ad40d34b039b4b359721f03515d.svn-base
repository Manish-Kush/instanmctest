package sd.base.master.dept;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pom.settings.hospitaladminmaster.Departments.sections.departmentmasterdashboard.Search;
import sd.base.CommonActions;
import sd.base.NameAndPhoneNumAndOldRegProvider;
import sd.infra.HisTestContext;

public class DepartmentScenarios {

	public Search search;
	// public Department department;
	// public DepartmentConsultationMapping departmentConsultationMapping;
	// public DepartmentLinksAndButtons departmentLinksAndButtons;

	public NameAndPhoneNumAndOldRegProvider name;

	HisTestContext context;

	public DepartmentScenarios(HisTestContext context) {
		this.context = context;

		search = new Search(context);
		// Department department = new Department(context);

		// departmentConsultationMapping = new DepartmentConsultationMapping();
		// departmentLinksAndButtons = new DepartmentLinksAndButtons(context);
		name = new NameAndPhoneNumAndOldRegProvider();
	}

	/*
	 * contextcontext@Before public void setUp() { driver = new FirefoxDriver(); }
	 */
	
	@After public void cleanUp(){ 
	      context.getDriver().close(); 
	   } 

	@Given("navigated to Add Department screen")
	public void navigated_to_Add_Department_screen() {
		System.out.println(" Current URL :: " + context.getDriver().getCurrentUrl());
		CommonActions ca = new CommonActions(context.getDriver());
		ca.goToTheUrl("http://10.8.55.122/instanmc/master/DepartmentMaster.do?_method=add");
	}

	@When("department details entered")
	public void department_details_entered() {

		String RandomName = name.RandName();
		Department department = new Department(context.getDriver());

		department.is_entered_in_department(RandomName);
		context.getCommonActions().writeInExcelRowWise(RandomName, 0);
		department.option_is_selected_in_Department_Type_drop_down("Obstetrics");
		department.option_is_selected_in_status_drop_down("Active");

		DepartmentLinksAndButtons departmentLinksAndButtons = new DepartmentLinksAndButtons(context);

		departmentLinksAndButtons.clicked_on_Save_button();
		context.getCommonActions().writeInExcelRowWise(department.GetId(), 1);

	}

	@Given("navigated to Department Master dashboard")
	public void navigated_to_Department_Master_dashboard() {
		context.getCommonActions().goToTheUrl(
				"http://10.8.55.122/instanmc/master/DepartmentMaster.do?_method=list&sortOrder=dept_name&sortReverse=false&dep.status=A");

	}

	@Given("^navigate to \"([^\"]*)\" department’s Edit Department screen$")
	public void navigate_to_department_s_Edit_Department_screen(String arg1) {
		context.getCommonActions().goToTheUrl(
				"http://10.8.55.122/instanmc/master/DepartmentMaster.do?_method=list&sortOrder=dept_name&sortReverse=false&dep.status=A");
		context.getCommonActions().enterData(arg1, search.getObj().departmentName);
		context.getCommonActions().selectToolBarActionOptions("", arg1, "View/Edit");
	}
}
