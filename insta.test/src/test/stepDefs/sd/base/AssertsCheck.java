package sd.base;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;

import sd.infra.HisTestContext;

public class AssertsCheck {

	private HisTestContext context;
	private CommonActions commonActions;
	private TextFile file;

	public AssertsCheck(HisTestContext context) {
		this.context = context;
		commonActions = context.getCommonActions();
		file = new TextFile();
	}

	public boolean checkAssertTrueUsingAlert() throws InterruptedException, IOException {
		try {
			// Check alert window and capturing alert message.
			Alert alert = context.getDriver().switchTo().alert();
			String alertMessage = context.getDriver().switchTo().alert().getText();

			Assert.assertTrue(file.getErrorList().stream().anyMatch(item -> alertMessage.contains(item)));
			Thread.sleep(1000);
			alert.accept();
			Thread.sleep(1000);
		} catch (NoAlertPresentException e) {
			return false;
		}
		return true;
	}

	public boolean checkAssertTrueUsingMessage() throws IOException {
		By byElement = By.xpath("//div[@id='msgDiv']");
		// Check the error message in the same page

		if (commonActions.isPresentAndDisplayed(byElement)) {
			String alertMessage = context.getDriver().findElement(By.xpath("//div[@id='msgDiv']")).getText();
			Assert.assertTrue(file.getErrorList().stream().anyMatch(item -> alertMessage.contains(item)));
			return true;
		}
		return false;
	}
	
	public boolean checkAssertTrueUsingAlert(String message) throws InterruptedException, IOException {
		try {
			// Check alert window and capturing alert message.
			Alert alert = context.getDriver().switchTo().alert();
			String alertMessage = context.getDriver().switchTo().alert().getText();

			Assert.assertTrue(message.equalsIgnoreCase(alertMessage));
			Thread.sleep(1000);
			alert.accept();
			Thread.sleep(1000);
		} catch (NoAlertPresentException e) {
			return false;
		}
		return true;
	}
	
	public boolean checkAssertUsingAlertRelativeMessage(String message) throws InterruptedException, IOException {
		try {
			// Check alert window and capturing alert message.
			Alert alert = context.getDriver().switchTo().alert();
			String alertMessage = context.getDriver().switchTo().alert().getText();

			Assert.assertTrue(alertMessage.indexOf(message) >= 0);
			Thread.sleep(1000);
			alert.accept();
			Thread.sleep(1000);
		} catch (NoAlertPresentException e) {
			return false;
		}
		return true;
	}
}