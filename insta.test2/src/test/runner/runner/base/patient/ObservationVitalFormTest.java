package runner.base.patient;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/features/scenarios/base/patient/ObservationVitalForm.feature" }, glue = {
		"sd.base.security", "sd.base.patient.patient", "sd.base.patient.observationpatient" }, plugin = { "pretty",
"json:target/cucumber-reports/ObservationVitalFormTest.json" }, strict = true)
public class ObservationVitalFormTest extends AbstractTestNGCucumberTests {

}
