package com.cursosdedesarrollo.app;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {
    Calculadora calculadora;
    int c=0;
    @Given("^Tengo una clase llamada Calculadora$")
    public void tengo_una_clase_llamada_Calculadora() throws Throwable {
        calculadora= new Calculadora();
        this.c=0;
    }
    @When("^ejecuto el método suma con el parametros (\\d+) y (\\d+)$")
    public void ejecuto_el_metodo_suma_con_parametros(int a, int b) throws Throwable {
        this.c=Calculadora.suma(a,b);
    }


    @Then("^debería devolver (\\d+)$")
    public void deberiaDevolver(int c) {
        assertEquals(this.c, c);
    }
}
