Feature: Nationalities functionality

  #  I would like to run one scenario with multiple tags
  @SmokeTest @RegressionTest
  Scenario: Create a Nationalities

    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Nationalities page
    When User create a Nationalities
    Then Success message should be displayed
