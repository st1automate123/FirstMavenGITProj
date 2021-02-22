package com.stepDefinitions;

import com.runner.BaseClass;

import cucumber.api.java.en.Then;

public class FindStoreStepDef extends BaseClass{

	@Then("^I select nearest store and go to order summary page$")
	public void i_select_nearest_store_by_entering_postcode() throws Throwable {
		findStorePage.lookupForAndSelectNearestStore();
		
	}
}
