@TradeMeAPI
Feature: TradeMe API tests for UsedCars Category
  As a User
  I want to run Used Cars category APIs
  so that I can verify Used Cars category returns Used car brands info

  Background:
    Given I go to the Used Cars Category API
    When I get list of Used Cars Brands

  Scenario: Get Total Number of used cards brands available
    Then Total Number of named brands of used cars available in the TradeMe UsedCars category is 76

  Scenario Outline: Check Used Car brand availability
    Then I verify that brand '<brandName>' does <availability> in the Used Cars List

    Examples:
      | brandName     | availability |
      | Kia           | exist        |
      | Hispano Suiza | not exist    |