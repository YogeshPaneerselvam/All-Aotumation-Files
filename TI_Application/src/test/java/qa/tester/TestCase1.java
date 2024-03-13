package qa.tester;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginpageEvents;
import utils.ElementFatch;

public class TestCase1 extends BaseTest {

	ElementFatch ele = new ElementFatch();
	HomePageEvents homePage = new HomePageEvents();
	LoginpageEvents loginPage = new LoginpageEvents();

	@Test
	public void f() {
		
		
		homePage.verfifyIfHomePageIsLoaded();
	}
}
