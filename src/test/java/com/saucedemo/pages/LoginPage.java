package com.saucedemo.pages;

import com.saucedemo.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.saucedemo.utils.Utils;

public class LoginPage extends BasePage {

	@FindBy(how = How.ID, using = "user-name" )
	WebElement userField;
	
	@FindBy(how = How.ID, using = "password")
	WebElement passField;
	
	@FindBy(how = How.CLASS_NAME, using =  "btn_action" )
	WebElement loginButton;

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void loginCorrecto(String credentials) {
		
		userField.sendKeys(Utils.getUser(credentials));
		passField.sendKeys(Utils.getPassword(credentials));
		loginButton.click();
	}


	public void goTo() {
		driver.get(Properties.SAUCE_DEMO_URL);
	}

}
