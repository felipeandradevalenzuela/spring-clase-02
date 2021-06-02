package com.obtener_diploma.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Alumno {
    private String nombre;
    List<Asignatura> asignaturas;
}
