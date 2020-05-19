package pom.settings.hospitaladminmaster.Departments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class DepartmentMasterWebElements {

	public DepartmentMasterWebElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "dept_name")
	public WebElement departmentName;

	@FindBy(id = "Search")
	public WebElement searchButton;

	@FindBy(id = "dep.status_")
	public WebElement statusAllCheckBox;

	@FindBy(linkText = "Clear")
	public WebElement clearLink;

	@FindBy(linkText = "Add New Department")
	public WebElement addNewDepartment;

	public WebElement getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(WebElement departmentName) {
		this.departmentName = departmentName;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

	public WebElement getStatusAllCheckBox() {
		return statusAllCheckBox;
	}

	public void setStatusAllCheckBox(WebElement statusAllCheckBox) {
		this.statusAllCheckBox = statusAllCheckBox;
	}

	public WebElement getClearLink() {
		return clearLink;
	}

	public void setClearLink(WebElement clearLink) {
		this.clearLink = clearLink;
	}

	public WebElement getAddNewDepartment() {
		return addNewDepartment;
	}

	public void setAddNewDepartment(WebElement addNewDepartment) {
		this.addNewDepartment = addNewDepartment;
	}

//	@FindBy(xpath = )
//	public WebElement ;
//	
//	@FindBy()
//	public WebElement ;
//	
//	@FindBy()
//	public WebElement ;
//	
//	@FindBy()
//	public WebElement ;
//	
//	@FindBy()
//	public WebElement ;

	// tr[contains(@onclick,'DEP0056')]
}
