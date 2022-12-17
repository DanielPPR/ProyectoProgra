/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoProgra.controller;

import com.ProyectoProgra.domain.Cancion;
import com.ProyectoProgra.service.CancionService;
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
public class CancionController {
       @Autowired
     private CancionService cancionService;
       
        @GetMapping("/cancion/listado")
    public String inicio(Model model) {
        var canciones = cancionService.getCanciones();
        model.addAttribute("canciones", canciones);
        return "/cancion/listado";
    }

    @GetMapping("/cancion/nuevo")
    public String nuevoCancion(Cancion cancion) {
        return "/cancion/modificar";
    }
    
     @PostMapping("/cancion/guardar")
    public String guardarCancion (Cancion cancion){
    cancionService.save(cancion);
    return "redirect:/cancion/listado";
    }
    
    @GetMapping("/modificarCancion/{idCancion}")
public String modificarCancion(Cancion cancion, Model model){
cancion = cancionService.getCancion(cancion);
model.addAttribute("cancion", cancion);
return "/cancion/modificar";
}

@GetMapping("/eliminarCancion/{idCancion}")
public String eliminarCancion(Cancion cancion){
cancionService.delete(cancion);
return "redirect:/cancion/listado";
}



}
