package com.pages;

import org.openqa.selenium.By;

import com.runner.BaseClass;

public class FindStorePage extends BaseClass {

	private static By LOOKUPTXTBOX = By.cssSelector("#lookup");
	private static By LOOKUPBTN = By.cssSelector("span[data-testid='button-text']");
	private static By SELECTSTORE = By.cssSelector("button[data-testid='select-store']");
	private static By PROCEEDTOSUMMARY = By.cssSelector("button[data-testid='submit-button']");

	
	public void lookupForAndSelectNearestStore()
	{
	 action.sendText(LOOKUPTXTBOX, "CB1 9YD");	
	 action.clickOnElement(LOOKUPBTN);
	 wait.waitForMilliSeconds(3000);
     driver.findElements(SELECTSTORE).get(1).click();
     action.clickOnElement(PROCEEDTOSUMMARY);
	}

	

	
}
