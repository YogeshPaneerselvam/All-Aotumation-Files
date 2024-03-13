package com.pageActionClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gL.HelperClass;

public class Dashboard extends HelperClass {

	public Dashboard() {

		PageFactory.initElements(driver, this);

	}

     // XPath for clicking dashboard 
	@FindBy(xpath = "(//*[text()='Dashboard'])[2]")
	private WebElement dashboard;

	// XPath for clicking my dashboard
	@FindBy(xpath = "(//*[text()='My Dashboard'])")
	private WebElement myDashboard;

	// XPath for clicking kpi analytics
	@FindBy(xpath = "(//*[text()='KPI Analytics'])[4]")
	private WebElement analytics;

	// XPath for clicking course catalog
	@FindBy(xpath = "(//*[text()='Course Catalog'])")
	private WebElement courseCatalog;

	// XPath for clicking course management
	@FindBy(xpath = "(//*[text()='Course Management'])[4]")
	private WebElement courseManagement;

	// XPath for clicking manage certificates
	@FindBy(xpath = "//*[text()='Manage Certificates']")
	private WebElement manageCertificates;

	// XPath for clicking transcript
	@FindBy(xpath = "//*[text()='Transcript']")
	private WebElement Transcript;

	// XPath for clicking my transcript
	@FindBy(xpath = "//*[text()='My Transcript']")
	private WebElement myTranscript;

	// XPath for clicking my direct reports
	@FindBy(xpath = "//*[text()='My Direct Reports']")
	private WebElement myDirectReports;

	// XPath for clicking external training 
	@FindBy(xpath = "(//*[text()='External Training'])[13]")
	private WebElement externalTraining;

	// XPath for clicking company dashboard
	@FindBy(xpath = "(//*[text()='Company Dashboard'])[2]")
	private WebElement companyDashboard;

	// XPath for clicking reports
	@FindBy(xpath = "(//*[text()='Reports'])")
	private WebElement report;

	// XPath for clicking help
	@FindBy(xpath = "(//*[text()='Help'])")
	private WebElement help;

	public WebElement getDashboard() {
		return dashboard;
	}

	public WebElement getMyDashboard() {
		return myDashboard;
	}

	public WebElement getAnalytics() {
		return analytics;
	}

	public WebElement getCourseCatalog() {
		return courseCatalog;
	}

	public WebElement getCourseManagement() {
		return courseManagement;
	}

	public WebElement getManageCertificates() {
		return manageCertificates;
	}

	public WebElement getTranscript() {
		return Transcript;
	}

	public WebElement getMyTranscript() {
		return myTranscript;
	}

	public WebElement getMyDirectReports() {
		return myDirectReports;
	}

	public WebElement getExternalTraining() {
		return externalTraining;
	}

	public WebElement getCompanyDashboard() {
		return companyDashboard;
	}

	public WebElement getReport() {
		return report;
	}

	public WebElement getHelp() {
		return help;
	}

}
