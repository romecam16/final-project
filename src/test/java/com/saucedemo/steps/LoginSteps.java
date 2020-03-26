package com.imdb.steps;

import com.imdb.hooks.Hooks;
import com.imdb.pages.SauceSite;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	SauceSite sauceSite;

	public LoginSteps(Hooks hooksClass) {
		this.sauceSite = hooksClass.sauceSite;
	}
	@When("I log into the site with credentials {word}")
	public void i_log_into_the_site_with_credentials(String credentials) {
		//trabajo en dos paginas.  la login page, y la product page
		sauceSite.login().loginCorrecto(credentials);
	    
	}
	

	@Then("I will see a login error")
	public void i_will_see_an_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


	@Given("I navigate to Login Page")
	public void iNavigateToLoginPage() {
		sauceSite.login().goTo();
	}
}
