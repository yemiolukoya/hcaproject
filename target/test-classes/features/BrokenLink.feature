Feature: Broken links

  
  Scenario: Check for broken links on the site
    Given user launch the browser
    When user get all the page urls
    And iterate through the list and check elements in the list
    Then broken links should be displayed