package com.config.spring1.springboot_aplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    
    public String info(Model model){
        model.addAttribute("Titulo", "servidor en linea");
        model.addAttribute("servidor", "pagina1");
        model.addAttribute("ip", "123.456.1.1");

        return "detalles_info";
    }
}
