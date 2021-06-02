package com.clase06_2.Controllers;

import com.clase06_2.Entities.Simpson;
import com.clase06_2.Services.SimpsonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SimpsonController {

    @GetMapping("/{nombre}")
    public ResponseEntity<Object> getSimpson(@PathVariable String nombre){
        Simpson s = SimpsonService.mapearSimpson(nombre);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    @PostMapping("/simpson")
    public ResponseEntity<Object> enviarSimpson(@RequestBody Simpson s){
        System.out.println(s);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }
}
