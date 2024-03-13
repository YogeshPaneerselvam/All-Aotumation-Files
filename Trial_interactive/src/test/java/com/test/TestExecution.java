package com.test;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageAction.Feature_Access_level;
import com.pageAction.Feature_Light_Dark_Mode;
import com.pageAction.Feature_Production;
import com.pageAction.LoginPage;
import com.pageAction.Test_Room_Userguide;

public class TestExecution extends BaseClass {

//	@Test
//	private void test() throws IOException, InterruptedException {
//
//		// feature for Test Room User guide Automated
//		browserLaunch("https://secure.trialinteractive.com/");// launching Trial Interactive on the browser
//
//		maximize();// maximized the browser window
//
//		// the Implicit Wait function will be applicable as long as the current browser
//		// is open
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//
//		// user Login Page object
//		LoginPage lp = new LoginPage();
//
//		inputText(lp.getUserName(), "yogeshjuly1997@gmail.com");// entering username
//
//		butClick(lp.getNext());// clicking signin button
//
//		inputText(lp.getPassword(), "S!m0n@1997");// entering password
//
//		butClick(lp.getSignIN());// clicking signin button
//
//		Test_Room_Userguide tR = new Test_Room_Userguide();// object
//
//		butClick(tR.getTestRoom());// clicking Test Room button
//		System.out.println("Test Room");
//
//		waitUntilElementVisible(driver, tR.getTestRoom());// wait
//
//		butClick(tR.getClickUserName());// clicking signin button
//		System.out.println("Clicking User Name");
//
//		Feature_Light_Dark_Mode dL = new Feature_Light_Dark_Mode();// object
//
//		butClick(dL.getDrakLight());// clicking dark mode
//		System.out.println("Dark Mode");
//		
//		butClick(dL.getDrakLight());// clicking light mode
//		System.out.println("Light Mode");
//
//		waitUntilElementVisible(driver, dL.getDrakLight());
//
//		butClick(tR.getUserGuide());// clicking user guide button
//		System.out.println("Clicking User Guide");
//
//		closeBrowser();// close the session browser windows opened by web driver
//
//		Thread.sleep(2000);// delay
//
//		quitBrowser();// closes all the browser windows opened by web driver
//
//		Thread.sleep(5000);// delay
//	}

	// -------------------------------------------End------------------------------------------//

//	@Test
//	private void test1() throws InterruptedException {
//		// Feature for the Access level automated
//		browserLaunch("https://secure.trialinteractive.com/");// launching Trial Interactive on the browser
//
//		maximize();// maximized the browser window
//
//		LoginPage lp1 = new LoginPage();// user Login Page object
//
//		waitUntilElementVisible(driver, lp1.getUserName());// wait
//
//		inputText(lp1.getUserName(), "yogeshjuly1997@gmail.com");// entering username
//
//		butClick(lp1.getNext());// clicking signin button
//
//		waitUntilElementVisible(driver, lp1.getPassword());// wait
//
//		inputText(lp1.getPassword(), "S!m0n@1997");// entering password
//
//		waitUntilElementVisible(driver, lp1.getSignIN());// wait
//
//		butClick(lp1.getSignIN());// clicking signin button
//
//		Feature_Access_level aL = new Feature_Access_level();// object
//
//		waitUntilElementVisible(driver, aL.getTestRoom());// wait
//
//		butClick(aL.getTestRoom());// clicking Test Room button
//		System.out.println("Clicking Test Room");
//
//		Thread.sleep(5000);// delay
//		waitUntilElementVisible(driver, aL.getProduction());// wait
//
//		butClick(aL.getProduction());// clicking production button
//		System.out.println("Clicking Production");
//
//		waitUntilElementVisible(driver, aL.getUsermagament());// wait
//
//		butClick(aL.getUsermagament());// clicking usermagament button
//		System.out.println("Clicking User Magament");
//
//		Thread.sleep(5000);// delay
//
//		butClick(aL.getInvite());// clicking invite button
//		System.out.println("Clicking Invite");
//
//		butClick(aL.getRegular());// clicking invite button
//		System.out.println(" select Regular");
//
//		Thread.sleep(2000);// delay
//
//		inputText(aL.getEmail(), "yogesh3@gmail.com");// entering invite new email
//		System.out.println("Entering User Email");
//
//		// Thread.sleep(5000);// delay
//
//		butClick(aL.getFirstName());// entering first name
//
//		Thread.sleep(2000);// delay
//
//		inputText(aL.getFirstName(), "yogesh");// entering first name
//		System.out.println("Enteing First Name");
//
//		butClick(aL.getLastName());// entering first name
//
//		Thread.sleep(2000);// delay
//
//		inputText(aL.getLastName(), "p");// entering last name
//		System.out.println("Entering Last Name");
//
//		butClick(aL.getRole());// clicking role button
//		System.out.println("Clicking Role");
//
//		butClick(aL.getEditor());// select the editor
//		System.out.println("Select Editor");
//
//		butClick(aL.getOrganization());// clicking organization
//
//		butClick(aL.getGmail());// select the gmail
//		System.out.println("Select Gmail");
//
//		butClick(aL.getSave());// clicking to save
//		System.out.println("save");
//
//		Thread.sleep(8000);// delay
//
//		Thread.sleep(3000);// delay
//		Feature_Production pr = new Feature_Production();// object
//
//		butClick(pr.getHome());// clicking home
//
//		System.out.println("Clicking Home");
//
//		Thread.sleep(4000);// delay
//
//		butClick(pr.getUserP());// clicking user profile
//
//		System.out.println("Clicking User Profile");
//
//		Thread.sleep(3000);// delay
//
//		butClick(pr.getSignOut());// clicking sign out
//		System.out.println("sign Out");
//
//		quitBrowser();// closes all the browser windows opened by web driver
//
//		Thread.sleep(5000);// delay
//
//	}
	

		// -------------------------------------------End------------------------------------------//

	@Test
	private void test2() throws InterruptedException {
		browserLaunch("https://secure.trialinteractive.com/");// launching Trial Interactive on the browser

		maximize();// maximized the browser window

		LoginPage lp2 = new LoginPage();// user Login Page object

		Thread.sleep(1000);

		inputText(lp2.getUserName(), "yogeshjuly1997@gmail.com");// entering username

		butClick(lp2.getNext());// clicking signin button

		Thread.sleep(1000);

		inputText(lp2.getPassword(), "S!m0n@1997");// entering password

		butClick(lp2.getSignIN());// clicking signin button

		Thread.sleep(8000);// delay

		Feature_Access_level aL2 = new Feature_Access_level();// object

		Thread.sleep(8000);// delay

		butClick(aL2.getTestRoom());// clicking Test Room button

		System.out.println("Clicking Test Room");

		Thread.sleep(8000);// delay

		butClick(aL2.getProduction());// clicking production button

		Thread.sleep(3000);// delay

		Feature_Production pr1 = new Feature_Production();// object

		butClick(pr1.geteTMF());// clicking eTMF

		System.out.println("Clicking eTMF");

		Thread.sleep(3000);// delay

		butClick(aL2.getProduction());// clicking production button

		Thread.sleep(3000);// delay

		butClick(pr1.getCommunication());// clicking communication

		System.out.println("Clicking communication");

		Thread.sleep(3000);// delay

		butClick(aL2.getProduction());// clicking production button

		butClick(pr1.getCRAReconciliation());// clicking CRA Reconciliation
		
		Thread.sleep(3000);// delay

		System.out.println("Clicking CRA Reconciliation");

		Thread.sleep(3000);// delay

		butClick(pr1.getWarning());// clicking warning Ok

		System.out.println("Notification Warning ok");

		Thread.sleep(2000);// delay

		butClick(aL2.getProduction());// clicking production button

		butClick(pr1.getQualityReview());// clicking Qulity Review

		System.out.println("Clicking Quality Review");

		Thread.sleep(3000);// delay

		butClick(aL2.getProduction());// clicking production button

		butClick(pr1.getTasks());// clicking Task

		System.out.println("Clicking Task");

		Thread.sleep(3000);// delay

		butClick(aL2.getProduction());// clicking production button

		butClick(pr1.getReports());// clicking Report

		System.out.println("Clicking Report");

		Thread.sleep(3000);// delay

		butClick(aL2.getProduction());// clicking production button

		butClick(pr1.getUsersManagement());// clicking user management

		System.out.println("Clicking User Management");

		Thread.sleep(3000);// delay

		butClick(aL2.getProduction());// clicking production button

		Thread.sleep(3000);// delay

		butClick(pr1.getqA());// clicking Q & A

		System.out.println("Clicking Q & A");

		Thread.sleep(3000);// delay

		butClick(aL2.getProduction());// clicking production button

		butClick(pr1.getFaq());// clicking queries

		System.out.println("Clicking FAQ");

		butClick(aL2.getProduction());// clicking production button

		butClick(pr1.getQueries());// clicking queries

		System.out.println("Clicking Queries");

		Thread.sleep(3000);// delay

		butClick(aL2.getProduction());// clicking production button

		butClick(pr1.getEventManager());// clicking Eventmanager

		System.out.println("Clicking Event Manager");

		Thread.sleep(3000);// delay

		butClick(aL2.getProduction());// clicking production button

		butClick(pr1.getSetting());// clicking setting

		System.out.println("Clicking Setting");

		Thread.sleep(3000);// delay

		butClick(aL2.getProduction());// clicking production button

		butClick(pr1.getHome());// clicking home

		System.out.println("Clicking Home");

		Thread.sleep(3000);// delay

		butClick(pr1.getUserP());// clicking user profile

		System.out.println("Clicking User Profile");

		Thread.sleep(3000);// delay

		butClick(pr1.getSignOut());// clicking sign out
		System.out.println("sign Out");

		quitBrowser();// closes all the browser windows opened by web driver

	}

}
