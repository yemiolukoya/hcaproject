Feature: How to pay for your treatment

  Scenario: Make payment with valid details
    Given user launch the browser
    And opens URL "https://hcauks-dev-sitecore-single-app.azurewebsites.net"
    And user click on How to pay for your treatment tab
    And user gets the title of the page
    And the page title should be "Make a payment online | HCA UK"
    And user fill in Patient's details
    And user fill in Billing details
    When user fill in Payment details
    And user click pay securely now
    Then user should be navigated to payment page