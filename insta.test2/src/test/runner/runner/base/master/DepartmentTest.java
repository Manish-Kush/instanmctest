package runner.base.master;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/features/scenarios/base/master/Department.feature", glue = {
		"sd.base.security", "sd.base.master.dept" }, tags = { "@check" })

public class DepartmentTest extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {

		return super.scenarios();
	}
}
