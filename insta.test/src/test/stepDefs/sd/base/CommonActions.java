package sd.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import sd.infra.HisTestContext;

public class CommonActions {

	Robot robot;
	public Alert alert;
	public String xlFile = "";
	public String xlSheet = "DepartmentData";
	public ConfigReader configReader;

	

	private WebDriver driver;
	/**
	 * 
	 * @param driver
	 */
	public CommonActions(WebDriver driver) {
		this.driver = driver;
		configReader = new ConfigReader();
		xlFile = configReader.getExcelRegInfoDataPath();
	}

	// click on element.
	public void clickElement(WebElement element) {
		try {
			Thread.sleep(1000);// this wait required for clicking on register button
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		element.click();
	}

	// Enter data in the field.
	/**
	 * 
	 * @param data
	 * @param element
	 */
	public void enterData(String data, WebElement element) {
		element.sendKeys(data);
	}

	/**
	 * 
	 * 
	 * @param index
	 * @param element
	 */
	public  void selectDropdownByIndex(int index, WebElement element) {
		Select dd = new Select(element);
		dd.selectByIndex(index);
	}

	/**
	 * This method sets the given input value to a dropdown
	 * 
	 * @param option  takes the given input value
	 * @param element takes the corresponding webelement object
	 */
	public  void selectDropdownByOption(String option, WebElement element) {
		Select dd = new Select(element);
		dd.selectByVisibleText(option);
	}

	/***
	 * This method is used to select the option from text field Example selecting
	 * doctor name, referred by doctor name etc
	 */
	public void selectTextFieldOption(String option, WebElement element) {
		element.sendKeys(option);
		try {
			robot = new Robot();
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_F8);
			robot.keyRelease(KeyEvent.VK_F8);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (InterruptedException | AWTException e) {
			e.printStackTrace();
		}
	}

	public String getText(WebElement element) {
		return element.getText();
	}

	public void goToTheUrl( String url) {

		 driver.navigate().to(url);
	}

	public void clearField(WebElement element) {
		element.clear();
	}

	public String getAttributeValue(String value, WebElement element) {
		// String value="";// this is used to get the value from text field
		return element.getAttribute(value);
	}

	// Returns page title
	public String getPageTitle() {
		return driver.getTitle();
	}

	public void selectToolBarActionOptions(String id, String tableData, String Option) {
		String tabelDataXpath = "//tr[contains(@onclick,'" + id + "')]";
		if (id.equals("") | id == null) {
			tabelDataXpath = "//td[contains(text() , \"" + tableData + "\")]";
		}
		Actions actions = new Actions(driver);

		System.out.println(tabelDataXpath);
		actions.moveToElement(driver.findElement(By.xpath(tabelDataXpath))).click().build().perform();

		switch (Option) {
		case "View/Edit":
			actions.moveToElement(driver.findElement(
					By.xpath("//div[@id = \"divToolBar_default\"]/a/div[contains(text(),\"" + Option + "\")]"))).click()
					.build().perform();
			break;

		default:
			actions.moveToElement(driver.findElement(
					By.xpath("//div[@id = \"divToolBar_default\"]/a/div[contains(text(),\"" + Option + "\")]"))).click()
					.build().perform();
			break;
		}

//		actions.contextClick(driver.findElement(By.xpath(tabelDataXpath))).perform();

//		clickElement(driver.findElement(By.xpath(tabelDataXpath)));

//		List<WebElement> options = driver.findElements(By.xpath("//div[@id = \"divToolBar_default\"]/a"));
//		for(WebElement ActionOptions: options) {
//			if(ActionOptions.getText().equals(Option) ) {
//				ActionOptions.click();
//			}
	}

	public void writeInExcelRowWise(String data, int column) {
		try {
			System.out.println("Rows >>> " + XLUtils.getRowCount(xlFile, xlSheet) + "Column >>>"
					+ XLUtils.getCellCount(xlFile, xlSheet, 0));
			int Row = XLUtils.getRowCount(xlFile, xlSheet);
			if (column < 1)
				Row = Row + 1;
			XLUtils.setCellData(xlFile, xlSheet, Row, column, data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param action provide "accept or dismiss"
	 * @return alert message
	 */
	public String switchToALert(String action) {
		try {
			alert = driver.switchTo().alert();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();

		}

		String message = "";
		message = alert.getText();
		System.out.println("The alert message is >>>>>>> " + message);
		if (action.equals("accept"))
			alert.accept();
		else if (action.equals("dismiss"))
			alert.dismiss();
		return message;
	}

}
