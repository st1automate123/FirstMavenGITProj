package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.runner.BaseClass;


public class BasketPage extends BaseClass{

	private static By BASKETTITLE = By.cssSelector("#basket-title");
	private static By MESSAGE1 = By.cssSelector("#globalMessages p");
	
	public void verifyBasketPageIsDisplayed()
	{
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/cart", driver.getCurrentUrl());
	}

	public void deleteAproductFromBasketPage()
	{
        wait.waitForMilliSeconds(8000);
        try// feedback pop up
		{
			driver.findElement(By.xpath("//button[@aria-label='Close dialog']")).click();
		}
		catch(Exception e)
		{
		 	
		}
		driver.findElement(By.xpath("//a[@id='RemoveProduct_1']")).click();
		//WebElement viewBasket = driver.findElement(By.xpath("//h2[@id='basket-title']"));
	}
	
	public void clickOnBasket()
	{
		WebElement viewBasket = driver.findElement(BASKETTITLE);
		action.scrollToElement(BASKETTITLE);		
        wait.waitForMilliSeconds(3000);
        action.clickOnElement(BASKETTITLE);
	}
	
	public void verifyProductDeletedMessage()
	{
		String str = get.getText(MESSAGE1);
		Assert.assertTrue(str.contains("Product has been removed"));
	}
	
		
	}
