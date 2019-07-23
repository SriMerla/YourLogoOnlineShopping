package com.YourLogoOnlineShopping.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import com.YourLogoOnlineShopping.Base.Base;

public class Loginpage extends Base {
	
	@FindBy(how=How.XPATH, using ="//*[@id=\'email\']") 
	public WebElement userEmail;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\'passwd\']")
	public WebElement Password;
	
	@FindBy(how=How.XPATH, using="//*[@id=\'SubmitLogin\']")
	public WebElement SubmitButton;
	
	@FindBy(how=How.XPATH, using="/html/body/div/div[2]/div/div[3]/div/p")
	public WebElement ConfirmMessage;
	
	WebDriver driver;
	public  Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	

	
	
	public void signInToWebPage(String Email, String Pass) {
		userEmail.sendKeys(Email);
		Password.sendKeys(Pass);
		SubmitButton.click();	
		
	}
	
	public void confirmationMessage() {
		
		String Message = ConfirmMessage.getText();
		System.out.println(Message);
		//Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", Message);
	
	}
	

	

}
