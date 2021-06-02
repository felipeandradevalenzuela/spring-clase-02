package com.obtener_diploma.Services;

import com.obtener_diploma.Entities.Alumno;
import com.obtener_diploma.Entities.Asignatura;

import java.util.HashMap;

public class AlumnoService {
    private static HashMap<String, Alumno> alumnos = new HashMap<>();

    public static Alumno crearAlumno(Alumno alumno){
        alumnos.put(alumno.getNombre(),alumno);
        return alumno;
    }

    public static double getPromedio(Alumno alumno){
        double sumaPromedio = 0;
        for (Asignatura asignatura : alumno.getAsignaturas()) {
            sumaPromedio += asignatura.getNota();
        }
        return sumaPromedio/alumno.getAsignaturas().size();
    }

    public static HashMap<String, Alumno> getAlumno(){
        return alumnos;
    }

}
