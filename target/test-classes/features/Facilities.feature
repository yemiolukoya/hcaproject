Feature: Facilities

  Scenario: Facilities list
    Given user launch the browser
    When user navigate to discover our facilities "Leading Private Healthcare Provider | HCA UK"
    Then there should be nine facilities displayed
