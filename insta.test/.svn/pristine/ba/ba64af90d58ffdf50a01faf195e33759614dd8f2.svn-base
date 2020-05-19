package sd.base.security;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import pom.login.UserLogin;
import sd.infra.HisTestContext;

/**
 * 
 * @author manish
 *
 */

public class LoginToApplication {

	//UserLogin userLoginObj;
	//Login login;
	// UserLogOut logout;

	private HisTestContext context;

	/**
	 * 
	 * @param driver
	 */
	public LoginToApplication(HisTestContext context) {
		this.context = context;
		//userLoginObj = new UserLogin(this.context.getDriver());
		//login = new Login(context,userLoginObj);
	}

	public LoginToApplication(WebDriver driver) {
		//userLoginObj = new UserLogin(driver);
		//login = new Login(context,userLoginObj);
	}

	/*
	 * public UserLogin getUserLoginObj() { //return userLoginObj;
	 }*/

	/**
	 * Here we will be passing the parameters from XL files
	 */
	public void login() {
		
		UserLogin userLoginObj = new UserLogin(this.context.getDriver());
		Login login = new Login(context,userLoginObj);
		login.setHospitalName("nmc");
		login.setUserName("Doc001");
		login.setPassword("Insta@123");
		login.clickSubmitBtn();

		if (login.checkVisibilityOfElement()) {
			login.clickRemindMeLater();
		}
	}

	@Given("Login with user {string} and password {string}")
	public void login(String userName, String password) {
		UserLogin userLoginObj = new UserLogin(this.context.getDriver());
		Login login = new Login(context,userLoginObj);
		login.setHospitalName("nmc");
		login.setUserName(userName);
		login.setPassword(password);
		login.clickSubmitBtn();

		/*
		 * if(login.checkVisibilityOfElement()) { login.clickRemindMeLater(); }
		 */
	}
	
	
	
	@Given("Open {string} browser and go to {string}")
	public void open_browser_and_go_to(String browser, String BaseURL){
		context.baseURL = BaseURL;
		context.setUp(browser);	    
	}
	
}
