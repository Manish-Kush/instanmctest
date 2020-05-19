package sd.base.master.dept;

import io.cucumber.java.en.When;
import pom.settings.hospitaladminmaster.Departments.sections.addoreditdepartmentscreen.AddOrEditDepartmentWebElements;
import sd.infra.HisTestContext;

public class DepartmentLinksAndButtons {

	public AddOrEditDepartmentWebElements addOrEditDepartmentWebElements;

	HisTestContext context;

	public DepartmentLinksAndButtons(HisTestContext context) {
		this.context = context;

		addOrEditDepartmentWebElements = new AddOrEditDepartmentWebElements(context.getDriver());
	}

	@When("^clicked on Save button$")
	public void clicked_on_Save_button() {
		context.getCommonActions().clickElement(addOrEditDepartmentWebElements.getSaveButton());
	}

	@When("^clicked on Add link$")
	public void clicked_on_Add_link() {
		context.getCommonActions().clickElement(addOrEditDepartmentWebElements.getAddLink());

	}

}
