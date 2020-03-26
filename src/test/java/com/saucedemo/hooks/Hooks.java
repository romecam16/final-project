package com.imdb.hooks;

import java.util.concurrent.TimeUnit;

import com.imdb.pages.SauceSite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	public static WebDriverWait wait;

	public SauceSite sauceSite;
	
	@Before
	public void before() {
		System.setProperty("webdriver.chrome-driver", String.valueOf(Thread.currentThread().getContextClassLoader().getResource("drivers/chromedriver.exe")));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,  TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		sauceSite = new SauceSite(driver);
	}
	
	@After
	public void after() {

		driver.quit();
	}

}
