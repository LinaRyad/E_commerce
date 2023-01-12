@Smoke
Feature: Compare list

  Scenario: user login and add item to compare list
    Given 1_user go to login page
    And 2_user enter valid email "tester@example.com"
    And 3_user enter valid password "P@ssw0rd"
    When 4_user click on login button
    When 5_user click on compare button
    Then 6_verification message of compareList appears