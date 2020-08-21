Feature: Submit data to webdriveruniversity.com using the contact us form
  A user should be to submit information via the contact us form
  If a user clicks on the reset button then all the information should be removed from the contact us form


  Scenario Outline: Submit information using the contact us form
    When I access webdriver university
    Then I click on the contact us button
    And I enter a first name "<First name>"
    And I enter a last name "<Last name>"
    And I enter email address
    And I enter comments
      | comment one | comment two |
    When I click on the submit button
    Then the information should successfully e submitted via the contact us form
    And Close Browser

Examples:
    | First name | Last name |
    | James      | Ululu     |
    | James2     | Ululu2    |