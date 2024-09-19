Feature: Test BMET Registration Status Approve
  Background:
    Given user has logged into the approval portal


  @approval
  Scenario: Verify BMET Registration Approve Functionality
    When user click new registration status button
    And user input passport number
    And user click search button
    And user click manual varification button
    And user select verify option
    And user click confirm button
    Then user should see passport verification status yes
