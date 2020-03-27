package com.saucedemo.steps;

import static org.junit.Assert.*;

import com.saucedemo.hooks.Hooks;
import com.saucedemo.pages.SauceSite;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductSteps {
	SauceSite sauceSite;

	public ProductSteps(Hooks hooksClass) {
		this.sauceSite = hooksClass.sauceSite;
	}

	
	@Then("I will be in Products Page")
	public void i_will_be_in_Products_Page() {

		assertTrue(sauceSite.products().isAt());
	}


	@When("I log out from the application")
	public void i_log_out_from_the_application(){
		sauceSite.products().startLogout();

	}

	@Then("I will be logged out from the application")
	public void i_will_be_logged_out(){
		sauceSite.login().isAt();
	}

	@And("I Add two products to the cart")
	public void iAddTwoProductsToTheCart() {
		sauceSite.products().addProductsToCart();

		
	}

	@And("I navigate to the cart")
	public void iNavigateToTheCart() {

	}
}
