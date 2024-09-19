Feature: Test For BMET Registration Payment Functionality
  Background:
    Given user has logged into the portal


  @bmetRpay
  Scenario: Verify BMET Registration Payment
    When user clicks on BMET button
    And user input passport number on search field
    And user select checkbox for payment
    And user click make payment button for pay
    And user select a vendor for payment
    And user select payment policy checkbox
    And user click pay button
    And user complete the payment using bkash
    Then user should see payment have been successfully completed