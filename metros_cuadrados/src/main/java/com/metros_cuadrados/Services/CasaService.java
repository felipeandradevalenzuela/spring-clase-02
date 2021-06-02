package com.metros_cuadrados.Services;

import com.metros_cuadrados.Entitites.Casa;
import com.metros_cuadrados.Entitites.Habitacion;

import java.util.HashMap;

public class CasaService {

    HashMap<String, Casa> bdCasas = new HashMap<>();

    public static String newCasa(Casa casa)
    {

        metrosCasa(casa);
        valorCasa(casa);
        return casa.toString()+", y la habitacion mas grande es:"+habitacionMasGrande(casa);
    }

    public static double valorCasa(Casa casa){
        casa.setValor(casa.getTotalm2()*800);
        return casa.getValor();
    }

    public static double metrosCasa(Casa casa){
        double totalM2= 0;
        for (Habitacion el: casa.getHabitaciones()) {
           el.setMetrosCuadrados(el.getAncho()*el.getLargo());
           totalM2 += el.getMetrosCuadrados();
        }
        casa.setTotalm2(totalM2);

        return casa.getTotalm2();
    }

    public static Habitacion habitacionMasGrande(Casa casa){
        double max = 0;
        int index = 0;

        for (int i = 0; i < casa.getHabitaciones().size(); i++) {
            if(max < casa.getHabitaciones().get(i).getMetrosCuadrados()){
                max = casa.getHabitaciones().get(i).getMetrosCuadrados();
                index = i;
            }

        }

       return casa.getHabitaciones().get(index);
    }

    public void guardarCasa(Casa casa){
        bdCasas.put(casa.getNombre(),casa);
    }
}
