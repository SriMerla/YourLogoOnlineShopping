package StepDefinitions;

import com.YourLogoOnlineShopping.Base.Base;
import com.YourLogoOnlineShopping.Pages.HomePage;
import com.YourLogoOnlineShopping.Pages.Loginpage;
import com.YourLogoOnlineShopping.Pages.SearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;

public class SearchBarStepDefs extends Base {
	
	PageObjectManager pageObjectManager; 
	Loginpage LoginIntoPage;
	HomePage homepage;
	SearchPage searchPage;

	
	@Given("^user is on searchbar page$")
	public void user_is_on_searchbar_page() throws InterruptedException {
		
		intialize();
		Thread.sleep(4000);
		pageObjectManager = new PageObjectManager(driver);
		LoginIntoPage = pageObjectManager.getLoginPage();
		LoginIntoPage.signInToWebPage("demoShopping@gmail.com", "test@123");
		Thread.sleep(2000);
		homepage = pageObjectManager.getHomePage();
		homepage.YourLogoHome();
		Thread.sleep(4000);
		System.out.println("User is on HomePage");
	}
	
	@When("^user enters item name in search bar$")
	public void user_enters_item_name_in_search_bar() throws InterruptedException  {
		searchPage = pageObjectManager.getSearchPage();
		searchPage.EnterINSearchTab("dress");
		
	   
	}

	@Then("^user checks the search results in dropdown$")
	public void user_checks_the_search_results_in_dropdown()  {
		searchPage = pageObjectManager.getSearchPage();
		searchPage.ListOfItemsDisplayed();
	    
	}

	@Then("^user enters an item from search result dropdown$")
	public void user_enters_an_item_from_search_result_dropdown() {
		searchPage = pageObjectManager.getSearchPage();
		searchPage.SelectAnItem("Summer Dresses > Printed Chiffon Dress");
		
	    
	}

	@Then("^user verifies the selected item is displayed$")
	public void user_verifies_the_selected_item_is_displayed()  {
		searchPage = pageObjectManager.getSearchPage();
		searchPage.ItemDisplayedConfirm();
		tearDown();
	}


}
