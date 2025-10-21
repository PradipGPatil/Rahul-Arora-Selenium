@Search-car
Feature: Search car acceptance testin
  As a user I should be search various car

  @Search-car-positive
  Scenario: Validate search car page
    Given I am on the home page "https://www.carwale.com/"
    When I move to the menu
      | menu      |
      | New Cars  |
      | used cars |
    And i click on new cars
    And I select find new cars
    And I click on "Mahindra" brand option
    Then I should see all "Mahindra" cars
    And page title should be "Mahindra cars in india"
