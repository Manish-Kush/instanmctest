package sd.base.security;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;

import pom.login.UserLogin;
import sd.infra.HisTestContext;

/**
 * 
 * @author manish
 *
 */

public class Login {

	UserLogin userLoginObj;

	private HisTestContext context;

	/**
	 * 
	 * @param driver
	 */

	public Login(HisTestContext context) {
		this.context = context;

	}

	public Login(HisTestContext context,UserLogin userLoginObject) {
		userLoginObj = userLoginObject;
		this.context = context;

	}

	public void setHospitalName(String hospital) {

		context.getCommonActions().clearField(userLoginObj.hospital);
		context.getCommonActions().enterData(hospital, userLoginObj.hospital);
	}

	public void setUserName(String userName) {
		context.getCommonActions().enterData(userName, userLoginObj.userName);
	}

	public void setPassword(String password) {
		context.getCommonActions().enterData(password, userLoginObj.password);
	}

	public void clickSubmitBtn() {
		context.getCommonActions().clickElement(userLoginObj.submitButton);
	}

	public void clickRemindMeLater() {
		context.getCommonActions().clickElement(userLoginObj.remindMeLaterLink);
	}

	public boolean checkVisibilityOfElement() {
		try {
			return userLoginObj.remindMeLaterLink.isDisplayed();
		} catch (ElementNotVisibleException | NoSuchElementException e) {
			return false;
		}
	}

}
