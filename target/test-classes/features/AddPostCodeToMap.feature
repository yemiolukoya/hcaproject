Feature: Postcode on location map

  Scenario: Add postcode to location map
    Given user launch the browser
    And user click The Harley Street Clinic tab
    And the page title is displayed as "The Harley Street Clinic | HCA UK"
    And user click on The Harley Street Clinic
    Then the location map should contain the postcode