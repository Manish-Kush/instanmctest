package sd.base.security;

import pom.login.UserLogOut;
import sd.infra.HisTestContext;

public class LogOutOfApplication {
	private UserLogOut userLogOutObj;
	private LogOut logOut;
	private HisTestContext context;

	/**
	 * 
	 * @param driver
	 */
	public LogOutOfApplication(HisTestContext context) {
		this.context = context;
		userLogOutObj = new UserLogOut(this.context.getDriver());
		logOut = new LogOut(this.context, userLogOutObj);
	}

	public void logOut() {
		logOut.clickOnlogout();
	}

	public UserLogOut getUserLogOutObj() {
		return userLogOutObj;
	}
}
