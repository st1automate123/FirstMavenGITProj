package com.stepDefinitions;

import com.runner.BaseClass;

import cucumber.api.java.en.Then;

public class CheckoutStepDef extends BaseClass{

	@Then("^I checkout as a guest by provding email$")
	public void i_checkout_as_a_guest_by_provding_email() throws Throwable {
		checkoutPage.enterGuestEmailAdrress();
		checkoutPage.clickOnGuestEmailButton();
	}
	
	@Then("^I select \"([^\"]*)\" option and continue$")
	public void i_select_option_and_continue(String deliveryOption) throws Throwable {
		if(deliveryOption.equals("click and collect"))
		{		
			checkoutPage.selectDeliveryOption_clickAndCollect();
		}
		else
		{
			
		}
}

}	