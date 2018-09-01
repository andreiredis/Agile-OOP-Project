#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Enrol students into courses

  @tag1
  Scenario: Succesful Enrollment
    Given student "Andrei" is false enrolled in course "M-101"
    And student "Andrei" is true enrolled in course "PY-101"
    When enroll in "M-101"
    Then student "Andrei" is true enrolled in course "M-101"
    And display "student is enrolled"

  Scenario: Doesn't have prerequisites
  		Given student "Andrei" is false enrolled in course "M-101"
    And student "Andrei" is false enrolled in course "PY-101"
    When enroll in "M-101"
    Then student "Andrei" is false enrolled in course "M-101"
    And display "student is enrolled"
