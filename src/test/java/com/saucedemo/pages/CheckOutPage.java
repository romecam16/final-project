package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class CheckOutPage extends BasePage {
	
	@FindBy(how = How.ID, using =  "first-name")
	WebElement txtFirstName;

	@FindBy(how = How.ID, using =  "last-name")
	WebElement txtLastName;

	@FindBy(how = How.ID, using =  "postal-code")
	WebElement txtPostalCode;

	public CheckOutPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void validateFirstNameFieldIsDisplayed() {
		assertTrue(txtFirstName.isDisplayed());
	}

	public void validateLastNameFieldIsDisplayed() {
		assertTrue(txtLastName.isDisplayed());
	}

	public void validatePostalFieldIsDisplayed() {
		
		assertTrue(txtPostalCode.isDisplayed());
	}
}
