package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UploadingDocuments {

	// created reference variable for WebDriver
	WebDriver driver;

	@Test // TestNG framework
	private void test() throws InterruptedException, AWTException {

		// Instantiate a ChromeDriver class.
		driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

		// launching Trial interactive on the browser
		driver.get("https://secure.trialinteractive.com/");

		// entering username
		driver.findElement(By.id("pre-username")).sendKeys("yogeshjuly1997@gmail.com");

		// clicking signin button
		driver.findElement(By.id("proceed-username-button")).click();

		// entering password
		driver.findElement(By.name("passwordEntry")).sendKeys(" R!m0n@1997");

		// clicking login button
		driver.findElement(By.id("login-button")).click();

		// WebDriverWait
		WebElement elementVisible = driver.findElement(By.xpath("//*[text()='July Patch']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(elementVisible));

		// Test room
		driver.findElement(By.xpath("//*[text()='July Patch']")).click();

		Thread.sleep(8000);

		// clicking the icon
		driver.findElement(By.xpath("//*[@class='k-button-icon fa fa-th icon-size ng-star-inserted']")).click();

		Thread.sleep(6000);

		// clicking eTMF
		driver.findElement(By.xpath("//*[@title='eTMF']")).click();

		Thread.sleep(7000);

		// --------------type-1--------------

		System.out.println("Type -1 Add");
		
		// clicking add
		driver.findElement(By.xpath("(//*[@class='k-button-text'])[4]")).click();

		Thread.sleep(5000);

		// clicking documents
		driver.findElement(By.xpath("(//*[text()='Documents'])[3]")).click();

		Thread.sleep(5000);

		// clicking documents button-icon arrow-circle-o-up ng-star-inserted
		driver.findElement(By.xpath("//*[@class='k-button-icon fa fa-arrow-circle-o-up ng-star-inserted']")).click();

		Thread.sleep(5000);// delay

		// using robot class
		Robot rob = new Robot();

		rob.delay(2000);

		// given the system path
		StringSelection s = new StringSelection("C:\\Users\\yogesh.paneerselvam\\Downloads\\New folder\\sample_1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

		// Function Keys on Keyboard
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);

		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		rob.delay(2000);// delay

		driver.findElement(By.xpath("(//*[@class='k-checkbox-label'])[1]")).click();// checkfille

		// Documents Metadata
		// driver.findElement(By.xpath("//*[@class='k-checkbox-label
		// checkbox-pos']")).click();

		Thread.sleep(3000);

		// Import and Apply Metadata
		driver.findElement(By.xpath("//*[text()='Import and Apply Metadata']")).click();

		// import button
		// driver.findElement(By.xpath("//*[text()='Import']")).click();

		Thread.sleep(2000);

		// clicking yes button
		 driver.findElement(By.xpath("//*[text()='Yes']")).click();

		// clicking no button
		//driver.findElement(By.xpath("//*[text()='No']")).click();

		Thread.sleep(2000);

		// clicking cancel button
		//driver.findElement(By.xpath("//*[text()='Cancel']")).click();

		Thread.sleep(4000);

		// --------------type-2--------------

		System.out.println("Type -2 upload");
		
		// web driver wait
		WebElement elementVisible1 = driver.findElement(By.xpath("//*[text()='July Patch']"));
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait1.until(ExpectedConditions.visibilityOf(elementVisible1));

		// clicking upload button
		driver.findElement(By.xpath("//*[text()='Upload']")).click();

		Thread.sleep(2000);

		// clicking icon upload button
		driver.findElement(By.xpath("//*[@class='k-button-icon fa fa-cloud-upload ng-star-inserted']")).click();

		Thread.sleep(2000);

		// clicking browse button
		driver.findElement(By.xpath("//*[text()='Browse']")).click();

		Thread.sleep(5000);

		// using robot class
		Robot rob1 = new Robot();

		rob1.delay(2000);

		// given the system path
		StringSelection s1 = new StringSelection("C:\\Users\\yogesh.paneerselvam\\Downloads\\New folder\\sample_2.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);

		// Function Keys on Keyboard
		rob1.keyPress(KeyEvent.VK_CONTROL);
		rob1.keyPress(KeyEvent.VK_V);

		rob1.keyRelease(KeyEvent.VK_CONTROL);
		rob1.keyRelease(KeyEvent.VK_V);

		rob1.keyPress(KeyEvent.VK_ENTER);
		rob1.keyRelease(KeyEvent.VK_ENTER);

		rob1.delay(2000);

		// checkfille
		driver.findElement(By.xpath("(//*[@class='k-checkbox-label'])[1]")).click();

		// Documents Metadata
		// driver.findElement(By.xpath("//*[@class='k-checkbox-label
		// checkbox-pos']")).click();

		// Thread.sleep(3000);

		// driver.findElement(By.xpath("//*[text()='Import']")).click();// import

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[text()='Cancel']")).click();

		// --------------types-3--------------
		
		System.out.println("Type -3 add document");

		WebElement elementVisible2 = driver.findElement(By.xpath("//*[text()='July Patch']"));
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait2.until(ExpectedConditions.visibilityOf(elementVisible2));

		// clicking sidebar
		driver.findElement(By.xpath("(//*[@class='sidebar-menu__item'])[1]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//*[@class='fa fa-caret-down icon icon2 ng-star-inserted'])[2]")).click();

		Thread.sleep(3000);

		// clicking add document
		driver.findElement(By.xpath("//*[text()='Add Document']")).click();

		// clicking browse button
		driver.findElement(By.xpath("//*[text()='Browse']")).click();

		Thread.sleep(5000);

		// using robot class
		Robot rob3 = new Robot();

		rob3.delay(2000);

		// given the system path
		StringSelection s3 = new StringSelection("C:\\Users\\yogesh.paneerselvam\\Downloads\\New folder\\sample_3.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s3, null);

		// Function Keys on Keyboard
		rob3.keyPress(KeyEvent.VK_CONTROL);
		rob3.keyPress(KeyEvent.VK_V);

		rob3.keyRelease(KeyEvent.VK_CONTROL);
		rob3.keyRelease(KeyEvent.VK_V);

		rob3.keyPress(KeyEvent.VK_ENTER);
		rob3.keyRelease(KeyEvent.VK_ENTER);

		rob3.delay(2000);

		driver.findElement(By.xpath("(//*[@class='k-i-caret-alt-down k-icon ng-star-inserted'])[2]")).click();

		Thread.sleep(5000);

		// selecting categories
		driver.findElement(By.xpath("//*[text()='Yogi_Categories']")).click();

		Thread.sleep(3000);

		// clicking no button
		driver.findElement(By.xpath("//*[text()='No']")).click();

		Thread.sleep(2000);

		// clicking finish button
		// driver.findElement(By.xpath("//*[text()='Finish']")).click();

		// clicking cancel button
		driver.findElement(By.xpath("//*[text()='Cancel']")).click();

		Thread.sleep(5000);

		// --------------types-4--------------
		
		System.out.println("Type -4 import");

		// clicking down icon
		driver.findElement(By.xpath("(//*[@class='fa fa-caret-down icon icon2 ng-star-inserted'])[3]")).click();

		Thread.sleep(3000);

		// clicking upload
		driver.findElement(By.xpath("(//*[@class='menu-label ng-star-inserted'])[11]")).click();

		// clicking documents
		driver.findElement(By.xpath("//*[@class='k-button-icon fa fa-arrow-circle-o-up ng-star-inserted']")).click();

		Thread.sleep(5000);

		// using robot class
		Robot rob4 = new Robot();

		rob4.delay(2000);

		// given the system path
		StringSelection s4 = new StringSelection("C:\\Users\\yogesh.paneerselvam\\Downloads\\New folder\\sample_4.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s4, null);

		// Function Keys on Keyboard
		rob4.keyPress(KeyEvent.VK_CONTROL);
		rob4.keyPress(KeyEvent.VK_V);

		rob4.keyRelease(KeyEvent.VK_CONTROL);
		rob4.keyRelease(KeyEvent.VK_V);

		rob4.keyPress(KeyEvent.VK_ENTER);
		rob4.keyRelease(KeyEvent.VK_ENTER);

		rob4.delay(2000);

		// checkfille
		driver.findElement(By.xpath("(//*[@class='k-checkbox-label'])[1]")).click();

		// Documents Metadata
		// driver.findElement(By.xpath("//*[@class='k-checkbox-label
		// checkbox-pos']")).click();

		Thread.sleep(3000);

		// clicking Import and Apply Metadata button
		driver.findElement(By.xpath("//*[text()='Import and Apply Metadata']")).click();

		// clicking import button
		// driver.findElement(By.xpath("//*[text()='Import']")).click();

		Thread.sleep(2000);

		// clicking yes button
		// driver.findElement(By.xpath("//*[text()='Yes']")).click();

		// clicking no button
		driver.findElement(By.xpath("//*[text()='No']")).click();

		Thread.sleep(2000);

		// clicking cancel button
		driver.findElement(By.xpath("//*[text()='Cancel']")).click();

		Thread.sleep(5000);

		// --------------types-5--------------
		
		System.out.println("Type -5 add single documents ");

		// using action class
		Actions a = new Actions(driver);

		// staging
		WebElement staging = driver.findElement(By.xpath("(//*[@class='tree-node-wrapper ng-star-inserted'])[4]"));

		Thread.sleep(2000);

		// clicking right click perfom
		a.contextClick(staging).build().perform();

		/* (manual to click add single documents ) */

		Thread.sleep(5000);

		// clicking browse button
		driver.findElement(By.xpath("//*[text()='Browse']")).click();

		Thread.sleep(5000);

		// using robot class
		Robot rob5 = new Robot();

		rob5.delay(2000);

		// given the system path
		StringSelection s5 = new StringSelection("C:\\Users\\yogesh.paneerselvam\\Downloads\\New folder\\sample_5.pdf");// path
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s5, null);

		// Function Keys on Keyboard
		rob5.keyPress(KeyEvent.VK_CONTROL);
		rob5.keyPress(KeyEvent.VK_V);

		rob5.keyRelease(KeyEvent.VK_CONTROL);
		rob5.keyRelease(KeyEvent.VK_V);

		rob5.keyPress(KeyEvent.VK_ENTER);
		rob5.keyRelease(KeyEvent.VK_ENTER);

		rob5.delay(2000);

		// upload
		driver.findElement(By.xpath("(//*[@class='k-i-caret-alt-down k-icon ng-star-inserted'])[2]")).click();

		Thread.sleep(5000);

		// selecting categories
		driver.findElement(By.xpath("//*[text()='Yogi_Categories']")).click();

		Thread.sleep(3000);

		// clicking no button
		driver.findElement(By.xpath("//*[text()='No']")).click();

		Thread.sleep(2000);

		// clicking finish button
		// driver.findElement(By.xpath("//*[text()='Finish']")).click();

		// clicking cancel button
		driver.findElement(By.xpath("//*[text()='Cancel']")).click();

		Thread.sleep(5000);

		// --------------types-6--------------
		
		System.out.println("Type -6 add multiple documents ");

		// using action class
		Actions a1 = new Actions(driver);

		WebElement staging1 = driver.findElement(By.xpath("(//*[@class='tree-node-wrapper ng-star-inserted'])[4]"));

		Thread.sleep(2000);

		// clicking right click perfom
		a1.contextClick(staging1).build().perform();

		Thread.sleep(5000);

		/* (manual to click add multiple documents ) */

		// clicking documents
		driver.findElement(By.xpath("//*[@class='k-button-icon fa fa-arrow-circle-o-up ng-star-inserted']")).click();

		Thread.sleep(5000);

		// using robot
		Robot rob6 = new Robot();

		rob4.delay(2000);

		// given the system path
		StringSelection s6 = new StringSelection("C:\\Users\\yogesh.paneerselvam\\Downloads\\New folder\\sample_4.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s6, null);

		// Function Keys on Keyboard
		rob6.keyPress(KeyEvent.VK_CONTROL);
		rob6.keyPress(KeyEvent.VK_V);

		rob6.keyRelease(KeyEvent.VK_CONTROL);
		rob6.keyRelease(KeyEvent.VK_V);

		rob6.keyPress(KeyEvent.VK_ENTER);
		rob6.keyRelease(KeyEvent.VK_ENTER);

		rob6.delay(2000);

		// checkfille
		driver.findElement(By.xpath("(//*[@class='k-checkbox-label'])[1]")).click();

		// clicking Documents Metadata
		// driver.findElement(By.xpath("//*[@class='k-checkbox-label
		// checkbox-pos']")).click();

		Thread.sleep(3000);

		// Import and Apply Metadata button
		driver.findElement(By.xpath("//*[text()='Import and Apply Metadata']")).click();

		// import button
		// driver.findElement(By.xpath("//*[text()='Import']")).click();

		Thread.sleep(2000);

		// clicking yes button
		// driver.findElement(By.xpath("//*[text()='Yes']")).click();

		// clicking yes button
		driver.findElement(By.xpath("//*[text()='No']")).click();

		Thread.sleep(2000);

		// clicking cancel button
		driver.findElement(By.xpath("//*[text()='Cancel']")).click();

		Thread.sleep(6000);

		driver.findElement(By.xpath("(//*[@class='k-button-text'])[31]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//*[@class='k-button-text'])[31]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
              		
        WebElement Element = driver.findElement(By.xpath("(//*[text()='sample_1'])[3]"));

        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);

		driver.findElement(By.xpath("//*[text()='Yogesh P']")).click();
		
		driver.findElement(By.xpath("//*[text()='Sign out']")).click();
		
		System.out.println("log out");
		

	}

}
