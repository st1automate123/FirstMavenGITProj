package com.pages;

import org.openqa.selenium.By;

import com.runner.BaseClass;

public class CheckoutPage extends BaseClass{
	
	private static By EMAILADDRESS = By.cssSelector("#guest_email");
	private static By GUESTCHECKOUTBTN = By.cssSelector("button[data-testid='guest_checkout']");
	private static By CLICKANDCOLLECT = By.cssSelector("label[for='CLICK_AND_COLLECT']");
	private static By HOMEDELIVERY;
	private static By CONTINUEBTN = By.cssSelector("input[data-testid='continue']");


	public void enterGuestEmailAdrress()
	{
		action.sendText(EMAILADDRESS,"a11.test@gmail.com");
	}
	
	public void clickOnGuestEmailButton()
	{
		action.clickOnElement(GUESTCHECKOUTBTN);
	}
	
	public void selectDeliveryOption_clickAndCollect()
	{
		action.clickOnElement(CLICKANDCOLLECT);
        wait.waitForMilliSeconds(2000);
        action.clickOnElement(CONTINUEBTN);
	}
	
	
	
	

}
