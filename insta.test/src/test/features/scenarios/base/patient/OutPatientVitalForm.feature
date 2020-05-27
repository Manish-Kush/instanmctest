#Author: kiran.dd
@web
Feature: Out Patient List Vital Test feature

  Background: 
    Given Open "firefox" browser and load application
    And Login with hospital name "nmc", user name "RaziaA" and password "RaziaA@12"
    Then Navigate to patient section
    And Navigate to out patient list

  @Valid
  Scenario: 
    # Search patient based on MR number
    Given Select first patient from list and open toolbar
    # Add new vitals detail
    Then User click on vital froms in toolbar section
    Then User clicks on Add Vitals icon
    And Fill the vital Detail with Parameters Temp "37", Resp "11", Pulse "66", SystolicBP "100", DiastolicBP "75", Height "168", Weight "75" and BMI "21"
    And Click Ok button and check message ""
    And Click close button

  @Valid
  Scenario: 
    # Search patient based on MR number
    Given Select first patient from list and open toolbar
    # Add new vitals detail
    Then User click on vital froms in toolbar section
    Then User clicks on Add Vitals icon
    And Fill the vital detail with high range Parameters Temp "137", Resp "11", Pulse "166", SystolicBP "80", DiastolicBP "95", Height "168", Weight "75" and BMI "21"
    And Click Ok button and check message ""
    And Click close button

  @Invalid
  Scenario: 
    # Search patient based on MR number
    Given Select first patient from list and open toolbar
    # Add new vitals Form save
    Then User click on vital froms in toolbar section
    Then User clicks on Add Vitals icon
    And Fill the vital Detail with Parameters Temp "", Resp "", Pulse "", SystolicBP "", DiastolicBP "", Height "", Weight "" and BMI ""
    And Click Ok button and check message "Please enter atleast one value"
    And Click close button

  @InValid
  Scenario: 
    # Search patient based on MR number
    Given Select first patient from list and open toolbar
    # Add new vitals detail
    Then User click on vital froms in toolbar section
    Then User clicks on Add Vitals icon
    And Fill the vital Detail with Parameters Temp "37", Resp "11", Pulse "66", SystolicBP "100", DiastolicBP "75", Height "", Weight "" and BMI "21"
    And Click Ok button and check message ""
    And Click close button
    Then Click vital form save button and check message "All readings should contain the value in mandatory fields"
