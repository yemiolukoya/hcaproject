Feature: Finder

  
  Scenario: Find expert by location
    Given user opens URL "https://finder.hcahealthcare.co.uk/hca/"
    And choose a condition
    And enter a location
    When user click search
    Then search result should be displayed