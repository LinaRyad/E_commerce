@Smoke
Feature: Register
  Scenario: user register with data
    Given 1_go to register page
    And 2_user select gender type
    And 3_user enter firstname "tester" and lastname "automation"
    And 4_user enter day of birth
    And 4_user enter month of birth
    And 4_user enter year of birth
    And 5_user enter Gmail "tester@example.com"
    And 6_user enter password "P@ssw0rd"
    And 7_user confirm password "P@ssw0rd"
    When 8_user click on register button
    Then 9_confirmation massage appears
