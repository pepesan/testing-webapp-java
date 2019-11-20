package com.cursosdedesarrollo.app;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Created by pepesan on 15/6/15.
 */
public class TestModelo {

    public Modelo modelo;

    @Before
    public void setUp(){
        modelo=new Modelo();
    }

    @Test
    public void testNotNull(){
        assertThat(modelo,notNullValue());
    }

    @Test
    public void testHasTwoValues(){
        assertThat(modelo.listado.size(),is(2));
    }
    @Test
    public void testDefaultValues(){
        assertThat(modelo.listado.get(0),is("Uno"));
        assertThat(modelo.listado.get(1),is("Dos"));
    }

    @Test
    public void testListCall(){
        List<String> listado=new ArrayList<String>();
        listado.add("Uno");
        listado.add("Dos");
        assertThat(modelo.list(),is(listado));
    }
}
