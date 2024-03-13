package com.testExecution;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.gL.HelperClass;
import com.pageActionClass.GL_Login_Page;
import com.pageActionClass.ScreenRecordingClass;
import com.pageActionClass.TranscriptAddNewRecordPage;
import com.pageActionClass.TranscriptPage;

public class RunnerClass extends HelperClass {

	@Test
	private void testGL() throws Exception {

		// launching Global Learn on the browser
		browserLaunch("https://lms-stg-globallearn2.trialinteractive.com/");

		// start screen recording
		ScreenRecordingClass.startRecord("browserLaunch");
		
		// maximized the browser window
		maximize();

		// the Implicit Wait function will be applicable as long as the current browser
		// is open
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// login page object
		GL_Login_Page lP = new GL_Login_Page();

		// entering email id
		inputText(lP.getUserName(), "caintz@ti.com");

		// clicking sign button
		buttonClick(lP.getNext());

		// entering passwoed
		inputText(lP.getpW(), "Pass@123");

		// clicking login button
		buttonClick(lP.getLogin());

		Thread.sleep(5000);

		//transcript page object
		TranscriptPage tS = new TranscriptPage();

		// scroll down transcript
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", tS.getTranscript());

		// clicking transcript
		buttonClick(tS.getTranscript());

		// scroll down external training
		js.executeScript("arguments[0].scrollIntoView();", tS.getExternalTraining());

		// clicking external training
		buttonClick(tS.getExternalTraining());

		// clicking Add new record
		buttonClick(tS.getAddNewRecord());

		// OBJECT Transcript Add New RecordPage
		TranscriptAddNewRecordPage tARP = new TranscriptAddNewRecordPage();

		// Enter External Training Name
		inputText(tARP.getEnterExternalTrainingName(), "TestObject");

		// Enter School Company Name
		inputText(tARP.getEnterSchoolCompanyName(), "Testconpany");

		// Enter credits
		inputText(tARP.getEnterCredits(), "Test123");

		// Enter Training Area
		inputText(tARP.getTrainingArea(), "local conpany");

		// clicking Training Schedule Dropdown
		buttonClick(tARP.getTrainingScheduleDropdown());

		// clicking Mixed Option
		buttonClick(tARP.getMixedOption());

		// Enter Type of training entity
		inputText(tARP.getTypeoftrainingentity(), "new training");

		// Enter Training Course code
		inputText(tARP.getTrainingCourSecode(), "123");

		// Enter days
		inputText(tARP.getDays(), "15");

		// Enter hours
		inputText(tARP.getHours(), "1");

		// Enter minutes
		inputText(tARP.getMinutes(), "15");

		// Enter seconds
		inputText(tARP.getSeconds(), "15");

		// clicking next button
		buttonClick(tARP.getNextButton());

		// Enter Search potential users
		inputText(tARP.getSearchpotentialusers(), "test50");

		Thread.sleep(2000);

		// clicking Potential users Item
		buttonClick(tARP.getPotentialusersItem());

		// clicking Potential users Item
		buttonClick(tARP.getAddpotentialusers());

		// clickingCurrent Check box item User
		buttonClick(tARP.getCurrentCbxitemUser());

		// clicking next button
		buttonClick(tARP.getNextButton());

		Thread.sleep(2000);

		// clicking Evidence Docs
		buttonClick(tARP.getEvidenceDocs());

		Thread.sleep(4000);

		//robot class object
		Robot robotTARP = new Robot();

		// robot class delay
		robotTARP.delay(2000);

		// given the system location path for the documents
		StringSelection selectpath = new StringSelection("C:\\Users\\yogesh.paneerselvam\\Downloads\\New folder\\sample_1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selectpath, null);

		// robot Function Keys on Keyboard action
		robotTARP.keyPress(KeyEvent.VK_CONTROL);
		robotTARP.keyPress(KeyEvent.VK_V);

		// robot Function Keys on Keyboard action
		robotTARP.keyRelease(KeyEvent.VK_CONTROL);
		robotTARP.keyRelease(KeyEvent.VK_V);

		// robot Function Keys on Keyboard action
		robotTARP.keyPress(KeyEvent.VK_ENTER);
		robotTARP.keyRelease(KeyEvent.VK_ENTER);

		//robot class delay
		robotTARP.delay(2000);
		
		Thread.sleep(3000);

		// clicking next button
		buttonClick(tARP.getNextButton());

		Thread.sleep(3000);

		// clicking next button
		buttonClick(tARP.getNextButton());

		Thread.sleep(3000);

		// scroll down external training
		js.executeScript("arguments[0].scrollIntoView();", tARP.getUserCh());

		Thread.sleep(3000);

		// clicking next button
		buttonClick(tARP.getAddRecordFinal());
		
		//stop screen record
		ScreenRecordingClass.stopRecord();

	}
}
