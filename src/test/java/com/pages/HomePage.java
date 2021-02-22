package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.BaseClass;

// import for junit is from org.junit.Assert nt from junit.framework
public class HomePage extends BaseClass{

	private static By SERCHTEXTBOX = By.cssSelector("#search");
	private	static By SERCHTBUTTON = By.cssSelector(".button.searchButton");
	private static By STORELOCATORLINK = By.cssSelector("a[href='/store-finder']");
	public static String validSearchText = null;
	public static String invalidSearchText = null;
	public static By REGISTERLINK = By.linkText("Tu Log In / Register");
	public static By REGISTERBUTTON = By.xpath("//button[@data-testid='registerButton']");

	public void verifyHomePage() throws InterruptedException
	{
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/", driver.getCurrentUrl());
		Assert.assertEquals("Womens, Mens, Kids & Baby Fashion | Tu clothing", driver.getTitle());
	}
	
	public void searchWithValidData()
	{
		/*driver.findElement(SERCHTEXTBOX).clear();
		driver.findElement(SERCHTEXTBOX).sendKeys("Coats and Jackets"); 
		driver.findElement(SERCHTBUTTON).click();
		*/
		action.sendText(SERCHTEXTBOX, "Coats and Jackets");
		action.clickOnElement(SERCHTBUTTON);
		
		
	}
	
	public void searchWithInValidData()
	{
		/*driver.findElement(SERCHTEXTBOX).clear();
		driver.findElement(SERCHTEXTBOX).sendKeys("aaabbbcccnn"); 
		driver.findElement(SERCHTBUTTON).click();
		*/
		
		action.sendText(SERCHTEXTBOX, "aaabbbcccnn");
		action.clickOnElement(SERCHTBUTTON);
		
     }
	
	public void searchWithValidProductCategory()
	{
		action.sendText(SERCHTEXTBOX, "Kids");
		action.clickOnElement(SERCHTBUTTON);
	}
	
	public void searchWithInValidProductCategory()
	{
		action.sendText(SERCHTEXTBOX, "sdik");
		action.clickOnElement(SERCHTBUTTON);
	}
	
	public void searchWithValidProductNumber()
	{
		action.sendText(SERCHTEXTBOX, "138578551");
		action.clickOnElement(SERCHTBUTTON);
	}
	
	public void searchWithInValidProductNumber()
	{
		action.sendText(SERCHTEXTBOX, "11111111111");
		action.clickOnElement(SERCHTBUTTON);
	}
	
	public void searchWithBlankSearchTextField()
	{
		action.sendText(SERCHTEXTBOX, "");
		action.clickOnElement(SERCHTBUTTON);
	}
	
	public void searchWithSpecialCharecters()
	{
		action.sendText(SERCHTEXTBOX, "&&&***$$$$");
		action.clickOnElement(SERCHTBUTTON);
	}
	
	public void searchWithProductColour()
	{
		action.sendText(SERCHTEXTBOX, "Pink");
		action.clickOnElement(SERCHTBUTTON);
	}
	
	public void searchWithProductDescription()
	{
		action.sendText(SERCHTEXTBOX, "Yellow Oversized Knitted Top");
		action.clickOnElement(SERCHTBUTTON);
	}
	
	public void searchAProduct(String productNam)
	{
		action.sendText(SERCHTEXTBOX,productNam );
		action.clickOnElement(SERCHTBUTTON);
		wait.waitForMilliSeconds(3000);
	}
	
	public void clickOnStoreLocatorLink()
	{
		action.clickOnElement(STORELOCATORLINK);
		
	}
	
   public void searchWithValidInfo(String validData)
   {
	   validSearchText = validData;
	   action.sendText(SERCHTEXTBOX, validData);
	   action.clickOnElement(SERCHTBUTTON);
		wait.waitForMilliSeconds(3000);

   }
   
   public void searchWithInValidInfo(String invalidData)
   {
	   invalidSearchText = invalidData;
	   action.sendText(SERCHTEXTBOX, invalidData);
	   action.clickOnElement(SERCHTBUTTON);
	   wait.waitForMilliSeconds(3000);

   }
   
   public void clickOnRegisterLink()
   {
	   action.clickOnElement(REGISTERLINK);
	   action.clickOnElement(REGISTERBUTTON);
	   wait.waitForMilliSeconds(2000);

		
   }
}
