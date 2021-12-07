Feature: Locations

  Scenario: Verify hospital count
    Given user launch the browser
    When user click locations link
    And user is on location page
    Then user gets hospital list
      | The Harley Street Clinic     |
      | The Lister Hospital          |
      | London Bridge Hospital       |
      | The Portland Hospital        |
      | The Princess Grace Hospital  |
      | The Wellington Hospital      |
      | The Wilmslow Hospital        |
      | The Christie Private Care    |
      | HCA UK at University College |
      
    And hospital count should be 13

  Scenario: Verify clicking see all locations tab displays location page
    Given user launch the browser
    When user see all locations tab
    Then locations page should be displayed
