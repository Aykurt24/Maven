Feature: Discount Functionality

  Scenario: Create a discount
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to discount page
    When User create a discount description as "High Level IQ Falcon" integration code as "023" priority as "10"
    Then Then Success message should be displayed

  Scenario: Edit a discount
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to discount page
    When User edit a discount description as "w" to "Basketball"
    Then Success message should be displayed

  Scenario: Delete a discount
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to discount page
    When User delete the "Basketball"
    Then Success message should be displayed
