package sd.base.security;

import pom.login.UserLogOut;
import sd.base.CommonActions;
import sd.infra.HisTestContext;

/**
 * 
 * @author manish
 *
 */
public class LogOut {
	UserLogOut userLogOut;

	private HisTestContext context;

	/**
	 * 
	 * @param driver
	 */

	public LogOut(HisTestContext context, UserLogOut userLogOutOb) {
		this.context = context;

		userLogOut = userLogOutOb;
	}

	public void clickOnlogout() {
		context.getCommonActions().clickElement(userLogOut.getLogout());
	}

}
