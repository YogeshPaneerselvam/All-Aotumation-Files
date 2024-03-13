package com.pageAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Feature_Access_level extends BaseClass {

	public Feature_Access_level() {

		PageFactory.initElements(driver, this);
	}

	// xpath for click Test Room
	@FindBy(xpath = "//a[@class='room-name']") 
	private WebElement testRoom;

	// xpath for click production
	@FindBy(xpath = "//button[@id='mainMenuContextsButton']") 
	private WebElement production;

	// xpath for click usermagament
	@FindBy(xpath = "//span[@class='fa fa-users']") 
	private WebElement usermagament;

	// xpath for click invite
	@FindBy(xpath = "//*[contains(@class,'vertical k-button k-button-md ')]") 
	private WebElement invite;

	// xpath for click regular
	@FindBy(xpath = "//span[text()='Regular']") 
	private WebElement regular;

	// xpath for email
	@FindBy(xpath = "//input[@id='email']") 
	private WebElement email;

	 // xpath for first name
	@FindBy(id = "first")					
	private WebElement firstName;

	// xpath for click last name
	@FindBy(id = "last") 
	private WebElement lastName;

	// xpath for click role
	@FindBy(xpath = "(//kendo-icon[@class='k-i-caret-alt-down k-icon ng-star-inserted'])[2]") 
	private WebElement role;

	// xpath for click editor
	@FindBy(xpath = "//*[text()='Editor']") 
	private WebElement editor;

	// xpath for click organization
	@FindBy(xpath = "(//kendo-icon[@class='k-i-caret-alt-down k-icon ng-star-inserted'])[3]") 
	private WebElement organization;

	// xpath for click gmail
	@FindBy(xpath = "(//*[text()='gmail.com'])[2]") 
	private WebElement gmail;

	// xpath for click save 
	@FindBy(xpath = "//*[text()='Save']") 
	private WebElement save;

	public WebElement getTestRoom() {
		return testRoom;
	}

	public WebElement getProduction() {
		return production;
	}

	public WebElement getUsermagament() {
		return usermagament;
	}

	public WebElement getInvite() {
		return invite;
	}

	public WebElement getRegular() {
		return regular;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getRole() {
		return role;
	}

	public WebElement getEditor() {
		return editor;
	}

	public WebElement getOrganization() {
		return organization;
	}

	public WebElement getGmail() {
		return gmail;
	}

	public WebElement getSave() {
		return save;
	}
}
