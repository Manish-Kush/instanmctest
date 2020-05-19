package runner.base.master;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/features/scenarios/base/master/Department.feature", glue = {
		"sd.base.security", "sd.base.master.dept" },tags= {"@DummyTest"} ,strict=true, plugin = {"pretty","json:target/cucumber-reports/DepartmentTest.json"})

public class DepartmentTest extends AbstractTestNGCucumberTests {

}
