@Smoke
Feature: Filter By Color

  Scenario: user login and can filter by color
    Given 1_user go to login page
    And 2_user enter valid email "tester@example.com"
    And 3_user enter valid password "P@ssw0rd"
    When 4_user click on login button
    When 5_user hover on apparel
    When 6_user click shoes