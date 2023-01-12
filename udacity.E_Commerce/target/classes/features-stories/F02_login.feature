@Smoke

Feature: Login

  Scenario: user enter email and password and login
    Given 1_user go to login page
    And 2_user enter valid email "tester@example.com"
    And 3_user enter valid password "P@ssw0rd"
    When 4_user click on login button
    Then 5_user login successfully