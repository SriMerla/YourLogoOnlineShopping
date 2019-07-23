Feature: Search Functionality
  I want to use this template for my feature file
  
  Scenario: User enters the item in search bar and checks the search results
    Given user is on searchbar page
    When user enters item name in search bar
    Then user checks the search results in dropdown
    And user enters an item from search result dropdown
    And user verifies the selected item is displayed

  
