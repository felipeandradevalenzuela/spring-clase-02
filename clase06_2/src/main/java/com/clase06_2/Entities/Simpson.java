package com.clase06_2.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Simpson {
    private String nombre,apellido;
    private List<String> hijos;
    private int edad;
    private boolean pareja;
}
