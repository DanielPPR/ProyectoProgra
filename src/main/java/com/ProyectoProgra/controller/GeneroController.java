/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoProgra.controller;

import com.ProyectoProgra.domain.Cantante;
import com.ProyectoProgra.domain.Genero;
import com.ProyectoProgra.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Daniel
 */
@Controller
public class GeneroController {
    
     @Autowired
     private GeneroService generoService;
     
     @GetMapping("/genero/listado")
    public String inicio(Model model) {
        var generos = generoService.getGeneros();
        model.addAttribute("generos", generos);
        return "/genero/listado";
    }

    @GetMapping("/genero/nuevo")
    public String nuevoGenero(Genero genero) {
        return "/genero/modificar";
    }
    
     @PostMapping("/genero/guardar")
    public String guardarGenero (Genero genero){
    generoService.save(genero);
    return "redirect:/genero/listado";
    }
    
    @GetMapping("/modificarGenero/{idGenero}")
public String modificarGenero(Genero genero, Model model){
genero = generoService.getGenero(genero);
model.addAttribute("genero", genero);
return "/genero/modificar";
}

@GetMapping("/eliminarGenero/{idGenero}")
public String eliminarGenero(Genero genero){
generoService.delete(genero);
return "redirect:/genero/listado";
}

}
