@Smoke
Feature: Select Tag
  Scenario: user login and select by tag
    Given 1_user go to login page
    And 2_user enter valid email "tester@example.com"
    And 3_user enter valid password "P@ssw0rd"
    When 4_user click on login button
    When 5_user click on any category
    When 6_user click on any Tag
    Then 7_verify that tag window will open