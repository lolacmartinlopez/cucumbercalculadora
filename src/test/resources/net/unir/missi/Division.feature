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
@tagDivision
Feature: Probando la división

  @tagdivision1
  Scenario Outline: Division Normal
    Given Quiero dividir dos numeros
    When Divido <num1> y <num2>
    Then Compruebo que el resultado de la division es <resultado>

    Examples: 
      | num1 | num2 | resultado |
      |    6 |    2 |         3 |
      |    9 |    3 |         3 |
      |    5 |    5 |         1 |

  @tagdivision2
  Scenario Outline: Division por cero
    Given Quiero dividir dos numeros
    When Divido <num1> por cero
    Then Compruebo que el resultado es la excepción de <tipoexcepcion> con mensaje <mensajeexcepcion>

    Examples: 
      | num1 | tipoexcepcion                   | mensajeexcepcion |
      |    2 | "java.lang.ArithmeticException" | "/ por cero"     |
