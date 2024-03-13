package com.pageAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// id for username
	@FindBy(id = "pre-username") 
	private WebElement userName;

	// id for sign button
	@FindBy(id = "proceed-username-button") 
	private WebElement next;

	// id for user login
	@FindBy(id = "SubmitLogin") 
	private WebElement contine;

	// xpath for password
	@FindBy(xpath = "//input[@type='password']") 
	private WebElement password;

	 // xpath for sigin button
	@FindBy(xpath = "//button[@type='button']")
	private WebElement signIN;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getContine() {
		return contine;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignIN() {
		return signIN;
	}

}
