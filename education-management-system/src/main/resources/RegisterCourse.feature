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
Feature: Register courses to the university system

  Background: 
  		Given a student with student id 160000
  		And a teacher with theacher id 1
		And A course with title "Project Management" and course id "PM-101" and type "BSc" and ECTS 10

  @tag1
  Scenario: Successful course registration
    Given A course with title "Computer Science" and course id "CS-101" and type "BSc" and ECTS 5
    And a responsible teacher with id 1 and a teaching assistant with id 160000 and prerequisite course with id "PM-101"
    When course registration
    Then course has title "Computer Science" and course id "CS-101" and type "BSc" and ECTS 5
    And has a responsible teacher with id 1 and a teaching assistant with id 160000 and prerequisite course with id "PM-101"

