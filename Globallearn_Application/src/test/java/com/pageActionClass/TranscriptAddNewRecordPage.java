package com.pageActionClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gL.HelperClass;

public class TranscriptAddNewRecordPage extends HelperClass {

	public TranscriptAddNewRecordPage() {
		PageFactory.initElements(driver, this);

	}


	// XPath for add new record
	@FindBy(xpath = "//*[text()=' Add New Record']")
	private WebElement addNewRecord;

	// XPath for  external training name 
	@FindBy(xpath = "//*[@id='fldname']")
	private WebElement enterExternalTrainingName;

	// XPath for external school company name 
	@FindBy(xpath = "//*[@id='fldcompany']")
	private WebElement enterSchoolCompanyName;

	// XPath for credits
	@FindBy(xpath = "//*[@id='fldcredits']")
	private WebElement enterCredits;

	// XPath for enter trainig area
	@FindBy(xpath = "//*[@id='trainingarea']")
	private WebElement trainingArea;

	// XPath for training schedule drop down
	@FindBy(xpath = "//*[@id='trainingschedule']")
	private WebElement trainingScheduleDropdown;

	// XPath for training schedule option
	@FindBy(xpath = "//*[text()='Mixed']")
	private WebElement mixedOption;

	// XPath for training schedule option
	@FindBy(xpath = "//*[text()='Work hours']")
	private WebElement workHoursOption;

	// XPath for training schedule option
	@FindBy(xpath = "//*[text()='After work hours']")
	private WebElement afterworkhoursOption;

	// XPath for type of training entity
	@FindBy(xpath = "//*[@id='typeoftrainingentity']")
	private WebElement typeoftrainingentity;

	// XPath for training course code
	@FindBy(xpath = "//*[@id='trainingcoursecode']")
	private WebElement trainingCourSecode;

	// XPath for days
	@FindBy(xpath = "//*[@id='d']")
	private WebElement days;

	// XPath for hours
	@FindBy(xpath = "//*[@id='h']")
	private WebElement hours;

	// XPath for minutes
	@FindBy(xpath = "//*[@id='m']")
	private WebElement Minutes;

	// XPath for seconds
	@FindBy(xpath = "//*[@id='s']")
	private WebElement Seconds;

	// XPath for cancel button
	@FindBy(xpath = "(//*[text()='Cancel'])[7]")
	private WebElement cancelButton;

	// XPath for next button
	@FindBy(xpath = "(//*[text()='Next'])")
	private WebElement nextButton;

	// XPath for previous button
	@FindBy(xpath = "(//*[text()='Previous'])")
	private WebElement previousButton;

	// XPath for search potential users
	@FindBy(xpath = "(//*[@id='searchpotentialusers'])")
	private WebElement searchpotentialusers;

	// XPath for search potential check box user item
	@FindBy(xpath = "//*[@id='cbxitem']")
	private WebElement potentialusersItem;

	// XPath for contact type drop down
	@FindBy(xpath = "(//*[text()='Contact Type'])")
	private WebElement contactTypeDropdown;

	// XPath for study/site drop down
	@FindBy(xpath = "(//*[text()='Study/Site'])[1]")
	private WebElement studySiteDropdown;

	// XPath for group drop down
	@FindBy(xpath = "(//*[text()='Group'])[1]")
	private WebElement groupDropdown;

	// XPath for search current users
	@FindBy(xpath = "//*[@id='searchcurrentusers']")
	private WebElement searchCurrentUsers;

	// XPath for remove users
	@FindBy(xpath = "//*[@id='removeusers']")
	private WebElement removeUsers;

	// XPath for study site current
	@FindBy(xpath = "(//*[text()='Study/Site'])[3]")
	private WebElement studySitecurrent;

	// XPath for group current
	@FindBy(xpath = "(//*[text()='Group'])[3]")
	private WebElement Groupcurrent;

	// XPath for check box all user current
	@FindBy(xpath = "//*[@id='cbxall_user']")
	private WebElement cbxall_Usercurrent;

	// XPath for check box all user current
	@FindBy(xpath = "//*[@name='cbxitem_user']")
	private WebElement currentCbxitemUser;

	// XPath for check box all potential users
	@FindBy(xpath = "//*[@id='cbxall']")
	private WebElement cbxallpotentialusers;

	// XPath for add potential users
	@FindBy(xpath = "//*[@id='addpotentialusers']")
	private WebElement addpotentialusers;

	// XPath for evidence documents
	@FindBy(xpath = "//*[@name='evidencedocs']/parent::div[@id='etupload_block']")
	private WebElement evidenceDocs;

	// XPath for user check
	@FindBy(xpath = "//*[text()='Users ']")
	private WebElement userCh;

	// XPath for add record final
	@FindBy(xpath = "//*[text()='Add Record']")
	private WebElement addRecordFinal;
	
	// XPath for close "x"
	@FindBy(xpath = "//*[text()='clcCloseButton']")
	private WebElement closeButtonX;
	
	public WebElement getCloseButtonX() {
		return closeButtonX;
	}

	public WebElement getAddNewRecord() {
		return addNewRecord;
	}

	public WebElement getEnterExternalTrainingName() {
		return enterExternalTrainingName;
	}

	public WebElement getEnterSchoolCompanyName() {
		return enterSchoolCompanyName;
	}

	public WebElement getEnterCredits() {
		return enterCredits;
	}

	public WebElement getTrainingArea() {
		return trainingArea;
	}

	public WebElement getTrainingScheduleDropdown() {
		return trainingScheduleDropdown;
	}

	public WebElement getMixedOption() {
		return mixedOption;
	}

	public WebElement getWorkHoursOption() {
		return workHoursOption;
	}

	public WebElement getAfterworkhoursOption() {
		return afterworkhoursOption;
	}

	public WebElement getTypeoftrainingentity() {
		return typeoftrainingentity;
	}

	public WebElement getTrainingCourSecode() {
		return trainingCourSecode;
	}

	public WebElement getDays() {
		return days;
	}

	public WebElement getHours() {
		return hours;
	}

	public WebElement getMinutes() {
		return Minutes;
	}

	public WebElement getSeconds() {
		return Seconds;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getPreviousButton() {
		return previousButton;
	}

	public WebElement getSearchpotentialusers() {
		return searchpotentialusers;
	}

	public WebElement getPotentialusersItem() {
		return potentialusersItem;
	}

	public WebElement getContactTypeDropdown() {
		return contactTypeDropdown;
	}

	public WebElement getStudySiteDropdown() {
		return studySiteDropdown;
	}

	public WebElement getGroupDropdown() {
		return groupDropdown;
	}

	public WebElement getSearchCurrentUsers() {
		return searchCurrentUsers;
	}

	public WebElement getCurrentCbxitemUser() {
		return currentCbxitemUser;
	}

	public WebElement getRemoveUsers() {
		return removeUsers;
	}

	public WebElement getStudySitecurrent() {
		return studySitecurrent;
	}

	public WebElement getGroupcurrent() {
		return Groupcurrent;
	}

	public WebElement getCbxall_Usercurrent() {
		return cbxall_Usercurrent;
	}

	public WebElement getCbxallpotentialusers() {
		return cbxallpotentialusers;
	}

	public WebElement getAddpotentialusers() {
		return addpotentialusers;
	}

	public WebElement getEvidenceDocs() {
		return evidenceDocs;
	}

	public WebElement getUserCh() {
		return userCh;
	}

	public WebElement getAddRecordFinal() {
		return addRecordFinal;
	}

}
