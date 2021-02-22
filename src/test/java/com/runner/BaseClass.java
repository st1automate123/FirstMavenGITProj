package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.driver.Action;
import com.driver.Get;
import com.driver.Wait;
import com.pages.BasketPage;
import com.pages.CheckoutPage;
import com.pages.FindStorePage;
import com.pages.HomePage;
import com.pages.PaymentPage;
import com.pages.ProductDetailsPage;
import com.pages.RegisterPage;
import com.pages.SearchResultsPage;
import com.pages.SearchResultsPage2;
import com.pages.StoreLocatorPage;

public class BaseClass {
	
	public static WebDriver driver;
	public static HomePage homePage = new HomePage();
	public static SearchResultsPage  searchResultsPage = new SearchResultsPage();
	public static Action action = new Action();
	public static Get get = new Get();
	public static Wait wait = new Wait();
	public static ProductDetailsPage productDetailsPage = new ProductDetailsPage();
	public static StoreLocatorPage storeLocatorPage = new StoreLocatorPage();
	public static SearchResultsPage2 searchResultsPage2 = new SearchResultsPage2();
	public static RegisterPage registerPage = new RegisterPage();
	public static BasketPage basketPage = new BasketPage();
    public static CheckoutPage checkoutPage = new CheckoutPage();
    public static FindStorePage findStorePage = new FindStorePage();
    public static PaymentPage paymentPage = new PaymentPage();

	
	
	
/*	Select quantityDropdown = new Select(qty);
	quantityDropdown.selectByVisibleText("2");
	driver.findElement(By.cssSelector("#AddToCart")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#cart_button")).click();
	driver.findElement(By.cssSelector("#basketButtonTop")).click();
	driver.findElement(By.cssSelector("#guest_email")).clear();
    driver.findElement(By.cssSelector("#guest_email")).sendKeys("swa3333.testing@gmail.com");
	driver.findElement(By.cssSelector("button[data-testid='guest_checkout']")).click();
	driver.findElement(By.cssSelector("label[for='CLICK_AND_COLLECT']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[data-testid='continue']")).click();
	driver.findElement(By.cssSelector("#lookup")).clear();
	driver.findElement(By.cssSelector("#lookup")).sendKeys("CB1 9YD");
	driver.findElement(By.cssSelector("span[data-testid='button-text']")).click();
    Thread.sleep(2000);
	driver.findElements(By.cssSelector("button[data-testid='select-store']")).get(1).click();
	driver.findElement(By.cssSelector("button[data-testid='submit-button']")).click(); // proceedtosummary
	//driver.findElement(By.cssSelector("#guest_email")).sendKeys("swa3333.testing@gmail.com");
	//driver.findElement(By.cssSelector("button[data-testid='guest_checkout']")).click();
	driver.findElement(By.cssSelector("button[data-testid='submit-button']")).click(); //proceedtopayment
	driver.findElement(By.cssSelector("#differentCard")).click();
	
	WebElement title = driver.findElement(By.cssSelector("#newTitle"));
	Select titleDropDown = new Select(title);
	titleDropDown.selectByVisibleText("Mr");
	driver.findElement(By.cssSelector("#newFirstName")).sendKeys("SSSS");
	driver.findElement(By.cssSelector("#newSurname")).sendKeys("RRRRR");
	driver.findElement(By.cssSelector("#newContactNumber")).sendKeys("07438928097");
	driver.findElement(By.cssSelector("#addressPostcode")).sendKeys("CB1 9YD");
	driver.findElement(By.cssSelector("button[data-testid='findAddress']")).click();
	Thread.sleep(2000);
	WebElement addressList = driver.findElement(By.cssSelector("#addressListView"));
	Select addressDropDown = new Select(addressList);
	addressDropDown.selectByVisibleText("5 Highdene Road");
	//driver.findElement(By.cssSelector("label[for='contactPreferencesId']")).click();
	driver.findElement(By.cssSelector("label[for='termsAndConditionsId']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("#contPayment")).click();
	Thread.sleep(3000);
	driver.close();

	
	
	
	driver.findElement(By.xpath("//a[@data-testid='checkoutButton']")).click();
	driver.findElement(By.xpath("//a[@id='basketButtonTop']")).click();
	driver.findElement(By.xpath("//input[@id='guest_email']")).clear();
    driver.findElement(By.xpath("//input[@id='guest_email']")).sendKeys("swa3333.testing@gmail.com");
	driver.findElement(By.xpath("//button[@data-testid='guest_checkout']")).click();
	driver.findElement(By.xpath("//label[@for='CLICK_AND_COLLECT']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-testid='continue']")).click();
	driver.findElement(By.xpath("//input[@id='lookup']")).clear();
	driver.findElement(By.xpath("//input[@id='lookup']")).sendKeys("CB1 9YD");
	driver.findElement(By.xpath("//span[@data-testid='button-text']")).click();
    Thread.sleep(2000);
	driver.findElements(By.xpath("//button[@data-testid='select-store']")).get(1).click();
	driver.findElement(By.xpath("//button[@data-testid='submit-button']")).click(); // proceedtosummary
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@data-testid='submit-button']")).click(); //proceedtopayment
	driver.findElement(By.xpath("//a[@data-testid='payWithCard']")).click();
	WebElement title = driver.findElement(By.xpath("//select[@id='newTitle']"));
	Select titleDropDown = new Select(title);
	titleDropDown.selectByVisibleText("Mr");
	driver.findElement(By.xpath("//input[@id='newFirstName']")).sendKeys("SSSS");
	driver.findElement(By.xpath("//input[@id='newSurname']")).sendKeys("RRRRR");
	driver.findElement(By.xpath("//input[@id='newContactNumber']")).sendKeys("07438928097");
	driver.findElement(By.xpath("//input[@id='addressPostcode']")).sendKeys("CB1 9YD");
	driver.findElement(By.xpath("//button[@data-testid='findAddress']")).click();
	Thread.sleep(2000);
	WebElement addressList = driver.findElement(By.xpath("//select[@id='addressListView']"));
	Select addressDropDown = new Select(addressList);
	addressDropDown.selectByVisibleText("5 Highdene Road");
	driver.findElement(By.xpath("//label[@for='termsAndConditionsId']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='contPayment']")).click();
	Thread.sleep(3000);
	driver.close();
*/
	
	
	
}
