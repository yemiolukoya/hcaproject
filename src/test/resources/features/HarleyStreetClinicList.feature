Feature: The Harley Street Clinic Locations

  Scenario: Count hospital locations
    Given user launch the browser
    When user click view our facilities
    And click The Harley street clinic tab
    Then The Harley Street Clinic Locations is displayed
    And the page title is The Harley Street Clinic | HCA UK
    