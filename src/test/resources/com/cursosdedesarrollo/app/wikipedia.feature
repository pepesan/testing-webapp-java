# Tag calculadora, para solo ejecutar los tag que tu quieras
@wikipedia
Feature: Wikipedia
  Pruebas de la wikipedia
  Scenario: Buscas Software da un resultado correcto
    Given Abro la web principal de la wikipedia
    When Relleno el formulario de busqueda con "Software"
    And Pulso el botón de buscar
    Then Encuentro el texto "Computer software"