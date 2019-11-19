package com.cursosdedesarrollo.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EjemploTest {
    @Test
    public void pruebaBasica(){
        Ejemplo e= new Ejemplo();
        e.metodo();
        assertEquals("",e.cadena);
    }
}
