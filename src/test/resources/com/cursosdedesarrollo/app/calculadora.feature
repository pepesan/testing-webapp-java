Feature: Calculadora
  Pruebas de calculadora simple
  Scenario: suma simple
    Given Tengo una clase llamada Calculadora
    When ejecuto el método suma con el parametros 2 y 3
    Then debería devolver 5
  Scenario: suma simple distinta
    Given Tengo una clase llamada Calculadora
    When ejecuto el método suma con el parametros 6 y 2
    Then debería devolver 8
  Scenario: resta simple
    Given Tengo una clase llamada Calculadora
    When ejecuto el método resta con los parametros 4 y 2
    Then debería devolver 2
  Scenario: resta simple
    Given Tengo una clase llamada Calculadora
    When ejecuto el método resta con los parametros 7 y 5
    Then debería devolver 2