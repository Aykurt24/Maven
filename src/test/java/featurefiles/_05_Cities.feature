Feature: Cities Functionality

  Scenario: Create a city
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to cities page
    Then User create a city

  #tbody>:first-child>:last-child>:first-child>ms-delete-button>button