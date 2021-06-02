package com.obtener_diploma.Services;

import com.obtener_diploma.Entities.Alumno;
import com.obtener_diploma.Entities.Diploma;

import java.util.HashMap;

public class DiplomaService {

    public static Diploma createDiploma(Alumno alumno){
        return new Diploma(AlumnoService.getPromedio(alumno) > 9 ? "FELICITACIONES" : "Bien hecho",
                alumno,
                AlumnoService.getPromedio(alumno));
    }
}
