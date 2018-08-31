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
Feature: Register students in University

  @tag1
  Scenario: Succesful registration
  Given student with name "Ion" and surname "Popescu" and day "22" and month "02" and year "1990" 
  And student false registered in the university system
  When student registration 
  Then student has student id 160000
  And student has email "s160000@student.dtu.dk"
  
    
   
