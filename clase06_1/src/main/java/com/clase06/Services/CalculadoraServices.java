package com.clase06.Services;

import java.time.LocalDate;
import java.time.Period;

public class CalculadoraServices {

    public static String calcularEdad(int day, int month, int year) {
        LocalDate fecha = LocalDate.of(year,month,day);
        Period periodo = Period.between(fecha, LocalDate.now());

        String comentario = "Tienes "+periodo.getYears()+ " años, "+periodo.getMonths()+" meses y "+periodo.getDays()+" días";

        return comentario;
    }
}
