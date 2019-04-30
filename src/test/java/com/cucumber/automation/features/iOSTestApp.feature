Feature: iOs Test App
  I want to test

  Scenario: Calculate Sum
    Given user is on Application Home Page
    When user enters "4" in first field
    And user enters "5" in second field
    And clicks in Compute SUm
    Then user sees computed sum as "9"