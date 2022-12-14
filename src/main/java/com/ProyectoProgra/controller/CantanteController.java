/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoProgra.controller;

import com.ProyectoProgra.domain.Cantante;
import com.ProyectoProgra.service.CantanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author Daniel
 */
@Controller
public class CantanteController {
    
      
     @Autowired
     private CantanteService cantanteService;

    @GetMapping("/cantante/listado")
    public String inicio(Model model) {
        var cantantes = cantanteService.getCantantes();
        model.addAttribute("cantantes", cantantes);
        return "/cantante/listado";
    }

    @GetMapping("/cantante/nuevo")
    public String nuevoCantante(Cantante cantante) {
        return "/cantante/modificar";
    }
    /*@GetMapping("/cantante/modificar/(idCantante)")
    public String modificarCantante(Cantante cantante, Model model) {
        cantante = cantanteService.save(cantante);
        return "redirect:/cantante/modificar";
    }*/

    @PostMapping("/cantante/guardar")
    public String guardarCantante (Cantante cantante){
    cantanteService.save(cantante);
    return "redirect:/cantante/listado";
    }
    
    /*@PostMapping("/guardarCantante")
    public String guardarCantante(Cantante cantante) {
        cantanteService.save(cantante);
        return "redirect:/cantante/listado";
    /*Redirecciona a un recurso, no devuelve una vista, devuelve una accion que hace la magia
    } */


@GetMapping("/modificarCantante/{idCantante}")
public String modificarCantante(Cantante cantante, Model model){
cantante = cantanteService.getCantante(cantante);
model.addAttribute("cantante", cantante);
return "/cantante/modificar";
}

@GetMapping("/eliminarCantante/{idCantante}")
public String eliminarCantante(Cantante cantante){
cantanteService.delete(cantante);
return "redirect:/cantante/listado";
}
}
