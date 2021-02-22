package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseClass;

import cucumber.api.java.en.Then;

public class SearchResultsPage extends BaseClass{

	private static By BLANK_SEARCH = By.cssSelector("span[title='Please complete a product search']");
	private static By PRODUCTTITLE1 = By.cssSelector("a[title='Pink Check Shirt ']");
	private static By PRODUCTTITLE2 = By.cssSelector("a[title='Mint Green Slouchy Jumper Dress']");
    public static String product_Name1=null;
    public static String product_Name2=null;

    public void verifySearchResults()
	{
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/search?text=Coats+and+Jackets", driver.getCurrentUrl());
	    Assert.assertEquals("Search results for: Coats and Jackets | Tu clothing", driver.getTitle());
	}
    
	public void verifyNoResultsFoundPage1()
	{
		Assert.assertEquals("Search results for: aaabbbcccnn | Tu clothing", driver.getTitle());
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/search?text=aaabbbcccnn", driver.getCurrentUrl());
	}
	
	public void verifyRelatedCategoryProducts()
	{
		Assert.assertEquals("Kids Clothes | Children's Fashion | Tu Clothing", driver.getTitle());
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/c/kids/kids?INITD=GNav-CW-Header&", driver.getCurrentUrl());
	}
	
	public void verifyRandomCategoryProducts()
	{
	  Assert.assertEquals("https://tuclothing.sainsburys.co.uk/search?text=sdik", driver.getCurrentUrl());
	}
	
	public void verifyProductNumberRelatedProduct()
	{
		Assert.assertEquals("Search results for: 138578551 | Tu clothing", driver.getTitle());	
	}
	
	public void verifyNoResultsFoundPage2()
	{
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/search?text=11111111111", driver.getCurrentUrl());

	}
	
	public void verifyErrorMsgBlankSearch() {
	/*	String str = driver.findElement(By.cssSelector("span[title='Please complete a product search']")).getText();
		 Assert.assertEquals("Please complete a product search", str);*/
		Assert.assertEquals("Please complete a product search", get.getText(BLANK_SEARCH));
	}
	
	public void verifyRandomnProducts() {
	  Assert.assertEquals("Search results for: &&&***$$$$ | Tu clothing",driver.getTitle());
	  }
	
	public void verifyProductsWithColour() {
		 Assert.assertEquals("Search results for: Pink | Tu clothing",driver.getTitle());
       }
	
	public void verifyProductDescription() {
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/search?text=Yellow+Oversized+Knitted+Top",driver.getCurrentUrl() );
	}
	
	public void selectProduct1()
	{
        action.clickOnElement(PRODUCTTITLE1);
		wait.waitForMilliSeconds(2000);
	}
	
	public void selectProduct2()
	{
        action.clickOnElement(PRODUCTTITLE2);
		wait.waitForMilliSeconds(2000);
	}
	
	public void selectOneOfTheProduct(String productName)
	{
		if(productName.equals("Pink Check Shirt"))
		{		
			product_Name1 = productName;
			selectProduct1();
		}	
		else if(productName.equals("Mint Green Slouchy Jumper Dress"))
		{
			product_Name2 = productName;
			selectProduct2();
		}
		
	}
	
}


