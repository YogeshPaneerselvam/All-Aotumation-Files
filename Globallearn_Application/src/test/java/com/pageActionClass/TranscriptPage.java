package com.pageActionClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gL.HelperClass;

public class TranscriptPage extends HelperClass {

	public TranscriptPage() {

		PageFactory.initElements(driver, this);

	}

	// xpath for transcript
	@FindBy(xpath = "//*[text()='Transcript']")
	private WebElement transcript;

	// xpath for  my transcript
	@FindBy(xpath = "//*[text()='My Transcript']")
	private WebElement myTranscript;

	// xpath for  my direct reports
	@FindBy(xpath = "//*[text()='My Direct Reports']")
	private WebElement myDirectReports;

	// xpath for external training
	@FindBy(xpath = "(//*[text()='External Training'])")
	private WebElement externalTraining;

	// xpath for  add new record button
	@FindBy(xpath = "//*[text()=' Add New Record']")
	private WebElement addNewRecord;

	// xpath for  delete button
	@FindBy(xpath = "//*[text()=' Delete']")
	private WebElement delete;

	// xpath for edit button
	@FindBy(xpath = "//*[text()=' Edit']")
	private WebElement edit;

	// xpath for  export button
	@FindBy(xpath = "//*[text()=' Export']")
	private WebElement export;

	// xpath for user drop down
	@FindBy(xpath = "//*[text()='User']")
	private WebElement userDropdown;

	// xpath for  course name drop down
	@FindBy(xpath = "//*[text()='Course Name']")
	private WebElement courseNameDropdown;

	// xpath for status drop down
	@FindBy(xpath = "(//*[text()='Status'])[1]")
	private WebElement statusDropdown;

	// xpath for evidence drop down
	@FindBy(xpath = "(//*[text()='Evidence'])[1]")
	private WebElement evidenceDropdown;

	// xpath for evidence status drop down
	@FindBy(xpath = "(//*[text()='Evidence Status'])[1]")
	private WebElement evidenceStatusDropdown;

	// xpath for search external training
	@FindBy(xpath = "//*[@id='searchexternaltraining']")
	private WebElement searchExternalTraining;

	// xpath for filters
	@FindBy(xpath = "//*[text()=' Filters ']")
	private WebElement filters;

	// xpath for ceckbox current
	@FindBy(xpath = "//*[@id='cbxall_current']")
	private WebElement cbxall_current;

	public WebElement getTranscript() {
		return transcript;
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

	public WebElement getAddNewRecord() {
		return addNewRecord;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getExport() {
		return export;
	}

	public WebElement getUserDropdown() {
		return userDropdown;
	}

	public WebElement getCourseNameDropdown() {
		return courseNameDropdown;
	}

	public WebElement getStatusDropdown() {
		return statusDropdown;
	}

	public WebElement getEvidenceDropdown() {
		return evidenceDropdown;
	}

	public WebElement getEvidenceStatusDropdown() {
		return evidenceStatusDropdown;
	}

	public WebElement getSearchExternalTraining() {
		return searchExternalTraining;
	}

	public WebElement getFilters() {
		return filters;
	}

	public WebElement getCbxall_current() {
		return cbxall_current;
	}

}
