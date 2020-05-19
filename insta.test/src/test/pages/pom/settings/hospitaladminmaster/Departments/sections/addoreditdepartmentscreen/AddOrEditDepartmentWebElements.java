package pom.settings.hospitaladminmaster.Departments.sections.addoreditdepartmentscreen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class AddOrEditDepartmentWebElements {

	public AddOrEditDepartmentWebElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "dept_name")
	WebElement department;	

	@FindBy(name = "dept_type_id")
	WebElement departmentType;	

	@FindBy(name = "status")
	WebElement status;	

	@FindBy(name = "allowed_gender")
	WebElement allowedGender;	

	@FindBy(name = "cost_center_code")
	WebElement costCenterCode;	

	@FindBy(xpath = "//input[@id = 'exam_organ_category'][1]")
	WebElement examOrganCategorySingle;	

	@FindBy(xpath = "//input[@id = 'exam_organ_category'][2]")
	WebElement examOrganCategoryMultiple;	

	@FindBy(name = "clinical_information_form")
	WebElement clinicalInformationForm;	

	@FindBy(name = "default_first_out_consultation_haad")
	WebElement defaultFirstOutConsultationHaad;	

	@FindBy(name = "application_department_name")
	WebElement applicationDepartmentName;	

	@FindBy(name = "default_followup_out_consultation_haad")
	WebElement defaultFollowupOutConsultationHaad;	

	@FindBy(name = "default_first_in_consultation_haad")
	WebElement defaultFirstInConsultationHaad;	

	@FindBy(name = "default_followup_in_consultation_haad")
	WebElement defaultFollowupInCoultationHaad;	

	@FindBy(name = "default_first_out_consultation_dha")
	WebElement defaultFirstOutConsultationDha;	

	@FindBy(name = "default_followup_out_consultation_dha")
	WebElement defaultFollowupOutConsultationDha;	

	@FindBy(name = "default_first_in_consultation_dha")
	WebElement defaultFirstInConsultationDha;	

	@FindBy(name = "default_followup_in_consultation_dha")
	WebElement defaultFollowupInConsultationDha;	

	@FindBy(xpath = "//button[@accesskey=\"S\"]")
	WebElement saveButton;	

	@FindBy(linkText = "Department List")
	WebElement departmentList;
	
	@FindBy(linkText = "Add")
	WebElement addLink;
	
	@FindBy(xpath = "//input[@name = \"dept_id\" and contains(@value,\"DEP\")]")
	WebElement deptId;

	public WebElement getDepartment() {
		return department;
	}

	public void setDepartment(WebElement department) {
		this.department = department;
	}

	public WebElement getDepartmentType() {
		return departmentType;
	}

	public void setDepartmentType(WebElement departmentType) {
		this.departmentType = departmentType;
	}

	public WebElement getStatus() {
		return status;
	}

	public void setStatus(WebElement status) {
		this.status = status;
	}

	public WebElement getAllowedGender() {
		return allowedGender;
	}

	public void setAllowedGender(WebElement allowedGender) {
		this.allowedGender = allowedGender;
	}

	public WebElement getCostCenterCode() {
		return costCenterCode;
	}

	public void setCostCenterCode(WebElement costCenterCode) {
		this.costCenterCode = costCenterCode;
	}

	public WebElement getExamOrganCategorySingle() {
		return examOrganCategorySingle;
	}

	public void setExamOrganCategorySingle(WebElement examOrganCategorySingle) {
		this.examOrganCategorySingle = examOrganCategorySingle;
	}

	public WebElement getExamOrganCategoryMultiple() {
		return examOrganCategoryMultiple;
	}

	public void setExamOrganCategoryMultiple(WebElement examOrganCategoryMultiple) {
		this.examOrganCategoryMultiple = examOrganCategoryMultiple;
	}

	public WebElement getClinicalInformationForm() {
		return clinicalInformationForm;
	}

	public void setClinicalInformationForm(WebElement clinicalInformationForm) {
		this.clinicalInformationForm = clinicalInformationForm;
	}

	public WebElement getDefaultFirstOutConsultationHaad() {
		return defaultFirstOutConsultationHaad;
	}

	public void setDefaultFirstOutConsultationHaad(WebElement defaultFirstOutConsultationHaad) {
		this.defaultFirstOutConsultationHaad = defaultFirstOutConsultationHaad;
	}

	public WebElement getApplicationDepartmentName() {
		return applicationDepartmentName;
	}

	public void setApplicationDepartmentName(WebElement applicationDepartmentName) {
		this.applicationDepartmentName = applicationDepartmentName;
	}

	public WebElement getDefaultFollowupOutConsultationHaad() {
		return defaultFollowupOutConsultationHaad;
	}

	public void setDefaultFollowupOutConsultationHaad(WebElement defaultFollowupOutConsultationHaad) {
		this.defaultFollowupOutConsultationHaad = defaultFollowupOutConsultationHaad;
	}

	public WebElement getDefaultFirstInConsultationHaad() {
		return defaultFirstInConsultationHaad;
	}

	public void setDefaultFirstInConsultationHaad(WebElement defaultFirstInConsultationHaad) {
		this.defaultFirstInConsultationHaad = defaultFirstInConsultationHaad;
	}

	public WebElement getDefaultFollowupInCoultationHaad() {
		return defaultFollowupInCoultationHaad;
	}

	public void setDefaultFollowupInCoultationHaad(WebElement defaultFollowupInCoultationHaad) {
		this.defaultFollowupInCoultationHaad = defaultFollowupInCoultationHaad;
	}

	public WebElement getDefaultFirstOutConsultationDha() {
		return defaultFirstOutConsultationDha;
	}

	public void setDefaultFirstOutConsultationDha(WebElement defaultFirstOutConsultationDha) {
		this.defaultFirstOutConsultationDha = defaultFirstOutConsultationDha;
	}

	public WebElement getDefaultFollowupOutConsultationDha() {
		return defaultFollowupOutConsultationDha;
	}

	public void setDefaultFollowupOutConsultationDha(WebElement defaultFollowupOutConsultationDha) {
		this.defaultFollowupOutConsultationDha = defaultFollowupOutConsultationDha;
	}

	public WebElement getDefaultFirstInConsultationDha() {
		return defaultFirstInConsultationDha;
	}

	public void setDefaultFirstInConsultationDha(WebElement defaultFirstInConsultationDha) {
		this.defaultFirstInConsultationDha = defaultFirstInConsultationDha;
	}

	public WebElement getDefaultFollowupInConsultationDha() {
		return defaultFollowupInConsultationDha;
	}

	public void setDefaultFollowupInConsultationDha(WebElement defaultFollowupInConsultationDha) {
		this.defaultFollowupInConsultationDha = defaultFollowupInConsultationDha;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(WebElement saveButton) {
		this.saveButton = saveButton;
	}

	public WebElement getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(WebElement departmentList) {
		this.departmentList = departmentList;
	}

	public WebElement getAddLink() {
		return addLink;
	}

	public void setAddLink(WebElement addLink) {
		this.addLink = addLink;
	}

	public WebElement getDeptId() {
		return deptId;
	}

	public void setDeptId(WebElement deptId) {
		this.deptId = deptId;
	}
	
	
}
