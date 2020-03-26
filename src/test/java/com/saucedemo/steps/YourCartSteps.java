package com.saucedemo.steps;

import com.saucedemo.hooks.Hooks;
import com.saucedemo.pages.SauceSite;
import cucumber.api.java.en.Then;

public class YourCartSteps {

	SauceSite sauceSite;

	public YourCartSteps(Hooks hooksClass) {

		this.sauceSite = hooksClass.sauceSite;
	}
	@Then("I will be able to Add Products to the Cart")
	public void i_will_be_able_to_Add_Products() {

	}
}
