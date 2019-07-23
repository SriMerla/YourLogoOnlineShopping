package managers;

import org.openqa.selenium.WebDriver;

import com.YourLogoOnlineShopping.Pages.CheckoutPage;
import com.YourLogoOnlineShopping.Pages.HomePage;
import com.YourLogoOnlineShopping.Pages.Loginpage;
import com.YourLogoOnlineShopping.Pages.SearchPage;
import com.YourLogoOnlineShopping.Pages.RegisterPage;

public class PageObjectManager {
	
	public WebDriver driver;

	public Loginpage LoginIntoPage;

	public HomePage homePage;

	public SearchPage searchPage;

    public CheckoutPage checkoutPage;

	public RegisterPage registerPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		
		return(homePage == null) ? homePage = new HomePage(driver) : homePage;
	}
	
	public Loginpage getLoginPage() {
		
		return(LoginIntoPage == null) ? LoginIntoPage = new Loginpage(driver) : LoginIntoPage;
	}
	
	public CheckoutPage getCheckoutPage() {
		
		return(checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;
	}
	
	public RegisterPage getRegisterPage() {
		
		return (registerPage == null) ? registerPage = new RegisterPage(driver) : registerPage;
	}
	
	public SearchPage getSearchPage() {
		
		return(searchPage == null) ? searchPage = new SearchPage(driver) : searchPage;
	}


}
