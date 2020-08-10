Feature: The car drives
  As a driver, I want to get to any place, so I can avoid public transport.

  Background:
    Given The driver has a driving license

  Scenario: The driver goes to school
    Given A child gets into the car
    And The driver drives to "school"
    When The driver drives safetly
    Then The driver is at "school"

  Scenario: The driver goes to work
    Given The driver drives to "work"
    When The driver drives safetly
    Then The driver is at "work"
