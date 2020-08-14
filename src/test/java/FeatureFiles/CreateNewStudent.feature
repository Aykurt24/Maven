Feature: Create Student Functionality

  Scenario: Create a new student
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Click in the leftnav class
    |Student|
    |Students|
    And Click on the element in the dialog content class
      | AddButton |
    When User sending the keys in the student class
      | FirstName             | Dogan |
      | LastName              | Aykurt|
      | MiddleName            | Falcon|
      | StudentID             | 123456|
      | MobilePhone           | 123456789|
      | Email                 | dgn@gmail.com|
      | PreviousSchool        | Hardvard|
    And Click in the studentClass class
      |GradeLevel|
      |   1      |
      |SchoolDepartment|
      |   1      |
      |Section|
      |  2       |
      |Citizenship|
      |45|
      |Nationality|
      |32|
      |Gender|
      |1|
      |DocumentType|
      |2|
    And Click on the element in the dialog content class
      | SaveButton |
    But Error message should be displayed

