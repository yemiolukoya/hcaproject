Feature: Harley Street Clinic

  Scenario: Verify that Harley Street Clinic address is displayed
    Given user launch the browser
    And user click The Harley Street Clinic tab
    And the page title is displayed as "The Harley Street Clinic | HCA UK"
    And the clinic address is displayed

  Scenario: Verify that The Harley Street Clinic locations are displayed
    Given user launch the browser
    When user click The Harley Street Clinic tab
    Then user gets The Harley Street Clinic locations list
      | The Harley Street Clinic                                 |
      | The Harley Street Clinic Diagnostic Centre               |
      | The Breast Unit at The Harley Street Clinic              |
      | The Head and Neck Centre at THSC                         |
      | The Harley Street Clinic Endometriosis Centre            |
      | The Physicians' Clinic                                   |
      | London Neurosurgery Partnership                          |
      | The Harley Street Clinic Molecular Imaging Centre        |
      | Interventional Oncology Centre                           |
      | Enhanced Oncology Unit                                   |
      | HPB and Surgical Oncology Unit                           |
      | The Prostate Centre                                      |
      | The Harley Street Clinic Interventional Radiology Centre |
      | The Heart Rhythm Clinic                                  |
      | Kidney Stones Clinic                                     |
      | Skin clinic                                              |
      | The Vascular Centre                                      |
And The Harley Street Clinic locations list count should be 1