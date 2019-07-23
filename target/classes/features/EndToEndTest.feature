
Feature: Test End to End functionality
Description: User login to website with valid credentials and add an item to cart and checkout and logout from the websited

  @Login
  Scenario Outline: User login with valid credentials
    Given user is on login page
    When user enters valid <username> and <password>
    Then user verifies the confirmaiton message
    
    Examples: 
      | username                 | password |
      | demoShopping@gmail.com   | test@123 |
      
   
  @Checkout
  Scenario: User add an item to cart and checkout
    Given user is on home page
    When  user chooses WOMEN category
    And   user chooses TOP'S subcategory
    And   user chooses T-SHIRTS subcategory
    And   user chooses first item to buy
    And   user moves the selected item to cart
    And   user checkout from cart
    And   user selects payment method to confirm order
    Then  user verifies the order confirmation message

    @Logout
    Scenario: User logout from the website
     Given user is on homepage
     When user clicks signout button
     Then user verifies Logout confirmaiton message
    
