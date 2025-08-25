package com.config.spring1.springboot_aplication.controllers;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping("/detalles_info2")
    
    public Map<String, Object>detalles_info2(){
        Map<String, Object>respuesta = new HashMap<>();
        respuesta.put("Titulo", "servidor en linea");
        respuesta.put("servidor", "pagina1");
        respuesta.put("ip", "123.456.1.1");

        return respuesta;
    }
}
