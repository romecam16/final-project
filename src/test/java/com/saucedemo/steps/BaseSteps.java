package com.imdb.steps;

import org.openqa.selenium.WebDriver;

import com.imdb.hooks.Hooks;
import com.imdb.pages.ProductsPage;
import com.imdb.pages.LoginPage;
import com.imdb.pages.YourCartPage;
import com.imdb.pages.CheckOutPage;

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
