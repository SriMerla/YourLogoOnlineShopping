package StepDefinitions;

import com.YourLogoOnlineShopping.Base.Base;
import com.YourLogoOnlineShopping.Pages.CheckoutPage;
import com.YourLogoOnlineShopping.Pages.HomePage;
import com.YourLogoOnlineShopping.Pages.Loginpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;

public class EndToEndStepDefs extends Base {

	Loginpage LoginIntoPage;
	HomePage homepage;
	CheckoutPage checkoutPage;
	PageObjectManager pageObjectManager;


	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		intialize();
	}

	@When("^user enters valid username and password$")
	public void user_enters_valid_username_and_password() {
		pageObjectManager = new PageObjectManager(driver);
		LoginIntoPage = pageObjectManager.getLoginPage();
		LoginIntoPage.signInToWebPage("demoShopping@gmail.com", "test@123");
		//System.out.println("This is username and password ");
	}

	@Then("^user verifies the confirmaiton message$")
	public void user_verifies_the_confirmaiton_message() {
		LoginIntoPage = pageObjectManager.getLoginPage();
		LoginIntoPage.confirmationMessage();
	}

	@Given("^user is on home page$")
	public void user_is_on_home_page() throws InterruptedException {
		pageObjectManager = new PageObjectManager(driver);
		homepage = pageObjectManager.getHomePage();
		homepage.YourLogoHome();
		Thread.sleep(4000);
		System.out.println("User is on HomePage");
	}

	@When("^user chooses WOMEN category$")
	public void user_chooses_WOMEN_category() throws InterruptedException {
		checkoutPage = pageObjectManager.getCheckoutPage();
		checkoutPage.WomenCategory();
		Thread.sleep(2000);
	}

	@When("^user chooses TOP'S subcategory$")
	public void user_chooses_TOP_S_subcategory() throws InterruptedException {
		checkoutPage = pageObjectManager.getCheckoutPage();
		checkoutPage.TopsSubCategory();
		Thread.sleep(2000);
	}

	@When("^user chooses T-SHIRTS subcategory$")
	public void user_chooses_T_SHIRTS_subcategory() throws InterruptedException {
		checkoutPage = pageObjectManager.getCheckoutPage();
		checkoutPage.TShirtsSubCategory();
		Thread.sleep(2000);
	}

	@When("^user chooses first item to buy$")
	public void user_chooses_first_item_to_buy() throws InterruptedException {
		checkoutPage = pageObjectManager.getCheckoutPage();
		checkoutPage.SelectItem();
		Thread.sleep(2000);
	}

	@When("^user moves the selected item to cart$")
	public void user_moves_the_selected_item_to_cart() throws InterruptedException {
		checkoutPage = pageObjectManager.getCheckoutPage();
		checkoutPage.AddToCart();
		Thread.sleep(2000);
	}

	@When("^user checkout from cart$")
	public void user_checkout_from_cart() throws InterruptedException {
		checkoutPage = pageObjectManager.getCheckoutPage();
		checkoutPage.PlaceTheOrder();
		Thread.sleep(4000);
	}

	@When("^user selects payment method to confirm order$")
	public void user_selects_payment_method_to_confirm_order() throws InterruptedException {
		checkoutPage = pageObjectManager.getCheckoutPage();
		checkoutPage.PayByCheck();
		Thread.sleep(2000);
	}

	@Then("^user verifies the order confirmation message$")
	public void user_verifies_the_order_confirmation_message() throws InterruptedException {
		checkoutPage = pageObjectManager.getCheckoutPage();
		checkoutPage.OrderConfirmationMessage();
		Thread.sleep(2000);
		homepage = pageObjectManager.getHomePage();
		homepage.Logout();
		Thread.sleep(2000);
		tearDown();
		
	}

	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws InterruptedException {
		pageObjectManager = new PageObjectManager(driver);
		homepage = pageObjectManager.getHomePage();
		homepage.YourLogoHome();
		System.out.println("User is again on HomePage");
		Thread.sleep(2000);
	
	}

	@When("^user clicks signout button$")
	public void user_clicks_signout_button() throws InterruptedException {
		homepage = pageObjectManager.getHomePage();
		homepage.Logout();
		Thread.sleep(4000);
	}

	@Then("^user verifies Logout confirmaiton message$")
	public void user_verifies_Logout_confirmaiton_message() throws InterruptedException {
		homepage = pageObjectManager.getHomePage();
		homepage.LogoutconfimationMsg();
		System.out.println("User Logged Out Successfully");
		Thread.sleep(1000);
		tearDown();
	}

}
