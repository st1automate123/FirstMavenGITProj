package com.stepDefinitions;

import org.junit.Assert;

import com.runner.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StoreLocatorStepDef extends BaseClass{
	
	@When("^I enter post code as \"([^\"]*)\"$")
	public void i_enter_post_code_as(String postCodeValue) throws Throwable {
	   storeLocatorPage.verifyStoreLocatorPage();
	   storeLocatorPage.enterPostCodeOrTown(postCodeValue);
	}

	@When("^I clicks on find stores$")
	public void i_clicks_on_find_stores() throws Throwable {
		storeLocatorPage.clickOnFindStores();
	}

	@Then("^It should display the nearest stores$")
	public void it_should_display_the_nearest_stores() throws Throwable {
		storeLocatorPage.verifyNearestStores();
	}
	
	@Then("^It should display warning message to enter valid postcode or town$")
	public void warning_message_for_postcode_town()
	{
		storeLocatorPage.verifyWarningMessage_EnterPostCodeTown();
	}
	
	@Then("^I should get an error message to fill the store locator field$")
	public void error_message_to_fill_store_locator()
	{
		
	}
}
