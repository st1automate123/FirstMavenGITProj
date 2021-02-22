package com.stepDefinitions;

import com.runner.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasketStepDefs extends BaseClass{

	
	@Then("^I should see basket page is displayed$")
	public void i_should_see_basket_page_is_displayed() throws Throwable {
		basketPage.verifyBasketPageIsDisplayed();
	}
	
	@When("^I delete one product from the baket page$")
	public void deleteAProduct()
	{
		basketPage.deleteAproductFromBasketPage();
		basketPage.clickOnBasket();	
	}
	
	@Then("^I should see one product deleted from the basket$")
	public void productDeletedFromBasket()
	{
		basketPage.verifyProductDeletedMessage();
	}
	
	@Then("^I click on proceed to checkout$")
	public void i_click_on_proceed_to_checkout() throws Throwable {
		productDetailsPage.clickOnCheckOut();
		productDetailsPage.clickOnProceedToCheckout();
   
	}
	
	

	

	@Then("^I enter biling details on payment page$")
	public void i_enter_biling_address_details_and_continue_to_payment() throws Throwable {
	    
	}

	@Then("^I click on payment button$")
	public void i_click_on_payment_button() throws Throwable {
	    
	}

	@Then("^I should get payment confirmation$")
	public void i_should_get_payment_confirmation() throws Throwable {
	    
	}



	 
}
