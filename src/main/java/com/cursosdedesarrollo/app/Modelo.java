package com.cursosdedesarrollo.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pepesan on 15/6/15.
 */
public class Modelo {

    public List<String> listado;

    public Modelo(){
        listado=new ArrayList<String>();
        listado.add("Uno");
        listado.add("Dos");
    }

    public List<String> list(){
        return listado;
    }

}
