package com.clase06.Controllers;

import com.clase06.Services.CalculadoraServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcEdadesController {

    @GetMapping("/{day}/{month}/{year}")
    public String ObtenerEdad(@PathVariable Integer day, @PathVariable Integer month, @PathVariable Integer year){
        return CalculadoraServices.calcularEdad(day,month,year);
    }

    @GetMapping()
    public String obtenerAlgo(@RequestParam(value="name",defaultValue = "Felipe") String name){
        return "Hola como estas "+ name;
    }
}
