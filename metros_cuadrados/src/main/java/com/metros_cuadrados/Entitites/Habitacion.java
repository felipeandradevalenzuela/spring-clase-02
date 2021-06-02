package com.metros_cuadrados.Entitites;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Habitacion {
    private String nombre;
    double ancho,largo;
    double metrosCuadrados;

}
