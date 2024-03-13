package com.test;

import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.monte.media.Format;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.base.BaseClass;


public class TestReport{
  
	// created reference variable for WebDriver
	WebDriver driver;

	@Test // TestNG framework
	private void test() throws Exception {

		// Instantiate a ChromeDriver class.
		driver = new ChromeDriver();

		// start screen recording
		BaseClass.startRecord("driver");

		// Maximize the browser
		driver.manage().window().maximize();

		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

		// launching Trial interactive on the browser
		driver.get("https://lms-stg-globallearn2.trialinteractive.com/");
		System.out.println("URL + LMS stage Global Learn");

		// entering username
		driver.findElement(By.id("pre-username")).sendKeys("caintz@ti.com");

		// clicking signin button
		driver.findElement(By.id("proceed-username-button")).click();

		// entering password
		driver.findElement(By.name("passwordEntry")).sendKeys("Pass@123");

		// clicking login button
		driver.findElement(By.id("login-button")).click();

		Thread.sleep(5000);

		// scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//*[text()='Company Dashboard']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);

		Thread.sleep(2000);

		// clicking the company dashboard
		driver.findElement(By.xpath("//*[text()='Company Dashboard']")).click();
		System.out.println(" company dashboard ");

		// clicking theCreate User
		driver.findElement(By.xpath("//*[text()='Create User']")).click();
		System.out.println(" Create User ");

		// clicking the choose
		driver.findElement(By.xpath("//*[@id='id_managertype']")).click();

		Thread.sleep(2000);

		// roll selecting learner
		driver.findElement(By.xpath("//*[text()='Learner']")).click();
		System.out.println(" Learner ");

		// Generate password and notify user to disable
		driver.findElement(By.xpath("//*[@id='id_createpassword']")).click();

		Thread.sleep(3000);

		// set to new password
		WebElement pW = driver.findElement(By.xpath("//*[@id='id_newpassword']"));
		driver.findElement(By.xpath("//*[@class='icon fa fa-pencil fa-fw ']")).click();
		pW.clear();
		pW.sendKeys("Pass@1234");

		Thread.sleep(2000);

		// Force Password Change disable
		driver.findElement(By.xpath("//*[@id='id_preference_auth_forcepasswordchange']")).click();

		// Entering firstname
		WebElement fName = driver.findElement(By.xpath("//*[@id='id_firstname']"));
		fName.clear();
		fName.sendKeys("yogesh");

		Thread.sleep(2000);

		// Entering Lastname
		WebElement lName = driver.findElement(By.xpath("//*[@id='id_lastname']"));
		lName.clear();
		lName.sendKeys("yogi");

		Thread.sleep(2000);

		// Entering Email
		WebElement email = driver.findElement(By.xpath("//*[@id='id_email']"));
		email.clear();
		email.sendKeys("testuser015@gmail.com");

		Thread.sleep(2000);

//				// clicking create user button
//				driver.findElement(By.xpath("//*[@id='id_submitbutton']")).click();

		// clicking cancel button
		driver.findElement(By.xpath("//*[@id='id_cancel']")).click();

		// Closing browser
		driver.quit();

		// stop recording
		BaseClass.stopRecord();
	}

}
