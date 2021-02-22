package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.runner.BaseClass;
import com.stepDefinitions.HomePageStepDef;

public class ProductDetailsPage extends BaseClass{
	private static By SIZE = By.cssSelector(".selectable");
	private static By QUANTITY = By.cssSelector("#productVariantQty");
	private static By ADDTOBASKET = By.id("AddToCart");
	private static By BASKETTITLE = By.cssSelector("#basket-title");
	private static By CHECKOUT = By.xpath("//a[@data-testid='checkoutButton']");
	private static By PROCEEDTOCHECKOUT = By.cssSelector("#basketButtonTop");


	//a[@data-testid='checkoutButton']
	//private static By PRODUCTINBASKET = By.cssSelector(".prod_info span[class='prod_name']");
	//private static By PRODUCTINBASKET = By.xpath("//span[@class='prod_info']//span[contains(text(),'Pink Check Shirt')]");

	public void verifyProductDetailsPage()
	{
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/p/Pink-Check-Shirt-/138038829-Pink?searchTerm=Pink%20Check%20Shirt:newArrivals&searchProduct=", driver.getCurrentUrl());
	}
	
	public void addProductToBasket()
	{
	//	driver.findElements(By.cssSelector(".selectable")).get(5).click();
		driver.findElement(By.xpath("//div[@id='size-selector']//label[text()='10']")).click();
//		driver.findElements(SIZE).get(5).click();
		action.scrollToElement(QUANTITY);
        action.selectElement(QUANTITY,"1" );
        wait.waitForMilliSeconds(5000);
        try// feedback pop up
		{
			driver.findElement(By.xpath("//button[@aria-label='Close dialog']")).click();
		}
		catch(Exception e)
		{
		 	
		}
        action.clickOnElement(ADDTOBASKET);
        wait.waitForMilliSeconds(2000);
   	}
	
	public void verifyProductAddedInTheBasket()
	{
		String expected = SearchResultsPage.product_Name1;
		System.out.println("expected ="+expected);
		WebElement viewBasket = driver.findElement(BASKETTITLE);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",viewBasket);
		wait.waitForMilliSeconds(1000);
		viewBasket.click();
		wait.waitForMilliSeconds(1000);
	//	wait.waitForMilliSeconds(1000);
		//basketValue=1 items
      //  String basketValue = driver.findElement(By.xpath("//span[@data-testid='cartTotal']")).getText();
	  //  Assert.assertTrue(basketValue.contains("1"));
		//driver.findElement(By.xpath("//span[@class='prod_info']//span[contains(text(),'Pink Check Shirt')]")).
		//String actualProdName= get.getText(PRODUCTINBASKET);
		WebElement ele = driver.findElement(By.xpath("//span[@class='prod_info']//span[contains(text(),'Pink Check Shirt')]"));
        String actual = ele.getText();
        System.out.println("actual ="+actual);
		Assert.assertTrue(actual.contains(expected));
	}
		
	public void addToBasketIsDisabled()
	{
		action.scrollToElement(QUANTITY);
		boolean btnEnabled = driver.findElement(QUANTITY).isEnabled();
		System.out.println(btnEnabled);
		Assert.assertFalse(btnEnabled);
	}
	
	public void verifyMultipleProductsAddedToBasket()
	{
		String expected1 = SearchResultsPage.product_Name2;
		String expected2 = SearchResultsPage.product_Name1;
		System.out.println("expected1 ="+expected1);
		System.out.println("expected2 ="+expected2);
		WebElement viewBasket = driver.findElement(BASKETTITLE);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",viewBasket);
		wait.waitForMilliSeconds(1000);
		viewBasket.click();
		wait.waitForMilliSeconds(1000);
		WebElement ele1 = driver.findElement(By.xpath("//span[@class='prod_info']//span[contains(text(),'Mint Green Slouchy Jumper Dress')]"));
        String actual1 = ele1.getText();
		WebElement ele2 = driver.findElement(By.xpath("//span[@class='prod_info']//span[contains(text(),'Pink Check Shirt')]"));
        String actual2 = ele2.getText();
		System.out.println("actual1 ="+actual1);
		System.out.println("actual2 ="+actual2);
    	Assert.assertEquals(expected1,actual1);
		Assert.assertEquals(expected2,actual2);
		
	}
	
	public void clickOnCheckOut()
	{
      wait.waitForMilliSeconds(1000);		
      action.clickOnElement(CHECKOUT);
     /* try// feedback pop up
		{
			driver.findElement(By.xpath("//button[@aria-label='Close dialog']")).click();
		}
		catch(Exception e)
		{
		 	
		}*/
		
	}
	
	public void clickOnProceedToCheckout()
	{
	    action.clickOnElement(PROCEEDTOCHECKOUT);
	}

}



