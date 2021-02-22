package com.stepDefinitions;

import org.junit.Assert;

import com.runner.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchResultsStepDef2 extends BaseClass{
	
	
	@Then("^Valid search rearch results should be displayed$")
	public void valid_search_rearch_results_should_be_displayed() throws Throwable {
     searchResultsPage2.verifySearchWithValidInfo();
	}
	
	
	@Then("^I should see the appropriate pages accordingly$")
	public void i_should_see_the_appropriate_pages_accordingly() throws Throwable {
		searchResultsPage2.verifySearchWithInValidInfo();
	}

	@Then("^I should see valid \"([^\"]*)\"$")
	public void i_should_see_valid(String searchResult) throws Throwable {
		searchResultsPage2.verifySearchResults_Valid(searchResult);
	}
	
	



	



}
