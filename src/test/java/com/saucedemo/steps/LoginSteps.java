package com.saucedemo.steps;

import com.saucedemo.hooks.Hooks;
import com.saucedemo.pages.SauceSite;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	SauceSite sauceSite;

	@Given("I navigate to Login Page")
	public void i_navigate_to_Login_Page() {
		sauceSite.login().goTo();
	}

	public LoginSteps(Hooks hooksClass) {
		this.sauceSite = hooksClass.sauceSite;
	}
	@When("I log into the site with credentials {word}")
	public void i_log_into_the_site_with_credentials (String credentials) {
		sauceSite.login().loginCorrecto(credentials);
	}
	

	@Then("I will see a login error")
	public void i_will_see_an_error_message() {
		sauceSite.login().isLoginErrorDisplayed();

	}


	@Then("I will see a locked out error message")
	public void iWillSeeALockedOutErrorMessage() {
		sauceSite.login().isLockedOutErrorMessageDisplayed();
	}
}
