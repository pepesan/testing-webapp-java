package com.cursosdedesarrollo.app;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

/**
 * Created by pepesan on 15/6/15.
 */
public class TestControladorModelo {

    public Controlador controlador;

    @Before
    public void setUp(){
        controlador=new Controlador();
    }

    @Test
    public void testModeloBasico(){
        Modelo mockModelo = mock(Modelo.class);

        //stubbing
        when(mockModelo.list()).thenReturn(new ArrayList<String>());

        List<String> listado=mockModelo.list();
        verify(mockModelo).list();
        assertThat(listado,notNullValue());
        assertThat(listado.size(),is(0));
    }
    @Test
    public void testModeloEspiaSinDatos(){
        Modelo modelo = new Modelo();
        Modelo modeloespia = spy(modelo);
        when(modeloespia.list()).thenReturn(new ArrayList<String>());
        Controlador controladorEspia=spy(controlador);
        controladorEspia.model=modeloespia;
        controladorEspia.list();
        /*
        List<String> listado=modeloespia.list();
        for (int i=0;i<listado.size();i++){
            controladorEspia.imprime(listado.get(i));
        }*/
        //verification using never(). never() is an alias to times(0)
        verify(controladorEspia, never()).imprime("Uno");
    }
    @Test
    public void testModeloEspiaConDosDatos(){

        Controlador controladorEspia=spy(controlador);
        controladorEspia.list();

        verify(controladorEspia, atLeastOnce()).imprime("Uno");
        verify(controladorEspia, atLeastOnce()).imprime("Dos");
    }
}
