package com.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	// created reference variable for WebDriver.
	public static WebDriver driver;

	public static void browserLaunch(String url) {

		// initializing driver variable using EdgeDriver.
		WebDriverManager.edgedriver().setup();

		// created method for Browser..
		driver = new EdgeDriver();

		driver.get(url);

	}

	// created method for the Title.
	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// created method for the URL.
	public static void url() {
		String urls = driver.getCurrentUrl();
		System.out.println(urls);
	}

	// created method for maximized.
	public static void maximize() {
		driver.manage().window().maximize();
	}

	// created method for minimize
	public static void minimize() {
		driver.manage().window().minimize();
	}

	// created method for dropDownMethod.
	public static void dropDownMethod(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	// created method for dropDownText.
	public static void dropDownText(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	// created method for button Click.
	public static void butClick(WebElement element) {
		element.click();
	}

	// created method for sendkeys values.
	public static void inputText(WebElement element, String text) {
		element.sendKeys(text);
	}

	// created method for Output Text.
	public static void outputText(WebElement element) {
		System.out.println(element.getText());
	}

	// created method for screen shot.
	public static void screenShot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/" + filename + ".jpng");
		FileUtils.copyFile(source, dest);
	}

	// created method for web driver wait.
	public static void waitUntilElementVisible(WebDriver driver, WebElement webElement) {
		 
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(webElement));
 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		}

	// created method for close browser.
	public static void closeBrowser() {
		driver.close();
	}

	// created method for Quit the driver.
	public static void quitBrowser() {
		driver.quit();
	}

}
