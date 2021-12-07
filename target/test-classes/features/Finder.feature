Feature: Finder

  
  Scenario: Find expert by hospital
    Given user opens URL "https://finder.hcahealthcare.co.uk/hca/"
    And choose a condition
    And select a hospital
    When user click search
    Then search result should be displayed
    
    
     