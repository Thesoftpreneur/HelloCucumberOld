Feature: Submit data to webdriveruniversity.com using the contact us form
  A user should be to submit information via the contact us form
  If a user clicks on the reset button then all the information should be removed from the contact us form

  Background:
    When I access webdriver university
    Then I click on the contact us button

  Scenario: Submit information using the contact us form
    And I enter a first name
    And I enter a last name
    And I enter email address
    And I enter comments
      | comment one | comment two |
    When I click on the submit button
    Then the information should successfully e submitted via the contact us form
    And Close Browser

  Scenario: Enter information to the contact us form, when click on the reset button then infomation should be removed
    And I enter a first name
    And I enter a last name
    And I enter email address
    And I enter comments
      | comment one | comment two |
    When I click on the reset button
    Then all information which were listed by the user on the contact us form should be now removed
    And Close Browser