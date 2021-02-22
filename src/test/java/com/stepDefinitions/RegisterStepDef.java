package com.stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.runner.BaseClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDef extends BaseClass{
	
	@And("^I enter values in all the fields$")
	public void i_enter_values_in_all_the_fields(DataTable registerDataTbDetails) throws Throwable {
	    
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		Map<String, String> registerDetails = registerDataTbDetails.asMap(String.class,String.class);
		registerPage.logRegistrationDetails_UsingMap(registerDetails);

/*		String email = registerDetails.get("email");
		String tit = registerDetails.get("title");
		String fname = registerDetails.get("firstname");
		String sname = registerDetails.get("surname");
		String passwd = registerDetails.get("password");
		String conpasswd = registerDetails.get("confirmpassword");
		String nect1 = registerDetails.get("nectarone");
		String nect2 = registerDetails.get("nectartwo");

		registerPage.userRegistration(email,tit,fname,sname,passwd,conpasswd,nect1,nect2);*/
	}

	@When("^I click on complete registration$")
	public void i_click_on_complete_registration() throws Throwable {
	    
	}

	@Then("^My account page should be displayed$")
	public void my_account_page_should_be_displayed() throws Throwable {
		
		
	}
	
	@And("^I fill details of register form$")
	public void i_fill_details_of_register_form(DataTable registerDataTb) throws Throwable {
		List<String> registerDetails = registerDataTb.asList(String.class);
		registerPage.logRegistrationDetails_UsingList(registerDetails);
	}
	
	@When("^I fill details of register form using list with header$")
	public void i_fill_details_of_register_form_using_list_with_header(DataTable registerDataTb) throws Throwable {
	    
		List<Map<String,String>> registerDetails = registerDataTb.asMaps(String.class,String.class);
		registerPage.logRegistrationDetails_UsingListOfMap(registerDetails);

	}




	

}
