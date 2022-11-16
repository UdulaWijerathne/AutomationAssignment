Feature: Test Automation Assignment Test Scenarios

  @Scenario_1
  Scenario: Users are able to filter for an item by brand under the Computing > Laptop section
    Given user is navigated to Home Page
    And user navigate to laptops page
    And user select brand value to Dell
    Then user validate the results
    And Close Browser