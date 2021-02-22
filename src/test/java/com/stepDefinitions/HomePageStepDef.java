package com.stepDefinitions;

import org.openqa.selenium.By;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageStepDef extends BaseClass{
	public static String product_Name;
	
	@Given("^I am on Home page$")
	public void i_am_on_Home_page() throws Throwable {
		homePage.verifyHomePage();
	}
	
	@When("^I search with valid \"([^\"]*)\"$")
	public void i_search_with_valid(String validData) throws Throwable {
		homePage.searchWithValidInfo(validData);
	}
	
	@When("^I search with invalid \"([^\"]*)\"$")
	public void i_search_with_invalid(String invalidData) throws Throwable {
		homePage.searchWithInValidInfo(invalidData);
	}
	
	@When("^I click on TU/Login Register$")
	public void i_click_on_TU_Login_Register() throws Throwable {
		homePage.clickOnRegisterLink();
	}
	
/*	@When("^I search with valid product name$")
	public void i_search_with_valid_product_name() throws Throwable {
		homePage.searchWithValidData();
	}

	@When("^I search with invalid product name$")
	public void i_search_with_invalid_product_name() throws Throwable {
		homePage.searchWithInValidData();	
	}
	
	@When("^I search with valid product category$")
	public void i_search_with_valid_product_category() throws Throwable {
		//driver.findElement(By.cssSelector("#search")).clear();
		//driver.findElement(By.cssSelector("#search")).sendKeys("Kids"); 
		//driver.findElement(By.cssSelector(".searchButton")).click(); 
		homePage.searchWithValidProductCategory();
		
	}

	@When("^I search with invalid product category$")
	public void i_search_with_invalid_product_category() throws Throwable {
		//driver.findElement(By.id("search")).clear();
		//driver.findElement(By.id("search")).sendKeys("sdik"); 
		/driver.findElement(By.className("searchButton")).click();
		
		homePage.searchWithInValidProductCategory();
	}
	
	@When("^I search with valid product number$")
	public void i_search_with_valid_product_number() throws Throwable {
		//driver.findElement(By.cssSelector("#search")).clear();
		//driver.findElement(By.cssSelector("#search")).sendKeys("138578551"); 
		//driver.findElement(By.cssSelector(".searchButton")).click();  
		homePage.searchWithValidProductNumber();
		
	}

	@When("^I search with invalid product number$")
	public void i_search_with_invalid_product_number() throws Throwable {
		driver.findElement(By.cssSelector("#search")).clear();
		driver.findElement(By.cssSelector("#search")).sendKeys("11111111111"); 
		driver.findElement(By.cssSelector(".searchButton")).click();
		homePage.searchWithInValidProductNumber();

	}
	
	@When("^I leave search text box blank$")
	public void i_leave_search_text_box_blank() throws Throwable {
		driver.findElement(By.cssSelector("#search")).clear();
		driver.findElement(By.cssSelector("#search")).sendKeys(""); 
		driver.findElement(By.cssSelector(".searchButton")).click();
		homePage.searchWithBlankSearchTextField();

	}

	@When("^I search with special charecters$")
	public void i_search_with_special_charecters() throws Throwable {
		driver.findElement(By.cssSelector("#search")).clear();
		driver.findElement(By.cssSelector("#search")).sendKeys("&&&***$$$$"); 
		driver.findElement(By.cssSelector(".searchButton")).click();
		homePage.searchWithSpecialCharecters();

	}
	
	@When("^I search with product colour$")
	public void i_search_with_product_colour() throws Throwable {
		driver.findElement(By.cssSelector("#search")).clear();
		driver.findElement(By.cssSelector("#search")).sendKeys("Pink"); 
		driver.findElement(By.cssSelector(".searchButton")).click();
		homePage.searchWithProductColour();

	}
	
	@When("^I search with a product description$")
	public void i_search_with_a_product_description() throws Throwable {
		driver.findElement(By.cssSelector("#search")).clear();
		driver.findElement(By.cssSelector("#search")).sendKeys("Yellow Oversized Knitted Top"); 
		driver.findElement(By.cssSelector(".searchButton")).click(); 
		homePage.searchWithProductDescription();

	}

	
	@When("^I search for a product name$")
	public void i_search_for_a_product_name() throws InterruptedException
	{
		driver.findElement(By.id("search")).clear();
		driver.findElement(By.id("search")).sendKeys("Pink Check Shirt"); 
		driver.findElement(By.cssSelector("button[data-testid='searchButton']")).click();
        Thread.sleep(2000);

	}*/
	
/*	@When("^I search for a product and select the product$")
	public void i_search_for_a_product_and_select_the_product() throws Throwable {
		homePage.searchAProduct();
		//searchResultsPage.selectAProduct();
	}*/
	
	@When("^I search for a product \"([^\"]*)\" and select the product$")
	public void i_search_for_a_product_and_select_the_product(String productName) throws Throwable {
		//product_Name=productName;
		homePage.searchAProduct(productName);
		searchResultsPage.selectOneOfTheProduct(productName);
	}
	
	@When("^I click TU store locator link$")
	public void i_click_TU_store_locator_link() throws Throwable {
		homePage.clickOnStoreLocatorLink();
			    
	}
	
	@When("^I search for a product \"([^\"]*)\" and add to the basket$")
	public void i_search_for_a_product_and_add_to_the_basket(String productName) throws Throwable {
		homePage.searchAProduct(productName);
		searchResultsPage.selectOneOfTheProduct(productName);
		productDetailsPage.addProductToBasket();
	}


	

	
}
