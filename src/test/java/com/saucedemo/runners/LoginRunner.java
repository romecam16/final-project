package com.saucedemo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
			"src/test/resources/features/login.feature"
		},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/login.json",
        "html:target/login-html"},
        glue = {"com.saucedemo.pages",
                "com.saucedemo.steps",
                "com.saucedemo.utils",
                "com.saucedemo.hooks"})


public class LoginRunner {}
