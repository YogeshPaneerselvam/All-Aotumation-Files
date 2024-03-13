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

public class Manage_Site {

	// created reference variable for WebDriver
	WebDriver driver;

	@Test // TestNG framework
	private void test() throws InterruptedException, IOException {

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
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\yogesh.paneerselvam\\Pictures\\Screenshots\\TakesScreenshot.jpeg");
		FileUtils.copyFile(src, destination);

		// clicking the Manage Sites
		driver.findElement(By.xpath("//*[text()='Manage Sites']")).click();
		System.out.println(" Manage Sites ");

		Thread.sleep(3000);

		/* features Add site */

	    System.out.println(" features Add site ");

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
		driver.findElement(By.xpath("//*[@id='id_sitename']")).sendKeys("Test-2702");

		Thread.sleep(2000);

		// clicking submit button
		driver.findElement(By.xpath("//*[@id='id_submitbutton']")).click();

		Thread.sleep(5000);

		// search box
		driver.findElement(By.xpath("//*[@id='keywords_ci']")).sendKeys("Test-2702");
		
		Thread.sleep(2000);

		// clicking the search icon button
		driver.findElement(By.xpath("//*[@class='fa fa-search search-icon']")).click();
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\yogesh.paneerselvam\\Pictures\\Screenshots\\TakesScreenshot1.jpeg");
		FileUtils.copyFile(src1, destination1);


		Thread.sleep(2000);

		// clicking checkbox
		driver.findElement(By.xpath("//*[@class='lc_Checkbox']")).click();

		Thread.sleep(2000);

		/* features edit */

		System.out.println(" features Edit ");

		// clicking the edit button
		driver.findElement(By.xpath("//*[text()=' Edit']")).click();

		// choose the site
		driver.findElement(By.xpath("//*[text()='Choose']")).click();

		Thread.sleep(2000);

		// selecting the site room
		driver.findElement(By.xpath("//*[text()='4103 - Room1TestCreation']")).click();

		Thread.sleep(2000);

		// entering the site id
		WebElement siteid = driver.findElement(By.xpath("//*[@id='id_siteid']"));
		// clearing site id
		siteid.clear();
		// given the sendkey value
		siteid.sendKeys("100020");

		Thread.sleep(2000);

		// entering the site name
		WebElement sitename = driver.findElement(By.xpath("//*[@id='id_sitename']"));
		// clearing site name
		sitename.clear();
		// given the sendkey value
		sitename.sendKeys("Test-0227");

		Thread.sleep(2000);

		// change status to inactive
		driver.findElement(By.xpath("//*[text()='Inactive']")).click();

		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File src2 = ts2.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("C:\\Users\\yogesh.paneerselvam\\Pictures\\Screenshots\\TakesScreenshot3.jpeg");
		FileUtils.copyFile(src2, destination2);
		
		
		Thread.sleep(3000);

		// clicking the submit button
		driver.findElement(By.xpath("//*[@id='id_submitbutton']")).click();

		Thread.sleep(5000);

		/* features map learners */

		System.out.println("features Map Learners");

		// search box
		driver.findElement(By.xpath("//*[@id='keywords_ci']")).sendKeys("Test-0227");
		

		Thread.sleep(2000);

		// clicking the search icon buttom
		driver.findElement(By.xpath("//*[@class='fa fa-search search-icon']")).click();
		
		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File src3 = ts3.getScreenshotAs(OutputType.FILE);
		File destination3 = new File("C:\\Users\\yogesh.paneerselvam\\Pictures\\Screenshots\\TakesScreenshot4.jpeg");
		FileUtils.copyFile(src3, destination3);

		Thread.sleep(2000);

		// clicking the check box
		driver.findElement(By.xpath("//*[@class='lc_Checkbox']")).click();

		Thread.sleep(2000);

		// clicking map learners -- add the user
		driver.findElement(By.xpath("//*[text()=' Map Learners']")).click();

		Thread.sleep(2000);

		// search users
		driver.findElement(By.xpath("//*[@id='searchusers']")).sendKeys("testuser15");

		Thread.sleep(2000);

		// clicking the search icon
		driver.findElement(By.xpath("//*[@class='fa fa-search search-icon']")).click();

		Thread.sleep(2000);
		
		TakesScreenshot ts4 = (TakesScreenshot) driver;
		File src4 = ts4.getScreenshotAs(OutputType.FILE);
		File destination4 = new File("C:\\Users\\yogesh.paneerselvam\\Pictures\\Screenshots\\TakesScreenshot5.jpeg");
		FileUtils.copyFile(src4, destination4);

		// clicking the user add
		driver.findElement(By.xpath("//*[text()='testuser 15']")).click();

		Thread.sleep(2000);

		// clicking the user Potential Site Learners add to Current Site Learners
		driver.findElement(By.xpath("//*[text()=' Add']")).click();

		Thread.sleep(2000);

//		//clicking the user Current Site Learners remove to Potential Site Learners
//		driver.findElement(By.xpath("//*[text()='Remove ']")).click();
//		
//		Thread.sleep(2000);

		// user selecting
		driver.findElement(By.xpath("//*[text()='testuser 15']")).click();

		Thread.sleep(2000);

//		// clicking the user cancel button
//		driver.findElement(By.xpath("//*[text()='Cancel']")).click();
//		
//		Thread.sleep(2000);

		// clicking the map User Submit button
		driver.findElement(By.xpath("//*[@id='mapUserSubmit']")).click();

		Thread.sleep(2000);

		// clicking the confirm button
		driver.findElement(By.xpath("//*[@class='ctg-btn']")).click();

		Thread.sleep(2000);

//		// clicking the cancel button
//		driver.findElement(By.xpath("//*[text()='Cancel']")).click();
//		
//		Thread.sleep(2000);

		// Confirm Mapping/Unmapping Learners in Site
		driver.findElement(By.xpath("//*[@class='fa fa-times']")).click();

		Thread.sleep(2000);

		/* features map cosurses */
		System.out.println("map cosurses");

		// search box
		driver.findElement(By.xpath("//*[@id='keywords_ci']")).sendKeys("Test-0227");

		Thread.sleep(2000);

		// clicking search icon button
		driver.findElement(By.xpath("//*[@class='fa fa-search search-icon']")).click();

		Thread.sleep(2000);
		
		TakesScreenshot ts5 = (TakesScreenshot) driver;
		File src5 = ts5.getScreenshotAs(OutputType.FILE);
		File destination5 = new File("C:\\Users\\yogesh.paneerselvam\\Pictures\\Screenshots\\TakesScreenshot5.jpeg");
		FileUtils.copyFile(src5, destination5);

		// clicking check box
		driver.findElement(By.xpath("//*[@class='lc_Checkbox']")).click();

		Thread.sleep(2000);

		// clicking map cosurses button
		driver.findElement(By.xpath("//*[text()=' Map Courses']")).click();

		Thread.sleep(2000);

		// entering cosurses name
		driver.findElement(By.xpath("//*[@id='searchcourses']")).sendKeys("test_course_1");

		Thread.sleep(2000);

		// clicking search icon button
		driver.findElement(By.xpath("//*[@class='fa fa-search search-icon']")).click();

		Thread.sleep(2000);

		// selecting the course
		driver.findElement(By.xpath("//*[text()='test_course_1']")).click();

		Thread.sleep(2000);

		// clicking the add button
		driver.findElement(By.xpath("//*[text()=' Add']")).click();

		Thread.sleep(2000);

		// selecting the course
		driver.findElement(By.xpath("//*[text()='test_course_1']")).click();

		Thread.sleep(2000);

		// clicking submit button
		driver.findElement(By.xpath("//*[@class='ctg-btn']")).click();

		Thread.sleep(2000);

//		// clicking cancel button
//		driver.findElement(By.xpath("//*[text()='Cancel']")).click();

		// clicking confirm button
		driver.findElement(By.xpath("//*[@class='ctg-btn']")).click();

		Thread.sleep(2000);

//		// clicking cancel button
//		driver.findElement(By.xpath("//*[text()='Cancel']")).click();
//		
//		Thread.sleep(2000);

		// clicking int button
		driver.findElement(By.xpath("//*[@class='fa fa-times']")).click();

		Thread.sleep(5000);

		/* features Map Site Coordinator */

		System.out.println("features  Map Site Coordinator");

		// search box
		driver.findElement(By.xpath("//*[@id='keywords_ci']")).sendKeys("Test-0227");

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

		// clicking add site coordinator
		driver.findElement(By.xpath("//*[@id='addsc']")).click();

		Thread.sleep(3000);

		// search box entering add site coordinator
		driver.findElement(By.xpath("//*[@class='selectator_element multiple options-hidden']")).click();

		Thread.sleep(4000);

		// selecting the add site coordinator
		driver.findElement(By.xpath("(//*[text()='testuser 15 (testuser15@gmail.com)'])[2]")).click();

		Thread.sleep(2000);

//		System.out.println("enble and disable select option");

		// Assign Course
		WebElement assignCheckbox = driver.findElement(By.xpath("(//*[@class='sc_Checkbox'])[1]"));
		if (!assignCheckbox.isSelected()) {
			assignCheckbox.click();
			System.out.println("Assign Course checkbox was not selected, so it has been selected.");
			
		} else {
			System.out.println("Assign Course checkbox was already selected.");
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

		// Receive Certificate Emails
		WebElement receiveEmailsCheckbox = driver.findElement(By.xpath("(//*[@class='sc_Checkbox'])[3]"));
		if (!receiveEmailsCheckbox.isSelected()) {
			receiveEmailsCheckbox.click();
			System.out.println("Receive Certificate Emails checkbox was not selected, so it has been selected.");
			
		} else {
			System.out.println("Receive Certificate Emails checkbox was already selected.");
		}
		
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
		
		Thread.sleep(2000);
		
		TakesScreenshot ts6 = (TakesScreenshot) driver;
		File src6 = ts6.getScreenshotAs(OutputType.FILE);
		File destination6 = new File("C:\\Users\\yogesh.paneerselvam\\Pictures\\Screenshots\\TakesScreenshot7.jpeg");
		FileUtils.copyFile(src6, destination6);

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
		driver.findElement(By.xpath("//*[@id='keywords_ci']")).sendKeys("Test-0227");

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

		/* features delete */

		System.out.println("features delete");

		// search box
		driver.findElement(By.xpath("//*[@id='keywords_ci']")).sendKeys("Test-0227");

		Thread.sleep(2000);

		// clicking search icon button
		driver.findElement(By.xpath("//*[@class='fa fa-search search-icon']")).click();

		TakesScreenshot ts7 = (TakesScreenshot) driver;
		File src7 = ts7.getScreenshotAs(OutputType.FILE);
		File destination7 = new File("C:\\Users\\yogesh.paneerselvam\\Pictures\\Screenshots\\TakesScreenshot8.jpeg");
		FileUtils.copyFile(src7, destination7);
		
		Thread.sleep(2000);

		// clicking check box
		driver.findElement(By.xpath("//*[@class='lc_Checkbox']")).click();

		Thread.sleep(2000);

		// clicking the delete button
		driver.findElement(By.xpath("//*[text()='  Delete']")).click();

		Thread.sleep(5000);

//		// clicking the cancel button
//		driver.findElement(By.xpath("//*[text()='Cancel']")).click();
//
//		Thread.sleep(2000);

		// clicking the confirm buttom
		driver.findElement(By.xpath("//*[@class='ctg-btn']")).click();

		Thread.sleep(2000);

		// search box
		driver.findElement(By.xpath("//*[@id='keywords_ci']")).sendKeys("Test-0227");

		Thread.sleep(2000);

		// clicking search icon button
		driver.findElement(By.xpath("//*[@class='fa fa-search search-icon']")).click();

		Thread.sleep(2000);
		
		TakesScreenshot ts8 = (TakesScreenshot) driver;
		File src8 = ts8.getScreenshotAs(OutputType.FILE);
		File destination8 = new File("C:\\Users\\yogesh.paneerselvam\\Pictures\\Screenshots\\TakesScreenshot7.jpeg");
		FileUtils.copyFile(src8, destination8);

	}

}
