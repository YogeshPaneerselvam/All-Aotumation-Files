package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditDashboard {
	// created reference variable for WebDriver
	WebDriver driver;

	@Test // TestNG framework
	private void test() throws InterruptedException {

		driver = new ChromeDriver();// Instantiate a ChromeDriver class.

		driver.manage().window().maximize(); // Maximize the browser

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));// implicitly wait

		driver.get("https://secure.trialinteractive.com/");// launching Trial interactive on the browser

		driver.findElement(By.id("pre-username")).sendKeys("yogeshjuly1997@gmail.com");// entering username

		driver.findElement(By.id("proceed-username-button")).click();// clicking signin button

		driver.findElement(By.name("passwordEntry")).sendKeys(" R!m0n@1997");// entering password

		driver.findElement(By.id("login-button")).click();// clicking login button

		Thread.sleep(7000);

		driver.findElement(By.linkText("July Patch")).click();// selction the room

		Thread.sleep(8000);

		driver.findElement(By.xpath("//span[@class='k-button-icon fa fa-th icon-size ng-star-inserted']")).click();// clicking
																													// production

		Thread.sleep(6000);

		driver.findElement(By.xpath("//a[@title='eTMF']")).click();// clicking eTMF

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[text()='Edit Dashboard']")).click();// clicking Edit Dashboard

		Thread.sleep(6000);

		// Checkbox 1
		WebElement checkbox1 = driver.findElement(By.xpath("(//*[@class='k-checkbox-label'])[1]"));
		
		if (!checkbox1.isSelected()) {
			checkbox1.click();
			System.out.println("Checkbox 1 was not selected");
			
			if (!checkbox1.isEnabled()) {
				checkbox1.click();
				System.out.println(" so it has been enabled.");
				
		} else {
			checkbox1.click();
			System.out.println("Checkbox 1 was selected, so it has been disabled.");
		}
			
			
			
		Thread.sleep(3000);

		// Checkbox 2
		WebElement checkbox2 = driver.findElement(By.xpath("(//*[@class='k-checkbox-label'])[2]"));
		if (!checkbox2.isSelected()) {
			checkbox2.click();
			System.out.println("Checkbox 2 was not selected, so it has been enabled.");
		} else {
			checkbox2.click();
			System.out.println("Checkbox 2 was selected, so it has been disabled.");
		}
		Thread.sleep(3000);

		// Checkbox 3
		WebElement checkbox3 = driver.findElement(By.xpath("(//*[@class='k-checkbox-label'])[3]"));
		if (!checkbox3.isSelected()) {
			checkbox3.click();
			System.out.println("Checkbox 3 was not selected, so it has been enabled.");
		} else {
			checkbox3.click();
			System.out.println("Checkbox 3 was selected, so it has been disabled.");
		}
		Thread.sleep(3000);

		// Checkbox 4
		WebElement checkbox4 = driver.findElement(By.xpath("(//*[@class='k-checkbox-label'])[4]"));
		if (!checkbox4.isSelected()) {
			checkbox4.click();
			System.out.println("Checkbox 4 was not selected, so it has been enabled.");
		} else {
			checkbox4.click();
			System.out.println("Checkbox 4 was selected, so it has been disabled.");
		}
		Thread.sleep(3000);

		// Checkbox 5
		WebElement checkbox5 = driver.findElement(By.xpath("(//*[@class='k-checkbox-label'])[5]"));
		if (!checkbox5.isSelected()) {
			checkbox5.click();
			System.out.println("Checkbox 5 was not selected, so it has been enabled.");
		} else {
			checkbox5.click();
			System.out.println("Checkbox 5 was selected, so it has been disabled.");
		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[text()=' Save ']")).click();// save

	}
	}
}
