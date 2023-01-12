@Smoke
Feature: Create Order
  Scenario: user login and create order
    Given 1_user go to login page
    And 2_user enter valid email "tester@example.com"
    And 3_user enter valid password "P@ssw0rd"
    And 4_user click on login button
    And 5_user login successfully
    When 5_user click on add to cart button of HTCMobile
    And 7-user click on shopping cart
    And 8_user click on terms of service
    And 9_user click on checkOutButton
#    And 10_user enter first name
#    And 11_user enter last name
#    And 12_user enter email
    And 13_user enter CountryToOrder
    And 14_user enter CityToOrder
    And 15_user enter Address1ToOrder
    And 16_user enter postalCodeToOrder
    And 17_user enter PhoneNumberToOrder
    And 18_user enter continueButtonBilling
    And 19_user enter shippingAddress
    And 20_user enter continueButtonShipping
    And 21_user enter shippingMethod
    And 22_user enter continueButtonShippingMethod
    And 23_user enter paymentMethod
    And 24_user enter continueButtonPaymentMethod
    And 25_user enter paymentInformation
    And 26_user enter continueButtonPaymentInformation
    And 27_user enter ConfirmOrder
    Then 28_verification message appears