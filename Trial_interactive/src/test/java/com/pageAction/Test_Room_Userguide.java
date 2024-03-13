package com.pageAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Test_Room_Userguide extends BaseClass {

	public Test_Room_Userguide() {

		PageFactory.initElements(driver, this);
	}

	 // xpath for click Test Room
	@FindBy(xpath = "//a[@class='room-name']")
	private WebElement testRoom;
	
	// xpath for click user name 
	@FindBy(xpath = "//*[contains(@class,'qa-username')]") 
	private WebElement clickUserName;

	//xpath for click userguider
	@FindBy(xpath = "//*[contains(@class,'k-button-icon fa fa-book ')]")
	private WebElement userGuide;

	public WebElement getTestRoom() {
		return testRoom;
	}

	public WebElement getClickUserName() {
		return clickUserName;
	}

	public WebElement getUserGuide() {
		return userGuide;
	}

}
