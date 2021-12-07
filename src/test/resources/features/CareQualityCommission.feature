Feature: Care Quality Commission verified

  
  Scenario: Verify that clicking CQC tab opens CQC page
    Given user launch the browser
    And user click CQC tab
    Then CQC page is opened
    And page title should be "Leading Private Healthcare Provider | HCA UK"
    