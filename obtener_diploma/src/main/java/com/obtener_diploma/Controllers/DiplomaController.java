package com.obtener_diploma.Controllers;

import com.obtener_diploma.Entities.Alumno;
import com.obtener_diploma.Entities.Diploma;
import com.obtener_diploma.Services.DiplomaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiplomaController {

    @PostMapping
    public ResponseEntity<Diploma> getDiploma(@RequestBody Alumno alumno){
        Diploma diploma = DiplomaService.createDiploma(alumno);
        System.out.println(diploma);
        return new ResponseEntity<>(diploma, HttpStatus.OK);
    }
}
