package com.YourLogoOnlineShopping.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.YourLogoOnlineShopping.Base.Base;

public class HomePage extends Base {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(how=How.XPATH, using="/html/body/div/div[1]/header/div[3]/div/div/div[1]/a/img")
	WebElement YourLogo;
	
	@FindBy(how=How.XPATH, using="//a[@title='Contact Us']")
	WebElement ContactUs;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Demo Tony')]")
	WebElement DemoTony;
	
	@FindBy(how=How.XPATH, using="//input[@id='search_query_top']")
	WebElement SearchBar;
	
	@FindBy(how=How.XPATH, using="//a[@title='View my shopping cart']")
	WebElement ShoppingCart;
	
	@FindBy(how=How.XPATH, using="//a[@title='Log me out']")
	WebElement SignOut;
	
	@FindBy(how=How.XPATH, using="//a[@title='Log in to your customer account']")
	WebElement SignoutMessage;
	
	public void YourLogoHome() {
		
		YourLogo.click();
	}
	
	public void ForContact() throws InterruptedException {
		
		ContactUs.click();
		Thread.sleep(4000);
		driver.navigate().back();
		
	}
	
	public void DemoTonyAccount() throws InterruptedException {
		
		DemoTony.click();
		Thread.sleep(4000);
		driver.navigate().back();
	}
	 
	public void SearchBarTab(String Item) throws InterruptedException {
		
		SearchBar.click();
		SearchBar.sendKeys(Item);
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		
		
	}
	
	public void Cart() {
		
		boolean cartEnable = ShoppingCart.isEnabled();
		System.out.println(cartEnable);
		
	}
	
	public void Logout() {
		SignOut.click();
		
	}
	
	public void LogoutconfimationMsg() {
		
		boolean SignoutMsg = SignoutMessage.isDisplayed();
		System.out.println(SignoutMsg);
		
	}
	
	}
