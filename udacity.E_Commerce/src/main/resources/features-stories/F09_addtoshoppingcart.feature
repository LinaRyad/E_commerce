@Smoke
Feature: Shopping Cart

  Scenario: user login and add to shopping cart and verification message appears
    Given 1_user go to login page
    And 2_user enter valid email "tester@example.com"
    And 3_user enter valid password "P@ssw0rd"
    When 4_user click on login button
    When 5_user click on add to cart button of HTCMobile
    Then 6_verification message of shoppingCart appears