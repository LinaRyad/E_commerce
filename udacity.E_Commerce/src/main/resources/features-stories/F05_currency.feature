@Smoke
Feature: Currency

  Scenario: user login and change currency to US Euro
    Given 1_user go to login page
    And 2_user enter valid email "tester@example.com"
    And 3_user enter valid password "P@ssw0rd"
    And 4_user click on login button
    And 5_user click on currency select list