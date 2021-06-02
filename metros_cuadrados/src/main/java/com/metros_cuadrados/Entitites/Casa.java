package com.metros_cuadrados.Entitites;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Casa {
    private String nombre,direccion;
    private List<Habitacion> habitaciones;
    private double valor=0,totalm2=0;

}
