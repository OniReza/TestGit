Feature: Test Close Functionality
  Background:
    Given user has logged into the portal


  @close
  Scenario: Close browser
    When the user is done with testing
    Then the browser should be closed