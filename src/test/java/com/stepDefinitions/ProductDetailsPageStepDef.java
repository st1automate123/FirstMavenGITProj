package com.stepDefinitions;

import org.junit.Assert;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductDetailsPageStepDef extends BaseClass{
	
	@Then("^I should see product details page$")
	public void i_should_see_product_details_page() throws Throwable {
		productDetailsPage.verifyProductDetailsPage();
	}

	@When("^I add the product to basket$")
	public void i_add_the_product_to_basket() throws Throwable {
		productDetailsPage.addProductToBasket();
	}

	@Then("^Product should be added to the basket$")
	public void product_should_be_added_to_the_basket() throws Throwable {
		productDetailsPage.verifyProductAddedInTheBasket();
	}
	
	@Then("^Add to basket should be disabled$")
	public void addBasket_Disabled()
	{
		productDetailsPage.addToBasketIsDisabled();
	}
	
	@Then("^Multiple products added to the basket$")
    public void addMultiplProducts()
	{
		productDetailsPage.verifyMultipleProductsAddedToBasket();
	}
	
	@When("^I click on checkout$")
	public void i_click_on_checkout() throws Throwable {
		productDetailsPage.clickOnCheckOut();
	}
  
	@Given("^I am on Product details page$")
	public void i_am_on_Product_details_page() throws Throwable {
		homePage.verifyHomePage();
		homePage.searchAProduct("Pink Check Shirt");
		searchResultsPage.selectOneOfTheProduct("Pink Check Shirt");
		productDetailsPage.verifyProductDetailsPage();
	}

	@When("^I add product to basket by selecting size and quantity$")
	public void i_add_product_to_basket_by_selecting_size_and_quantity() throws Throwable {
		productDetailsPage.addProductToBasket();
	}


	
}
