Feature: The Lister Hospital Locations

  Background: 
    Given user launch the browser
    When user click view our facilities
    And click The lister hospital tab

  Scenario: Verify Lister hospital locations list
    Then The Lister Hospital Locations is displayed
    And user gets the title of the page
    And the page title is "The Lister Hospital | HCA UK"

  Scenario: Verify Lister hospital locations count
    And user gets the title of the page
    Then there should be fourteen Lister hospital locations
    And the page title is "The Lister Hospital | HCA UK"
    