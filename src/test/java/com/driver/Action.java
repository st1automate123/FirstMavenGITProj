package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.runner.BaseClass;

public class Action extends BaseClass{
	
	public void clickOnElement(By element)
	{
		driver.findElement(element).click();
	}
	
	public void sendText(By element, String text)
	{
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(text);
	}
	
	public void scrollToElement(By byElement)
	{
		JavascriptExecutor js =(JavascriptExecutor) driver;
		WebElement webEle = driver.findElement(byElement);
		js.executeScript("arguments[0].scrollIntoView(true);",webEle);
        wait.waitForMilliSeconds(2000);		
	}
	
	public void selectElement(By byEle, String qty)
	{
		WebElement webEle = driver.findElement(byEle);
		Select elementDropdown = new Select(webEle);
		elementDropdown.selectByVisibleText(qty);
	}
	
}


