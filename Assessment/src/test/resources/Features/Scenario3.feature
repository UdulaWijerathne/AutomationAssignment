Feature: Test Automation Assignment Test Scenarios

  @Scenario_3
  Scenario: Users are able to search for an item
    Given user is navigated to Home Page
    And user search for "iphone 14"
    Then user validate that the search results returned matches the search criteria
    And Close Browser