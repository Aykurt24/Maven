Feature: Login Functionality

  # We can create multiple scenarios for the feature
  # Scenario 1) login with valid username and password
  # Scenario 2) login with valid username and invalid password
  # Scenario 3) login with invalid username and valid password

  Scenario: Login with valid username and password
    Given Navigate to website
    Given Enter the username and password
    Given User should login successfully