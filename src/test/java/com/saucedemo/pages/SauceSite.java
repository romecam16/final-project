package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;

public class SauceSite {
    private ProductsPage productsPage;
    private LoginPage login;
    private CheckOutPage checkOut;
    private YourCartPage cart;
    private WebDriver driver;

    public SauceSite(WebDriver driver) {

        this.driver = driver;
    }

    public LoginPage login() {
        if(login == null) {
            return new LoginPage(driver);
        }
        return login;
    }

    public ProductsPage products() {
        if(productsPage == null) {
            return new ProductsPage(driver);
        }
        return productsPage;
    }

    public YourCartPage cart() {
        if(cart == null) {
            return new YourCartPage(driver);
        }
        return cart;
    }

    public CheckOutPage checkOut() {
        if(checkOut == null) {
            return new CheckOutPage(driver);
        }
        return checkOut;
    }

}