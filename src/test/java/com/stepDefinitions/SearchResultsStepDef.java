package com.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SearchResultsStepDef extends BaseClass{
	@Then("^I should see valid search results$")
	public void i_should_see_valid_search_results() throws Throwable {
		searchResultsPage.verifySearchResults();
	}
	
	@Then("^I should see no results found page$")
	public void i_should_see_no_results_found_page() throws Throwable {
		searchResultsPage.verifyNoResultsFoundPage1();
	}
	
	@Then("^I should see related category products$")
	public void i_should_see_related_category_products() throws Throwable {
		/*Assert.assertEquals("Kids Clothes | Children's Fashion | Tu Clothing", driver.getTitle());
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/c/kids/kids?INITD=GNav-CW-Header&", driver.getCurrentUrl());*/
		searchResultsPage.verifyRelatedCategoryProducts();
        
	}
	
	@Then("^I should see the randomn products for invalid product category$")
	public void i_should_see_the_randomn_products_for_invalid_product_category() throws Throwable {
	  /*  Assert.assertEquals("https://tuclothing.sainsburys.co.uk/search?text=sdik", driver.getCurrentUrl());*/
		searchResultsPage.verifyRandomCategoryProducts();
	}

	@Then("^I should see the product number related products$")
	public void i_should_see_the_product_number_related_products() throws Throwable {
	   /* Assert.assertEquals("Search results for: 138578551 | Tu clothing", driver.getTitle());*/
	    searchResultsPage.verifyProductNumberRelatedProduct();
	}

	@Then("^I should see no results found page for invalid product number$")
    public void i_should_see_no_results_found_page_for_invalid_product_number()
    {
	   /* Assert.assertEquals("https://tuclothing.sainsburys.co.uk/search?text=11111111111", driver.getCurrentUrl());*/
	    searchResultsPage.verifyNoResultsFoundPage2();
    }
	
	@Then("^I should be prompted to fill the blank search field$")
	public void i_should_be_prompted_to_fill_the_blank_search_field() throws Throwable {
	/* String str = driver.findElement(By.cssSelector("span[title='Please complete a product search']")).getText();
	 Assert.assertEquals("Please complete a product search", str);*/
		searchResultsPage.verifyErrorMsgBlankSearch();

	}
	
	@Then("^I should see the randomnly displayed products$")
	public void i_should_see_the_randomnly_displayed_products() throws Throwable {
	  /*  Assert.assertEquals("Search results for: &&&***$$$$ | Tu clothing",driver.getTitle());*/
		searchResultsPage.verifyRandomnProducts();
	}

	

	@Then("^I should see colour related products$")
	public void i_should_see_colour_related_products() throws Throwable {
	  /*  Assert.assertEquals("Search results for: Pink | Tu clothing",driver.getTitle());*/
		searchResultsPage.verifyProductsWithColour();
	}

	
	@Then("^I should see the related products for product description$")
	public void i_should_see_the_related_products() throws Throwable {
		/*	Assert.assertEquals("https://tuclothing.sainsburys.co.uk/search?text=Yellow+Oversized+Knitted+Top",driver.getCurrentUrl() );*/
		searchResultsPage.verifyProductDescription();
	}
	
	@And("^I select a product$")
	public void selectProduct()
	{
	}
	
	

	
	
	

}
