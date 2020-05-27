package sd.base.security;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pom.login.UserLogin;
import sd.base.ConfigReader;
import sd.infra.HisTestContext;

/**
 * 
 * @author manish
 *
 */

public class LoginToApplication {

	private HisTestContext context;
	private ConfigReader configReader;

	/**
	 * 
	 * @param driver
	 */
	public LoginToApplication(HisTestContext context) {
		this.context = context;
		configReader = new ConfigReader();
	}

	@Given("Open {string} browser and load application")
	public void openBrowserAndApplication(String browser) {
		context.setUp(browser);
	}

	@Given("Open {string} browser and go to {string}")
	public void openBrowserAndApplication(String browser, String BaseURL) {
		context.setBaseURL(BaseURL);
		context.setUp(browser);
	}

	@Given("Login to the application with Insta Admin")
	public void login() {
		UserLogin userLoginObj = new UserLogin(this.context.getDriver());
		Login login = new Login(context, userLoginObj);
		login.setHospitalName(configReader.getHospital());
		login.setUserName(configReader.getUserName());
		login.setPassword(configReader.getPassword());
		login.clickSubmitBtn();
	}

	@Given("Login with hospital name {string}, user name {string} and password {string}")
	public void login(String hospitalName, String userName, String password) {
		UserLogin userLoginObj = new UserLogin(this.context.getDriver());
		Login login = new Login(context, userLoginObj);
		login.setHospitalName(hospitalName);
		login.setUserName(userName);
		login.setPassword(password);
		login.clickSubmitBtn();
	}

	@And("close the driver")
	public void closeDriver() {
		context.getDriver().quit();
	}

}
