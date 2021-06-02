package com.obtener_diploma.Controllers;

import com.obtener_diploma.Entities.Alumno;
import com.obtener_diploma.Services.AlumnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {

    @PostMapping("/alumno")
    public static ResponseEntity<Object> postAlumno(@RequestBody Alumno alumno)
    {
        AlumnoService.crearAlumno(alumno);
        return new ResponseEntity<>(alumno, HttpStatus.OK);
    }

    @GetMapping("/veralumno")
    public static ResponseEntity<Object> getAlumno(){

        return new ResponseEntity<>(AlumnoService.getAlumno(), HttpStatus.OK);
    }
}
