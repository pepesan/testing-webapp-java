Feature: Calculadora
  Pruebas de calculadora simple
  Scenario: suma simple
    Given Tengo una clase llamada Calculadora
    When ejecuto el método suma con el parametros 2 y 3
    Then debería devolver 5