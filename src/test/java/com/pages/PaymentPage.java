package com.pages;

import org.openqa.selenium.By;

import com.runner.BaseClass;

public class PaymentPage extends BaseClass{

	public static By  PAYMENTMETHOD= By.cssSelector("#differentCard");
	public static By  TITLE= By.cssSelector("#newTitle");
    public static By  FIRSTNAME= By.cssSelector("#newFirstName");
    public static By  SURNAME= By.cssSelector("#newSurname");
    public static By  CONTACTNUMBER= By.cssSelector("#newContactNumber");
    public static By  POSTCODE= By.cssSelector("#addressPostcode");
    public static By  FINDADDRESS= By.cssSelector("button[data-testid='findAddress']");
    public static By  ADDRESSLIST= By.cssSelector("#addressListView");
    public static By  TERMSANDCONDITIONS= By.cssSelector("label[for='termsAndConditionsId']");
    public static By  CONTPAYMENT= By.cssSelector("#contPayment");

	
	public void enterPaymentDetails() throws InterruptedException
	{
		action.clickOnElement(PAYMENTMETHOD);
		action.selectElement(TITLE,"Mr");
		action.sendText(FIRSTNAME,"SSSSS");
		action.sendText(SURNAME,"RRRR");
		action.sendText(CONTACTNUMBER,"07438928097");
		action.sendText(POSTCODE,"CB1 9YD");
		action.clickOnElement(FINDADDRESS);
        wait.waitForMilliSeconds(2000);
		action.selectElement(ADDRESSLIST,"5 Highdene Road");
        wait.waitForMilliSeconds(2000);
        action.clickOnElement(CONTPAYMENT);
			
	}
}
