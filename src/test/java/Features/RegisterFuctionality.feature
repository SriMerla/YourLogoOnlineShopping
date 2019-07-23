Feature: Create an account Functionality
 
  Scenario: Create an account to a new user
    Given user is on YourLogo webpage
    When user enters new email addrress
    And user selects title
    And user enters "firstname" as "Jeo"
    And user enters "lastname" as "Dem"
    And user enters "password" as "Demo@123"
    And user enters date of birth
    And user enters "addressFirstname" as "Jeo"
    And user enters "addressLastname" as "Dem"
    And user enters "companyName" as "No Company"
    And user enters "address" as "StreetName"
    And user enters "city" as "cityName"
    And user enters state
    And user enters "zipcode" as "54321"
    And user enters "mobilephone" as "5566778899"
    And user enters "futureReference" as "hello@gmail.com"
    And user clicks register button
    Then useris on account page
    And user verifies register confimation message

 