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
@tagMiPrimeraPrueba
Feature: Mi primera prueba

  @tagsumasimple
  Scenario Outline: Suma Simple
    Given Quiero sumar dos numeros
    When Sumo <num1> y <num2>
    Then Compruebo que el resultado de la suma es <resultado>

    Examples: 
      | num1 | num2 | resultado |
      |    2 |    2 |         4 |
      |    2 |    3 |         5 |
      |    2 |    5 |         7 |
