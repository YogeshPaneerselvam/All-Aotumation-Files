package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WorkFlow {

	// created reference variable for WebDriver
	WebDriver driver;

	@Test // TestNG framework
	private void test() throws InterruptedException, AWTException  {

		driver = new ChromeDriver();// Instantiate a ChromeDriver class.

		driver.manage().window().maximize(); // Maximize the browser

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));// implicitly wait

		driver.get("https://secure.trialinteractive.com/");// launching Trial interactive on the browser

		driver.findElement(By.id("pre-username")).sendKeys("yogeshjuly1997@gmail.com");// entering username

		driver.findElement(By.id("proceed-username-button")).click();// clicking signin button

		driver.findElement(By.name("passwordEntry")).sendKeys(" R!m0n@1997");// entering password

		driver.findElement(By.id("login-button")).click();// clicking login button

		WebElement elementVisible = driver.findElement(By.xpath("//a[text()='July Patch']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(elementVisible));

		driver.findElement(By.xpath("//*[text()='July Patch']")).click();// selction the room

		Thread.sleep(8000);

		driver.findElement(By.xpath("//*[@class='k-button-icon fa fa-th icon-size ng-star-inserted']")).click();

		Thread.sleep(6000);

		driver.findElement(By.xpath("//*[@title='eTMF']")).click();// clicking eTMF

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//*[@class='sidebar-menu__item'])[1]")).click();

		Thread.sleep(3000);
		
		Actions a = new Actions(driver);

		WebElement staging = driver.findElement(By.xpath("(//*[@class='tree-node-wrapper ng-star-inserted'])[4]"));
		
		Thread.sleep(2000);
		
		a.moveToElement(staging).contextClick().build().perform();
		
		/*(manual to click add single documents )*/

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
		driver.findElement(By.xpath("//*[text()='Finish']")).click();

		// clicking cancel button
		//driver.findElement(By.xpath("//*[text()='Cancel']")).click();
		
		Thread.sleep(6000);
		
		WebElement value = driver.findElement(By.xpath("//*[@class='pager-input ng-valid ng-star-inserted ng-dirty ng-touched']"));
		value.sendKeys("2");
		value.sendKeys(Keys.ENTER);
		
		
		
		

		
		
		
		
		
	}

}
