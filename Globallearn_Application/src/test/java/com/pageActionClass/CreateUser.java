package com.pageActionClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gL.HelperClass;

public class CreateUser extends HelperClass {

	public CreateUser() {

		PageFactory.initElements(driver, this);

	}

	// id for role option selecting 
	@FindBy(xpath = "//*[@id='id_managertype']")
	private WebElement Role;

	// id for role option " general"selecting 
	@FindBy(xpath = "//*[text()='General']")
	private WebElement general;

	// id for role option"learner" selecting 
	@FindBy(xpath = "//*[text()='Learner']")
	private WebElement learner;

	// id for role option" instructor" selecting 
	@FindBy(xpath = "//*[text()='Instructor']")
	private WebElement instructor;

}
