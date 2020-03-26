package com.saucedemo.steps;

import org.openqa.selenium.WebDriver;

import com.saucedemo.hooks.Hooks;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.YourCartPage;
import com.saucedemo.pages.CheckOutPage;

public class BaseSteps {
	protected WebDriver driver;
	public ProductsPage products;
	public LoginPage login;
	public YourCartPage cart;
	public CheckOutPage checkout;
	
	public BaseSteps() {
		this.driver = Hooks.driver;
		products = new ProductsPage(driver);
		login = new LoginPage(driver);
		cart = new YourCartPage(driver);
		checkout = new CheckOutPage(driver);
	}
}
