package com.metros_cuadrados.Controllers;

import com.metros_cuadrados.Entitites.Casa;
import com.metros_cuadrados.Services.CasaService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CasaController {

    @PostMapping("/newcasa")
    public void nuevaCasa(@RequestBody Casa casa)
    {
        CasaService.newCasa(casa);
        System.out.println(casa);
    }

    @GetMapping("/areacasa/{nombre}")
    public void areaCasa(@PathVariable String nombre) {
        System.out.println(nombre);

    }
}
