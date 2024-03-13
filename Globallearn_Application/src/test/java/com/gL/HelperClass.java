package com.gL;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {

	// Created reference variable for WebDriver.
	public static WebDriver driver;

	public static void browserLaunch(String url) {

		// Initializing driver variable using EdgeDriver.
		WebDriverManager.edgedriver().setup();

		// Browser
		driver = new EdgeDriver();

		// Browser URL
		driver.get(url);

	}

	// Created method for the Title
	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// created method for the URL
	public static void url() {
		String urls = driver.getCurrentUrl();
		System.out.println(urls);
	}

	// created method for the maximized
	public static void maximize() {
		driver.manage().window().maximize();
	}

	// created method for the minimize
	public static void minimize() {
		driver.manage().window().minimize();
	}

	// created method for the dropDownMethod
	public static void dropDownMethod(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	// Created method for the dropDownText.
	public static void dropDownText(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	// created method for the button Click
	public static void buttonClick(WebElement element) {
		element.click();
	}

	// created method for sendkeys values
	public static void inputText(WebElement element, String text) {
		element.sendKeys(text);
	}

	// created method for Output Text
	public static void outputText(WebElement element) {
		System.out.println(element.getText());
	}

	// created method for the screenshot
	public static void screenShot(String filename) throws IOException {
		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
		File source = takeScreenshot .getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/" + filename + ".jpng");
		FileUtils.copyFile(source, dest);
	}

	// close the session
	public static void closeBrowser() {
		driver.close();
	}

	// Quit the driver
	public static void quitBrowser() {
		driver.quit();
	}

}
