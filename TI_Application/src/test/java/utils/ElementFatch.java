package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class ElementFatch {

	public WebElement getWebElement(String indentifireType, String identifiervalue) {
		switch (indentifireType) {
		case "XPATH":
			return BaseTest.driver.findElement(By.xpath(identifiervalue));

		case "CSS":
			return BaseTest.driver.findElement(By.cssSelector(identifiervalue));

		case "ID":
			return BaseTest.driver.findElement(By.id(identifiervalue));

		case "CLASS":
			return BaseTest.driver.findElement(By.className(identifiervalue));

		default:
			return null;

		}
	}

	public List<WebElement> getWebElements(String indentifireType, String identifiervalue) {
		switch (indentifireType) {
		case "XPATH":
			return BaseTest.driver.findElements(By.xpath(identifiervalue));

		case "CSS":
			return BaseTest.driver.findElements(By.cssSelector(identifiervalue));

		case "ID":
			return BaseTest.driver.findElements(By.id(identifiervalue));

		case "CLASS":
			return BaseTest.driver.findElements(By.className(identifiervalue));

		default:
			return null;

		}
	}
}
