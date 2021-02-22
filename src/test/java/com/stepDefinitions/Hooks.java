package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import com.runner.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	public static String BASE_URL = "https://tuclothing.sainsburys.co.uk/";
	public static String driverPath = "C:\\2020_Testing\\Automation\\chromedriver.exe";
	public static By COOKIE = By.cssSelector("#consent_prompt_submit");
	
	@Before
	public void start() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",driverPath );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BASE_URL);
		Thread.sleep(3000);
		//wait.waitForMilliSeconds(3000);
		driver.findElement(COOKIE).click();
		
		/*ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BASE_URL);
		Thread.sleep(3000);
		driver.findElement(COOKIE).click();*/
	}
		
	
	@After
	public void close()
	{
		driver.close();
	}
	

	
	
}
