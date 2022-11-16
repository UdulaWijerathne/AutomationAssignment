Feature: Test Automation Assignment Test Scenarios

  @Scenario_2
  Scenario: Users are able to sort results under dresses by price in descending order
    Given user is navigated to Home Page
    And user navigate to dresses page
    And user click on Price sorting then user validate that the results are sorted in descending order of Price
    And Close Browser