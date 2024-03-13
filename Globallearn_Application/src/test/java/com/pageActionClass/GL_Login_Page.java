package com.pageActionClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gL.HelperClass;

public class GL_Login_Page extends HelperClass {

	public GL_Login_Page() {

		PageFactory.initElements(driver, this);

	}

	// id for user name 
	@FindBy(id = "pre-username")
	private WebElement userName;

	// id for  next button
	@FindBy(id = "proceed-username-button")
	private WebElement next;

	// id for password
	@FindBy(name = "passwordEntry")
	private WebElement pW;

	// id for login button
	@FindBy(id = "login-button")
	private WebElement login;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getpW() {
		return pW;
	}

	public WebElement getLogin() {
		return login;
	}

}
