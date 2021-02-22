package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseClass;

public class SearchResultsPage2 extends BaseClass{
	
	public void verifySearchWithValidInfo()
	{
		/*System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains(HomePage.validSearchText));*/
		wait.waitForMilliSeconds(3000);
		String st=driver.findElement(By.xpath("//h1")).getText();
		System.out.print(st);
		Assert.assertTrue(st.contains(HomePage.validSearchText));
		
	}

	public void verifySearchWithInValidInfo()
	{
		/*System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains(HomePage.invalidSearchText));*/
		
	}
	
	public void verifySearchResults_Valid(String searchResult)
	{
        System.out.println(" expexted : " +searchResult);
        System.out.println(" actual : " +driver.getTitle());
		Assert.assertEquals(searchResult, driver.getTitle());
	}
}

