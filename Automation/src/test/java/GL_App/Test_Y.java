package GL_App;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Y {

	// created reference variable for WebDriver
	WebDriver driver;

	@Test
	public void test() throws InterruptedException, IOException {

		// Instantiate a ChromeDriver class.
		driver = new ChromeDriver();

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

		Thread.sleep(5000);

		// clicking the Manage Sites
		driver.findElement(By.xpath("//*[text()='Manage Sites']")).click();
		System.out.println(" Manage Sites ");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\yogesh.paneerselvam\\Pictures\\Screenshots\\TakesScreenshot.jpeg");
		FileUtils.copyFile(src, destination);

		Thread.sleep(3000);

		/* features Add site */

		// System.out.println(" features Add site ");

		// clicking the Add Site
		driver.findElement(By.xpath("//*[text()=' Add Site']")).click();

		Thread.sleep(3000);

		// clicking the choose Site
		driver.findElement(By.xpath("//*[text()='Choose']")).click();

		Thread.sleep(2000);

		// clicking the site room
		driver.findElement(By.xpath("//*[text()='4103 - Room1TestCreation']")).click();
		

		Thread.sleep(2000);

		// entering the site id
		driver.findElement(By.xpath("//*[@id='id_siteid']")).sendKeys("100020");

		Thread.sleep(2000);

		// entering the site name
		driver.findElement(By.xpath("//*[@id='id_sitename']")).sendKeys("test-242");

		Thread.sleep(2000);

		// clicking submit button
		driver.findElement(By.xpath("//*[@id='id_submitbutton']")).click();

		Thread.sleep(5000);

		// search box
		driver.findElement(By.xpath("//*[@id='keywords_ci']")).sendKeys("test-22");

		Thread.sleep(2000);

		// clicking the search icon button
		driver.findElement(By.xpath("//*[@class='fa fa-search search-icon']")).click();

		Thread.sleep(2000);

		// clicking checkbox
		driver.findElement(By.xpath("//*[@class='lc_Checkbox']")).click();
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\yogesh.paneerselvam\\Pictures\\Screenshots\\TakesScreenshot2.jpeg");
		FileUtils.copyFile(src1, destination1);

		/* features Map Site Coordinator */

		System.out.println("features  Map Site Coordinator");

		// clicking map site coordinator
		driver.findElement(By.xpath("//*[text()=' Map Site Coordinator']")).click();

		Thread.sleep(2000);

		// clicking add site coordinator
		driver.findElement(By.xpath("//*[@id='addsc']")).click();

		Thread.sleep(3000);

		// search box entering add site coordinator
		driver.findElement(By.xpath("//*[@class='selectator_element multiple options-hidden']")).click();

		Thread.sleep(4000);

		// selecting the add site coordinator
		driver.findElement(By.xpath("(//*[text()='testuser 15 (testuser15@gmail.com)'])[2]")).click();

		Thread.sleep(2000);

		// Assign Course
		WebElement assignCheckbox = driver.findElement(By.xpath("(//*[@class='sc_Checkbox'])[1]"));
		if (!assignCheckbox.isSelected()) {
		    assignCheckbox.click();
		    System.out.println("Assign Course checkbox was not selected, so it has been selected.");
		} else {
		    System.out.println("Assign Course checkbox was already selected.");
		}
		Thread.sleep(2000);

		if (assignCheckbox.isEnabled()) {
		    // Disable the checkbox
		    assignCheckbox.click();
		    System.out.println("Assign Course checkbox has been disabled.");
		} else {
		    System.out.println("Assign Course checkbox is already disabled.");
		}
		Thread.sleep(2000);

		// Create Course
		WebElement createCheckbox = driver.findElement(By.xpath("(//*[@class='sc_Checkbox'])[2]"));
		if (!createCheckbox.isSelected()) {
		    createCheckbox.click();
		    System.out.println("Create Course checkbox was not selected, so it has been selected.");
		} else {
		    System.out.println("Create Course checkbox was already selected.");
		}
		Thread.sleep(2000);

		if (createCheckbox.isEnabled()) {
		    // Disable the checkbox
		    createCheckbox.click();
		    System.out.println("Create Course checkbox has been disabled.");
		} else {
		    System.out.println("Create Course checkbox is already disabled.");
		}
		Thread.sleep(2000);

		// Similarly, perform the same checks for other checkboxes

		Thread.sleep(2000);

		// View Certificate
		WebElement viewCertificateCheckbox = driver.findElement(By.xpath("(//*[@class='sc_Checkbox'])[4]"));
		if (!viewCertificateCheckbox.isSelected()) {
			viewCertificateCheckbox.click();
			System.out.println("View Certificate checkbox was not selected, so it has been selected.");
		} else {
			System.out.println("View Certificate checkbox was already selected.");
		}
		Thread.sleep(2000);

		// View Transcript
		WebElement viewTranscriptCheckbox = driver.findElement(By.xpath("(//*[@class='sc_Checkbox'])[5]"));
		if (!viewTranscriptCheckbox.isSelected()) {
			viewTranscriptCheckbox.click();
			System.out.println("View Transcript checkbox was not selected, so it has been selected.");
		} else {
			System.out.println("View Transcript checkbox was already selected.");
		}

//		
//		Thread.sleep(2000);

		// clicking save button
		driver.findElement(By.xpath("(//*[@class='ctg-btn'])[2]")).click();

		Thread.sleep(2000);

//		// clicking back button
//		driver.findElement(By.xpath("(//*[@class='ctg-btn'])[1]")).click();
//		
//		Thread.sleep(2000);

//		// clicking save button
//		driver.findElement(By.xpath("//*[@id='savesc']")).click();
//		
//		Thread.sleep(2000);

		// clicking cancel button
		driver.findElement(By.xpath("//*[text()='Cancel']")).click();

		Thread.sleep(3000);

		// search box
		driver.findElement(By.xpath("//*[@id='keywords_ci']")).sendKeys("test-22");

		Thread.sleep(2000);

		// clicking search icon button
		driver.findElement(By.xpath("//*[@class='fa fa-search search-icon']")).click();

		Thread.sleep(2000);

		// clicking check box
		driver.findElement(By.xpath("//*[@class='lc_Checkbox']")).click();

		Thread.sleep(2000);

		// clicking map site coordinator
		driver.findElement(By.xpath("//*[text()=' Map Site Coordinator']")).click();

		Thread.sleep(2000);

		// clicking cancel button
		driver.findElement(By.xpath("//*[text()='Cancel']")).click();

		Thread.sleep(4000);
	}

}
