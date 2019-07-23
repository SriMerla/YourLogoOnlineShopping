package com.YourLogoOnlineShopping.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.YourLogoOnlineShopping.Base.Base;

public class RegisterPage extends Base{
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='email_create']")
	WebElement NewEmail;
	
	@FindBy(how=How.XPATH, using=" //button[@id='SubmitCreate']//span")
	WebElement SubmitCreateButton;
	
	@FindBy(how=How.XPATH, using="//input[@id='id_gender1']")
	WebElement GenderMr;
	
	@FindBy(how=How.XPATH, using="//input[@id='id_gender2']")
	WebElement GenderMrs;
	
	@FindBy(how=How.XPATH, using="//input[@id='customer_firstname']")
	public WebElement FirstName;
	
	@FindBy(how=How.XPATH, using="//input[@id='customer_lastname']")
	public WebElement LastName;
	
	@FindBy(how=How.XPATH, using="//input[@id='passwd']")
	public WebElement AccountPassword;
	
	@FindBy(how=How.XPATH, using="//*[@id=\'days\']")
	public WebElement DropDown_Days;
	
	@FindBy(how=How.XPATH, using="//select[@id='months']")
	public WebElement DropDown_Months;
	
	@FindBy(how=How.XPATH, using="//select[@id='years']")
	public WebElement DropDown_years;
	
	
	@FindBy(how=How.XPATH, using="//input[@id='firstname']")
	public WebElement Address_FirstName;
	
	@FindBy(how=How.XPATH, using="//*[@id=\'lastname\']")
	public WebElement Address_LastName;
	
	@FindBy(how=How.XPATH, using="//input[@id='company']")
	public WebElement Address_CompanyName;
	
	
	@FindBy(how=How.XPATH, using="//input[@id='address1']")
	public WebElement Address;
	
	@FindBy(how=How.XPATH, using="//input[@id='city']")
	public WebElement City;
	
	@FindBy(how=How.XPATH, using="//select[@id='id_state']")
	WebElement DropDown_state;
	
	@FindBy(how=How.XPATH, using="//input[@id='postcode']")
	public WebElement ZipCode;
	
	@FindBy(how=How.XPATH, using="//input[@id='phone_mobile']")
	public WebElement Phone;
	
	@FindBy(how=How.XPATH, using="//input[@id='alias']")
	public WebElement AdditionalInfo;
	
	@FindBy(how=How.XPATH, using="//button[@id='submitAccount']//span")
	public WebElement RegisterButton;
	
	@FindBy(how=How.XPATH, using="//p[@class='info-account']")
	public WebElement RegisterConfirmMsg;
	
	public void CreateNewAccount(String New_Email) throws InterruptedException {
		
		NewEmail.sendKeys(New_Email);
		Thread.sleep(2000);
		SubmitCreateButton.click();
	}
	
	public void GenderTitle() {
		boolean Mr = GenderMr.isSelected();
		if(Mr == false) {
			GenderMr.click();
		}
		else {
			GenderMrs.click();
		}
	}
	
	/*
	 * public void PersonalInformation(String firstname, String lastname, String
	 * pwd) throws InterruptedException {
	 * 
	 * FirstName.sendKeys(firstname); Thread.sleep(2000);
	 * LastName.sendKeys(lastname); AccountPassword.sendKeys(pwd);
	 * Thread.sleep(2000); }
	 */
		
	public void DateOfBirth() throws InterruptedException {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,700)");
		Select day = new Select(DropDown_Days);
		day.selectByValue("10");
		Thread.sleep(2000);
		Select month = new Select(DropDown_Months);
		month.selectByIndex(5);
		Thread.sleep(2000);
		Select year = new Select(DropDown_years);
		year.selectByValue("1996");
		Thread.sleep(2000);
	}
	
	public void YourAddressInformation(String first, String last, String comp, String addr, String city, String zipcode, String phone, String infomail ) {
		
		Address_FirstName.sendKeys(first);
		Address_LastName.sendKeys(last);
		Address_CompanyName.sendKeys(comp);
		Address.sendKeys(addr);
		City.sendKeys(city);
	}
	
	public void stateName() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,700)");
		Select state = new Select(DropDown_state);
		state.selectByIndex(5);
		//ZipCode.sendKeys(zipcode);
		//Phone.sendKeys(phone);
		//AdditionalInfo.sendKeys(infomail);
		//RegisterButton.click();
	}
	
	public void AccountConfirmMsg() {
		
		String registerConfirmMessage = RegisterConfirmMsg.getText();
		System.out.println(registerConfirmMessage);
	}

}
