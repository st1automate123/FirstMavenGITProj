package com.stepDefinitions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



// import junit.framework.Assert; -- xxxx should not be taken
// import org.junit.Assert;        -- should be used

public class AllStepDefinitions {
/*	
	@When("^I search for a product name$")
	public void i_search_for_a_product_name() throws InterruptedException
	{
		driver.findElement(By.id("search")).clear();
		driver.findElement(By.id("search")).sendKeys("Pink Check Shirt"); 
		driver.findElement(By.cssSelector("button[data-testid='searchButton']")).click();
        Thread.sleep(2000);

	}

	@When("^I select a product from displayed products$")
	public void i_select_a_product_from_displayed_products() throws Throwable {
		driver.findElement(By.cssSelector("a[title='Pink Check Shirt ']")).click();
        Thread.sleep(2000);
	}

	@Then("^I am Product details page$")
	public void i_am_Product_details_page() throws Throwable {
	    Assert.assertEquals("https://tuclothing.sainsburys.co.uk/p/Pink-Check-Shirt-/138038829-Pink?searchTerm=Pink%20Check%20Shirt:newArrivals&searchProduct=", driver.getCurrentUrl());
	}

	@When("^I select size and quantity$")
	public void i_select_quantity_and_size() throws Throwable {
		driver.findElements(By.cssSelector(".selectable")).get(5).click();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		WebElement qty = driver.findElement(By.cssSelector("#productVariantQty"));
		js.executeScript("arguments[0].scrollIntoView(true);",qty);
		Thread.sleep(3000);
		Select quantityDropdown = new Select(qty);
		quantityDropdown.selectByVisibleText("1");
	}

	@And("^I click on add to basket$")
	public void i_add_product_to_the_basket() throws Throwable {
		driver.findElement(By.cssSelector("#AddToCart")).click();
 
	}

	@Then("^I should see product added in the basket$")
	public void i_should_see_product_in_the_basket() throws Throwable {
		driver.findElement(By.cssSelector("#basket-title")).click();
		//basketValue=1 items
      //  String basketValue = driver.findElement(By.xpath("//span[@data-testid='cartTotal']")).getText();
	  //  Assert.assertTrue(basketValue.contains("1"));
		//driver.findElement(By.xpath("//span[@class='prod_info']//span[contains(text(),'Pink Check Shirt')]")).
		String prodName=driver.findElement(By.cssSelector(".prod_info span[class='prod_name']")).getText();
		Assert.assertTrue(prodName.contains("Pink Check Shirt"));
	    driver.close();
	    
	}
	
	@When("^I select size and multiple quantities$")
	public void i_select_size_and_multiple_quantities() throws InterruptedException
	{
		driver.findElements(By.cssSelector(".selectable")).get(5).click();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		WebElement qty = driver.findElement(By.cssSelector("#productVariantQty"));
		js.executeScript("arguments[0].scrollIntoView(true);",qty);
		Thread.sleep(3000);
		Select quantityDropdown = new Select(qty);
		quantityDropdown.selectByVisibleText("3");
	}
	
	@Then("^Product should add to the basket with multiple quantity$")
	public void product_should_add_to_the_basket_with_multiple_quantity()
	{
		driver.findElement(By.cssSelector("#basket-title")).click();
		//String prodName=driver.findElement(By.cssSelector(".prod_info span[class='prod_name']")).getText();
		//Assert.assertTrue(prodName.contains("Pink Check Shirt"));
		
		String quantityTxt = driver.findElement(By.xpath("//span[@class='prod_quantity']")).getText();
		System.out.println("quantityTxt : "+quantityTxt);
		Assert.assertTrue(quantityTxt.contains("3"));
	}
	
	@Then("^Add to basket should be disabled$")
	public void addToBasket_disabled() throws InterruptedException
	{
		JavascriptExecutor js =(JavascriptExecutor) driver;
		WebElement qty = driver.findElement(By.cssSelector("#productVariantQty"));
		js.executeScript("arguments[0].scrollIntoView(true);",qty);
		Thread.sleep(2000);
		boolean btnEnabled = driver.findElement(By.cssSelector("#AddToCart")).isEnabled();
		System.out.println(btnEnabled);
		Assert.assertFalse(btnEnabled);
        driver.close();
	}
*/
}

	
	
	
	
		
	

	

	

	
	
	
	
	
	
	
		
	

