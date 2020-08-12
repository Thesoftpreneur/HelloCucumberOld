Feature: Login into account
  Existing user should be able to login to account using correct credentials

  Scenario: Log into account with correct credentials
    Given User navigates to stackoverflow website
    And User clicks on the login button on homepage
    And User enters a valid username
    And User enters a valid password
    When User click on the login button
    Then User should be taken to the successful login page