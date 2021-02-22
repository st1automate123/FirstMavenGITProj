package com.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.runner.BaseClass;

public class StoreLocatorPage extends BaseClass{
	
   /* driver.findElement(By.cssSelector("#tuStoreFinderForm .ln-c-button--primary")).click();*/
	private static By POSTCODETOWN = By.cssSelector("input[placeholder='Postcode or town']");
	private static By FINDSTORES = By.xpath("//button[contains(text(),'Find stores')]");
	private static By ERRORMESSAGE = By.cssSelector("#globalMessages p");
	private static By NEARESTSTORES = By.cssSelector("#header1");
    public static String postCode = null;
    
    public void verifyStoreLocatorPage()
    {
 	   Assert.assertEquals("https://tuclothing.sainsburys.co.uk/store-finder", driver.getCurrentUrl());
    }
    
    public void enterPostCodeOrTown(String postCodeValue)
    {
    	postCode = postCodeValue;
    	action.sendText(POSTCODETOWN, postCodeValue);
    }
    
    public void clickOnFindStores()
    {
    	action.clickOnElement(FINDSTORES);
    	wait.waitForMilliSeconds(2000);
    }
    
    public void verifyNearestStores()
    {
      System.out.println("Entered postcode : "+postCode);
      
      action.scrollToElement(NEARESTSTORES);
      Assert.assertTrue((driver.getTitle()).contains(postCode));
    }
    
    public void verifyWarningMessage_EnterPostCodeTown()
    {
      String message = get.getText(ERRORMESSAGE);	
      Assert.assertTrue(message.contains("Sorry, no results found for your search"));
    }
}

