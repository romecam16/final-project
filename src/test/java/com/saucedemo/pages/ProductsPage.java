package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsPage extends BasePage {

	// page members
	@FindBy(how = How.CLASS_NAME, using =  "product_label")
	WebElement productsLabel;
	
	@FindBy(how = How.CSS, using = ".bm-burger-button")
	WebElement linksMenu;
	
	@FindBy(how=How.ID, using ="logout_sidebar_link")
	WebElement logoutBtn;
	
	@FindBy(how=How.XPATH, using= "//img[@src =\"./img/sauce-backpack-1200x1500.jpg\"]")
	WebElement backPackImage;

	@FindBy(how=How.XPATH, using= "//img[@src =\"./img/red-onesie-1200x1500.jpg\"]")
	WebElement onesieImage;

	@FindBy(how=How.XPATH, using= "//img[@src =\"./img/bike-light-1200x1500.jpg\"]")
	WebElement bikeLigthImage;

	@FindBy(how=How.XPATH, using= "//div[5]//div[3]//button[1]")
	WebElement onesieAddToCartBtn;

	@FindBy(how=How.XPATH, using= "//body[@class='main-body']//div[@id='inventory_container']//div[@id='inventory_container']//div[2]//div[3]//button[1]")
	WebElement bikeLightAddToCartBtn;

	//@FindBy(how=How.CLASS_NAME, using= "inventory_list")
	//WebElement getAllProducts;

	public ProductsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public boolean isAt() {
		return productsLabel.isDisplayed() &&
				linksMenu.isDisplayed() &&
				backPackImage.isDisplayed() &&
				onesieImage.isDisplayed() &&
				bikeLigthImage.isDisplayed() &&
				onesieAddToCartBtn.isEnabled() &&
				bikeLightAddToCartBtn.isEnabled();
	}

	public void startLogout() {
		this.linksMenu.click();
		this.logoutBtn.click();
	}


	public List<String> getProducts(){
		List<WebElement> resultProducts = driver.findElements(By.className("inventory_item"));
		resultProducts.get(2);
		System.out.println(resultProducts + "saucelab product");
		return getProducts();
	}

	public List <String> addProductsToCart() {
	List <String> results = getProducts();
	return results;
	}
}