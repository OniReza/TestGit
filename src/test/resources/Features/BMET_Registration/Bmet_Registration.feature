Feature: Test For BMET Registration Functionality
  Background:
    Given user has logged into the portal


  @bmetR
  Scenario: Verify BMET Registration Functionality
    When user clicks on BMET button
    And user click new BMET registration
    And user upload passport
    And user inputs passport number
    And user inputs mobile number
    And user inputs passport information
    And user inputs full name
    And user select gender
    And user select birthday district
    And user click next button
    And user inputs personal information
    And user inputs contact info
    And user inputs nominee info
    And user inputs qualification info
    And user select desire country with preferred job
    And user click next button form Qualification page
    Then user should see pending status





