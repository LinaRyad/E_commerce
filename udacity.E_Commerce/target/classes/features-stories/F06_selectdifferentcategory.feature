@Smoke
Feature: Select different category and choose for subCategory
  Scenario: hover on categories to select subcategories
    When select one of the three main categories to hover randomly
    And select one of the three subcategories to hover randomly
    Then the page title should be the same as the selected one