#Author: Lola Martin
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
Feature: Probando la multiplicación
 @tagdivision1
  Scenario Outline: Multiplicacion Usual
    Given Quiero multiplicar dos numeros
    When Multiplico <num1> y <num2>
    Then Compruebo que el resultado de la multiplicacion es <resultado>

    Examples: 
      | num1 | num2 | resultado |
      |    6 |    2 |        12 |
      |    9 |    3 |        27 |
      |    5 |    5 |        25 |
