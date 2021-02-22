package com.pages;

import org.openqa.selenium.By;

import com.runner.BaseClass;

public class OrderSummaryPage extends BaseClass{

	private static By PROCEEDTOSUMMARY = By.cssSelector("button[data-testid='submit-button']");

	public void clickOnProceedToPayment()
	{
		action.clickOnElement(PROCEEDTOSUMMARY);
	}
}
