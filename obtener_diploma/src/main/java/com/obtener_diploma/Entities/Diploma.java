package com.obtener_diploma.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Diploma {
    String mensaje;
    Alumno alumno;
    double promedio;
}
