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

	private UserLogin userLoginObj;
	private HisTestContext context;

	public Login(HisTestContext context, UserLogin userLoginObject) {
		userLoginObj = userLoginObject;
		this.context = context;
	}

	public void setHospitalName(String hospital) {
		userLoginObj.getHospital().clear();
		context.getCommonActions().enterData(hospital, userLoginObj.getHospital());
	}

	public void setUserName(String userName) {
		userLoginObj.getUserName().clear();
		context.getCommonActions().enterData(userName, userLoginObj.getUserName());
	}

	public void setPassword(String password) {
		userLoginObj.getPassword().clear();
		context.getCommonActions().enterData(password, userLoginObj.getPassword());
	}

	public void clickSubmitBtn() {
		context.getCommonActions().clickElement(userLoginObj.getSubmitButton());
	}

	public void clickRemindMeLater() {
		context.getCommonActions().clickElement(userLoginObj.getRemindMeLaterLink());
	}

	public boolean checkVisibilityOfElement() {
		try {
			return userLoginObj.getRemindMeLaterLink().isDisplayed();
		} catch (ElementNotVisibleException | NoSuchElementException e) {
			return false;
		}
	}

}
