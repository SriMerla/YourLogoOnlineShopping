package StepDefinitions;

import org.openqa.selenium.WebElement;

import com.YourLogoOnlineShopping.Base.Base;
import com.YourLogoOnlineShopping.Pages.Loginpage;
import com.YourLogoOnlineShopping.Pages.RegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;

public class RegisterStepDefs extends Base {
	
	PageObjectManager pageObjectManager; 
	RegisterPage registerPage;
	Loginpage LoginIntoPage;
	WebElement webElement;
	
	@Given("^user is on YourLogo webpage$")
	public void user_is_on_YourLogo_webpage() {
		intialize();
		System.out.println("User is on YourLogo webpage");	    
	}

	@When("^user enters new email addrress$")
	public void user_enters_new_email_addrress() throws InterruptedException  {
		pageObjectManager = new PageObjectManager(driver);
		registerPage = pageObjectManager.getRegisterPage();
		registerPage.CreateNewAccount("demoshop@gmail.com");
		System.out.println("New email id is entered by user");
	    
	}

	@When("^user selects title$")
	public void user_selects_title() throws Throwable {
		registerPage = pageObjectManager.getRegisterPage();
		registerPage.GenderTitle();
	}

	@When("^user enters \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_enters_as(String fieldName, String value) throws Throwable {
		registerPage = pageObjectManager.getRegisterPage();
		switch(fieldName) 
		{ 
		case "firstname": webElement = registerPage.FirstName; break; 
		case "lastname": webElement = registerPage.LastName; break;
		case "password": webElement = registerPage.AccountPassword; break;
		case "address": webElement = registerPage.Address; break; 
		case "city": webElement = registerPage.City; break; 
		case "addressFirstname": webElement = registerPage.Address_FirstName; break; 
		case "addressLastname": webElement = registerPage.Address_LastName; break; 
		case "companyName": webElement = registerPage.Address_CompanyName; break; 
		case "zipcode": webElement = registerPage.ZipCode; break; 
		case "mobilephone": webElement = registerPage.Phone; break; 
		case "futureReference": webElement = registerPage.AdditionalInfo; break; 
		}
		webElement.sendKeys(value); 
		
	}    
	
	@When("^user enters date of birth$")
	public void user_enters_date_of_birth() throws Throwable {
	    registerPage = pageObjectManager.getRegisterPage();
	    registerPage.DateOfBirth();
	}

	@When("^user enters state$")
	public void user_enters_state() {
	    registerPage = pageObjectManager.getRegisterPage();
	    registerPage.stateName();
	}

	@When("^user clicks register button$")
	public void user_clicks_register_button() {
		 registerPage = pageObjectManager.getRegisterPage();
		 registerPage.RegisterButton.click();
	    
	}

	@Then("^useris on account page$")
	public void useris_on_account_page() {
		LoginIntoPage = pageObjectManager.getLoginPage();		
	   LoginIntoPage.confirmationMessage();
	}

	@Then("^user verifies register confimation message$")
	public void user_verifies_register_confimation_message()  {
		System.out.println("user verified confirmation message");
		tearDown();
	    
	}

	/*
	
	 * 
	 * @When("^user enters \"(.*?)\" as \"(.*?)\"$") public void
	 * user_enters_stringfield(String fieldName,String value) { registerPage =
	 * pageObjectManager.getRegisterPage(); WebElement webElement = null;
	 * 
	 * switch(fieldName) { case "FirstName": webElement = registerPage.FirstName;
	 * break; case "LastName": webElement = registerPage.FirstName; break; case
	 * "address": webElement = registerPage.FirstName; break; case "city":
	 * webElement = registerPage.FirstName; break; case "state": webElement =
	 * registerPage.FirstName; break; }
	 * 
	 * webElement.sendKeys(value); }
	*/
}
