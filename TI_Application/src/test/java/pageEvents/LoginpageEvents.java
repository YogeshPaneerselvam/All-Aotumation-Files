package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFatch;

public class LoginpageEvents {
	ElementFatch ele = new ElementFatch();
	
	public void verfifyIfLogingPageIsLoaded12() {
		
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.LoginText).size()==0, "Element not found");
		
	}
	
	public void enterCredentials() {
		
	ele.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("");
	//ele.getWebElement("XPATH", LoginPageElements.emailPassword).sendKeys("");
	
		
	}

}
