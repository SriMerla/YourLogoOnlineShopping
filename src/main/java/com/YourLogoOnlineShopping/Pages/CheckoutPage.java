package com.YourLogoOnlineShopping.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.YourLogoOnlineShopping.Base.Base;

public class CheckoutPage extends Base {
WebDriver driver;
	
	public  CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public CheckoutPage() {
		
	}

	@FindBy(how=How.XPATH, using="//a[@title='Women']")
	public WebElement Click_Women;
	
	@FindBy(how=How.XPATH, using="/html/body/div/div[2]/div/div[3]/div[1]/div[1]/div/ul/li[1]/a")
	public WebElement Click_Tops;
	
	@FindBy(how=How.XPATH, using="//a[@title='T-shirts']//img[@class='replace-2x']")
	public WebElement Click_Tshirts;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Faded Short Sleeve T-shirts')]")
	public WebElement Click_FirstItem;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"add_to_cart\"]/button/span")
	public WebElement Click_AddToCart;
	
	@FindBy(how=How.XPATH, using="//a[@title='Proceed to checkout']//span")
	public WebElement Click_ProceedShipping;
	
	@FindBy(how=How.XPATH, using="//p[@class='cart_navigation clearfix']//span")
	public WebElement Click_ProceedSummary;
	
	@FindBy(how=How.XPATH, using="//button[@name='processAddress']//span")
	public WebElement Click_ProceedAddress;
	
	@FindBy(how=How.XPATH, using="//button[@name='processCarrier']//span")
	public WebElement Click_ProceedShippingCarrier;
	
	@FindBy(how=How.XPATH, using="//input[@id='cgv']")
	public WebElement Checkbox_TermsAndConditions;
	
	@FindBy(how=How.XPATH, using="//a[@title='Pay by check.']")
	public WebElement Click_PayCheck;
	
	@FindBy(how=How.XPATH, using="//p[@id='cart_navigation']//span")
	public WebElement Click_ConfirmOrder;
	
	@FindBy(how=How.XPATH, using="//p[@class='alert alert-success']")
	public WebElement ConfirmOrderMessage;
	
	
	public void WomenCategory() throws InterruptedException {
		
		Click_Women.click();
		Thread.sleep(4000);
		
	}
	
	public void TopsSubCategory() throws InterruptedException {
		Click_Tops.click();
		Thread.sleep(4000);
	}
	
	public void TShirtsSubCategory() throws InterruptedException {
		//JavascriptExecutor js = ((JavascriptExecutor) driver);
		//js.executeScript("scroll(0,300)");
		Click_Tshirts.click();
		Thread.sleep(4000);
	}
	
	public void SelectItem() throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		/*((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Click_FirstItem);
		Actions actions = new Actions(driver);
		actions.moveToElement(Click_FirstItem);
		actions.perform();		
		//js.executeScript("scroll(0,300)");
		  */
		js.executeScript("window.scrollBy(0,1000)");
		Click_FirstItem.click();
		Thread.sleep(4000);
	}
	
	public void AddToCart() throws InterruptedException {
		Thread.sleep(2000);
		//JavascriptExecutor js = ((JavascriptExecutor) driver);
		//js.executeScript("window.scrollBy(0,1000)");
		Click_AddToCart.click();
		Thread.sleep(2000);
		
	}
	
	public void PlaceTheOrder() throws InterruptedException {
		Click_ProceedShipping.click();
		Thread.sleep(4000);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,700)");
		Click_ProceedSummary.click();
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,700)");
		Click_ProceedAddress.click();
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,700)");
		Checkbox_TermsAndConditions.click();
		Thread.sleep(4000);
		Click_ProceedShippingCarrier.click();
		Thread.sleep(4000);
		
	}
    
	public void PayByCheck() throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,700)");
		Click_PayCheck.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,700)");
		Click_ConfirmOrder.click();
		Thread.sleep(2000);
    	
    }
	
	public void OrderConfirmationMessage() throws InterruptedException {
		
		String orderMsg = ConfirmOrderMessage.getText();
		System.out.println(orderMsg);
		Thread.sleep(4000);
	}


}
