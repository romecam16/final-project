package com.saucedemo.steps;

import static org.junit.Assert.*;

import com.saucedemo.hooks.Hooks;
import com.saucedemo.pages.SauceSite;
import cucumber.api.java.en.Then;

public class ProductSteps {
	SauceSite sauceSite;

	public ProductSteps(Hooks hooksClass) {
		this.sauceSite = hooksClass.sauceSite;
	}

	
	@Then("I will be in Products Page")
	public void i_will_be_in_Products_Page() {

		assertTrue(sauceSite.products().isAt());
	}
}
