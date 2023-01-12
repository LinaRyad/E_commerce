@Smoke

Feature: Search

  Scenario: user login and search about any product
    Given 1_user go to login page
    And 2_user enter valid email "tester@example.com"
    And 3_user enter valid password "P@ssw0rd"
    And 4_user click on login button
    And 5_user enter productName "Flower Girl Bracelet"
    And 6_use click on searching button
    Then 7_user find items with productName