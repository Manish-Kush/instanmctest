package runner.base.patient;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/features/scenarios/base/patient/OutPatientVitalForm.feature" }, glue = {
		"sd.base.security", "sd.base.patient.patient", "sd.base.patient.oppatient" }, plugin = { "pretty",
"json:target/cucumber-reports/OutPatientVitalFormTest.json" }, strict = true)
public class OutPatientVitalFormTest extends AbstractTestNGCucumberTests {

}
