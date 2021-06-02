package com.clase06_2.Services;

import com.clase06_2.Entities.Simpson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpsonService {
    public static Simpson mapearSimpson(String nombre){
        List<String> hijos = new ArrayList<>();
        hijos.add("bart");
        hijos.add("lisa");
        hijos.add("maggie");
        if(nombre.equals("homero")){
            return new Simpson("Homero","Simpson",hijos,40,true);
        }else if(nombre.equals("marge")){
            return new Simpson("Margeori","Bouvier",hijos,25,true);
        }else{
            return new Simpson("none","none", Collections.emptyList(),0,false);
        }

    }
}
