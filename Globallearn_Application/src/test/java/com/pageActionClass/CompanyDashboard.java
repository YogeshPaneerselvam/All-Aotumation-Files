package com.pageActionClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gL.HelperClass;

public class CompanyDashboard extends HelperClass {

	public CompanyDashboard() {

		PageFactory.initElements(driver, this);

	}

	// XPath for company dashboard
	@FindBy(xpath = "(//*[text()='Company Dashboard'])[3]")
	private WebElement companyDashboard;

	// XPath for  edit company
	@FindBy(xpath = "//*[text()='Edit Company']")
	private WebElement editCompany;

	// XPath for  manage announcements
	@FindBy(xpath = "//*[text()='Manage Announcements']")
	private WebElement manageAnnouncements;

	// XPath for  email templates
	@FindBy(xpath = "//*[text()='Email Templates']")
	private WebElement emailTemplates;

	// XPath for  add profile fields
	@FindBy(xpath = "//*[text()='Add Profile Fields']")
	private WebElement addProfileFields;

	// XPath for  audit trail
	@FindBy(xpath = "//*[text()='Audit Trail']")
	private WebElement auditTrail;

	// XPath for  manage sites
	@FindBy(xpath = "//*[text()='Manage Sites']")
	private WebElement manageSites;

	// XPath for  manage contact types
	@FindBy(xpath = "//*[text()='Manage Contact Types']")
	private WebElement manageContactTypes;

	// XPath for  content library
	@FindBy(xpath = "//*[text()='Content Library']")
	private WebElement contentLibrary;

	// XPath for  catalog management
	@FindBy(xpath = "//*[text()='Catalog Management']")
	private WebElement catalogManagement;

	// XPath for  manage certificates
	@FindBy(xpath = "//*[text()='Manage Certificates']")
	private WebElement manageCertificates;

	// XPath for  content library tags management
	@FindBy(xpath = "//*[text()='Content Library Tags Management']")
	private WebElement contentLibraryTagsManagement;

	// XPath for  course management
	@FindBy(xpath = "(//*[text()='Course Management'])[2]")
	private WebElement courseManagement;

	// XPath for  manage learning plans
	@FindBy(xpath = "//*[text()='Manage Learning Plans']")
	private WebElement manageLearningPlans;

	// XPath for manage training groups
	@FindBy(xpath = "//*[text()='Manage Training Groups']")
	private WebElement manageTrainingGroups;

	// XPath for  add course fields
	@FindBy(xpath = "//*[text()='Add Course Fields']")
	private WebElement addCourseFields;

	// XPath for  create user
	@FindBy(xpath = "//*[text()='Create User']")
	private WebElement createUser;

	// XPath for  list edit users
	@FindBy(xpath = "//*[text()='List/Edit Users']")
	private WebElement listEditUsers;

	// XPath for  upload user
	@FindBy(xpath = "//*[text()='Upload Users']")
	private WebElement uploadUsers;

	// XPath for  reports
	@FindBy(xpath = "(//*[text()='Reports'])[2]")
	private WebElement reports;

	// XPath for  sql reports
	@FindBy(xpath = "//*[text()='SQL Reports']")
	private WebElement sQLReports;

	// XPath for  esignature
	@FindBy(xpath = "//*[text()='eSignature']")
	private WebElement eSignature;

	// XPath for class room training
	@FindBy(xpath = "//*[text()='Classroom Training']")
	private WebElement classroomTraining;

	// XPath for  certificate
	@FindBy(xpath = "//*[text()='Certificate']")
	private WebElement Certificate;

	// XPath for  owner permissions
	@FindBy(xpath = "//*[text()='Owner Permissions']")
	private WebElement OwnerPermissions;

	// XPath for  read and acknowledge
	@FindBy(xpath = "//*[text()='Read & Acknowledge']")
	private WebElement readAcknowledge;

	// XPath for  manage welcome message 
	@FindBy(xpath = "//*[text()='Manage Welcome Message']")
	private WebElement manageWelcomeMessage;

	// XPath for  settings
	@FindBy(xpath = "(//*[text()='Settings'])[2]")
	private WebElement Settings;

	public WebElement getCompanyDashboard() {
		return companyDashboard;
	}

	public WebElement getEditCompany() {
		return editCompany;
	}

	public WebElement getManageAnnouncements() {
		return manageAnnouncements;
	}

	public WebElement getEmailTemplates() {
		return emailTemplates;
	}

	public WebElement getAddProfileFields() {
		return addProfileFields;
	}

	public WebElement getAuditTrail() {
		return auditTrail;
	}

	public WebElement getManageSites() {
		return manageSites;
	}

	public WebElement getManageContactTypes() {
		return manageContactTypes;
	}

	public WebElement getContentLibrary() {
		return contentLibrary;
	}

	public WebElement getCatalogManagement() {
		return catalogManagement;
	}

	public WebElement getManageCertificates() {
		return manageCertificates;
	}

	public WebElement getContentLibraryTagsManagement() {
		return contentLibraryTagsManagement;
	}

	public WebElement getCourseManagement() {
		return courseManagement;
	}

	public WebElement getManageLearningPlans() {
		return manageLearningPlans;
	}

	public WebElement getManageTrainingGroups() {
		return manageTrainingGroups;
	}

	public WebElement getAddCourseFields() {
		return addCourseFields;
	}

	public WebElement getCreateUser() {
		return createUser;
	}

	public WebElement getListEditUsers() {
		return listEditUsers;
	}

	public WebElement getUploadUsers() {
		return uploadUsers;
	}

	public WebElement getReports() {
		return reports;
	}

	public WebElement getsQLReports() {
		return sQLReports;
	}

	public WebElement geteSignature() {
		return eSignature;
	}

	public WebElement getClassroomTraining() {
		return classroomTraining;
	}

	public WebElement getCertificate() {
		return Certificate;
	}

	public WebElement getOwnerPermissions() {
		return OwnerPermissions;
	}

	public WebElement getReadAcknowledge() {
		return readAcknowledge;
	}

	public WebElement getManageWelcomeMessage() {
		return manageWelcomeMessage;
	}

	public WebElement getSettings() {
		return Settings;
	}

}
