package com.pageAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Feature_Production extends BaseClass {

	public Feature_Production() {

		PageFactory.initElements(driver, this);
	}

	// xpath for eTMF
	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted active'])[1]") 
	private WebElement eTMF;

	// xpath for communication
	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[1]") 
	private WebElement communication;

	// xpath for CRA Reconciliation
	@FindBy(xpath = "//*[text()='CRA Reconciliation']") 
	private WebElement CRAReconciliation;
	
	// xpath for warning ok
	@FindBy(xpath = "//*[text()='OK']") 
	private WebElement warning;

	// xpath for qualityReview
	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[3]") 
	private WebElement qualityReview;

	// xpath for tasks
	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[4]") 
	private WebElement tasks;

	// xpath for reports
	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[5]") 
	private WebElement reports;

	// xpath for usersManagement
	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[6]") 
	private WebElement usersManagement;

	// xpath for Q&A
	@FindBy(xpath = "(//*[text()='Q & A'])[2]") 
	private WebElement qA;

	// xpath for FAQ
	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[8]") 
	private WebElement faq;

	// xpath for queries
	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[9]") 
	private WebElement queries;

	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[10]") // xpath for eventManager
	private WebElement eventManager;

	@FindBy(xpath = "(//*[@class='context-item mark-active ng-star-inserted'])[11]") // xpath for setting
	private WebElement setting;
	
	@FindBy(xpath = "//*[@class='context-item ng-star-inserted active']") // xpath for home
	private WebElement home;
	
	@FindBy(xpath = "//*[text()='Yogesh P']") // xpath for user profile
	private WebElement userP;
	
	@FindBy(xpath = "//*[text()='Sign out']") // xpath for sign out
	private WebElement signOut;

	public WebElement geteTMF() {
		return eTMF;
	}

	public WebElement getCommunication() {
		return communication;
	}

	public WebElement getCRAReconciliation() {
		return CRAReconciliation;
	}

	public WebElement getQualityReview() {
		return qualityReview;
	}

	public WebElement getTasks() {
		return tasks;
	}

	public WebElement getReports() {
		return reports;
	}

	public WebElement getUsersManagement() {
		return usersManagement;
	}

	public WebElement getqA() {
		return qA;
	}

	public WebElement getFaq() {
		return faq;
	}

	public WebElement getQueries() {
		return queries;
	}

	public WebElement getEventManager() {
		return eventManager;
	}

	public WebElement getSetting() {
		return setting;
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getWarning() {
		return warning;
	}

	public WebElement getUserP() {
		return userP;
	}

	public WebElement getSignOut() {
		return signOut;
	}
	

}
