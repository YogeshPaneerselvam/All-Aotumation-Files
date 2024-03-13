package pageEvents;

import org.testng.Assert;

import pageObjects.HomePageElements;
import utils.ElementFatch;

public class HomePageEvents {
	ElementFatch ele = new ElementFatch();

	public void verfifyIfHomePageIsLoaded() {

		Assert.assertTrue(ele.getWebElements("ID", HomePageElements.usersingn).size()> 0, "Element not found");

	}

	public void enterCredentials() {

		ele.getWebElement("ID", HomePageElements.usersingn).sendKeys("caintz@ti.com");

		ele.getWebElement("ID", HomePageElements.userPassword).sendKeys("Pass@123");

	}

	

}
