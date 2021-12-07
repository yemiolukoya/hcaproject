Feature: Search functionality

  Scenario: Word Search
    Given user launch the browser
    When user click on the search field
    And user type a word in the search field
    And click on the search icon
    Then result will be return

  Scenario: Search result sort
    Given user launch the browser
    When user click on the search field
    And user type a word in the search field
    And click on the search icon
    Then result will be return
    And sort result A-Z
