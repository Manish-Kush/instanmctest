package runner.base.patient;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/features/scenarios/base/patient/IpPatientVitalForm.feature" }, glue = {
		"sd.base.security", "sd.base.patient.patient", "sd.base.patient.ippatient" }, plugin = { "pretty",
				"json:target/cucumber-reports/IpPatientVitalFormTest.json" }, strict = true)
public class IpPatientVitalFormTest extends AbstractTestNGCucumberTests {

}
