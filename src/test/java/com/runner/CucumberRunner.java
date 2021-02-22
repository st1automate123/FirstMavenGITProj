package com.runner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/features",
		glue = { "com.stepDefinitions"},
		tags= {"@searchexamples2"},
		plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json" }
			)

         
public class CucumberRunner {

	
	
}






