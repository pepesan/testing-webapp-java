package com.cursosdedesarrollo.app;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Created by pepesan on 15/6/15.
 */
public class TestControlador {
    public Controlador controlador;

    @Before
    public void setUp(){
        controlador=new Controlador();
    }

    @Test
    public void testNotNull(){
        assertThat(controlador,notNullValue());
    }
    @Test
    public void testModelNotNull(){
        assertThat(controlador.getModel(),notNullValue());
    }
    @Test
    public void testListNotNull(){
        List<String> listado=controlador.list();
        assertThat(listado,notNullValue());
    }


}
