Feature: Request an appointment

  
  Scenario: Verify user can Request an appointment as a patient
    Given user launch the browser
    And opens URL "https://hcauks-dev-sitecore-single-app.azurewebsites.net"
    When user click book an appointment
    And the page title is "Request an appointment | HCA UK"
    And user choose I am a patient option
    And user fill in patient details
    And user enter appointment details
    And user choose communication Preferences
    When user click submit button
    Then confirm you are not a robot message is displayed
    
    Scenario: Verify user can Request Request an appointment on behalf of the patient
    Given user launch the browser
    And opens URL "https://hcauks-uat-sitecore-cd.azurewebsites.net/"
    When user click book an appointment
    And the page title is "Request an appointment | HCA UK"
    And user choose I am completing this on behalf of the patient option
    And user fill in patient details
    And user enter appointment details
    And user choose communication Preferences
    When user click submit button
    Then confirm you are not a robot message is displayed
