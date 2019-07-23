package com.YourLogoOnlineShopping.Pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.YourLogoOnlineShopping.Base.Base;



public class SearchPage extends Base {
 
	WebDriver driver;
	int itemSize, realSize;
	
	
	@FindBy(how=How.XPATH, using="//input[@id='search_query_top']")
	WebElement SearchTab;
	
	@FindBy(how=How.XPATH, using="//button[@name='submit_search']")
	WebElement SearchButton;
	
	@FindBy(how=How.XPATH, using="//*[contains(@class,'ac_')]")
	List<WebElement> DropDown_SearchList;
	
	@FindBy(how=How.XPATH, using="/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/h1")
	WebElement DisplayItem;
	
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void EnterINSearchTab(String itemName) throws InterruptedException {
		boolean tab = SearchTab.isDisplayed();
		System.out.println("Search Tab Displayed On WebPagee "+ tab);
		SearchTab.sendKeys(itemName);
		Thread.sleep(4000);
		
	}
	
	public void ListOfItemsDisplayed() {
		itemSize = DropDown_SearchList.size();
		realSize = itemSize-2;
		System.out.println("Number of items Listed in the DropDown : " + realSize);
	}
    
	public void SelectAnItem(String Selecteditem) {
		
		for(int i=0; i<realSize; i++ ) {
			
			String ItemName = DropDown_SearchList.get(i).getText();
			System.out.println(ItemName);
			if(ItemName.contains(Selecteditem)) {
				DropDown_SearchList.get(i).click();
				//DropDown_SearchList.SearchButton.click();
				break;
			}
		}		
		
	}
	
	public void ItemDisplayedConfirm() {
		
		String name = DisplayItem.getText();
		System.out.println("Selected item from search result dropdown :" + name);
		
		
	}
	
}
