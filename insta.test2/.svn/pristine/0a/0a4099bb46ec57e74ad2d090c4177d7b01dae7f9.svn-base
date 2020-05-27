Feature: Departments

  Background:
  Given Open "firefox" browser and go to "http://10.8.55.122/instanmc/loginForm.do"
  And Login with user "InstaAdmin" and password "Nmc@123"

  @RunOn
  Scenario: Add new Department and verify whether we are able to create.
    Given navigated to Add Department screen
    When department details entered
    Then department should list in dash board

  @Check
  Scenario Outline: Check whether we are able to add two department with same name
    Given navigated to Add Department screen
    When "<DeptName>" is entered in department
    And clicked on Save button
    And clicked on Add link
    And "<DeptName>" is entered in department
    And clicked on Save button
    Then alert should display with "<DeptName> already exists pls enter other name" message

    Examples: 
      | DeptName |
      | ABBBA    |

  @Check
  Scenario: Check whether we are able to save the department screen without entering department name.
    Given navigated to Add Department screen
    When clicked on Save button
    Then alert should display with "We have found the following error(s):\n\n  * Name is required and max length of name can be 100\n\nPlease check the fields and try again" message

  @Check
  Scenario: Check whether we can remove name and save the department.
    Given navigated to Department Master dashboard
    And navigate to "ABBBA" department’s Edit Department screen
    When clear the department
    And clicked on Save button
    Then alert should display with "We have found the following error(s):\n\n  * Name is required and max length of name can be 100\n\nPlease check the fields and try again" message

  @Check
  Scenario: Check whether we are able to edit Department name
    Given navigated to Department Master dashboard
    And navigate to "ABC" department’s Edit Department screen
    When clear the department
    And "XYZ" is entered in department
    Then department should list in dash board
    And department name should be updated

  Scenario: Check whether we are able to edit Department status
    Given navigated to Department Master dashboard
    And navigate to "XYZ" department’s Edit Department screen
    When clear the department
    And "Active" option is selected in status drop down
    Then department should list in dash board
    And department status should be updated

  Scenario: heck whether we are able to update Department type.
    Given navigated to Department Master dashboard
    And navigate to "XYZ" department’s Edit Department screen
    When clear the department
    And "Non Clinical" option is selected in Department Type drop down
    Then department should list in dash board
    And department type should be updated
