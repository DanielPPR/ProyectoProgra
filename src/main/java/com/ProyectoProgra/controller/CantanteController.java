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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
    
        @GetMapping("/cantante/nuevo")/*Esto reponde al Index*/
    public String nuevoCantante(Cantante cantante) {
        return "/cantante/modificar";
    }

    @PostMapping /*Reponde a esta ruta*/("/guardarCantante")
    public String guardarCantante(Cantante cantante) {
        cantanteService.save(cantante);
        return "redirect:/cantante/listado";/*Redirecciona a un recurso, no devuelve una vista, devuelve una accion que hace la magia*/

    }
    
@GetMapping("/modificarCantante/{IdCantante}")
public String modificarCliente(Cantante cantante, Model model){
cantante = cantanteService.getCantante(cantante);
model.addAttribute("cantante", cantante);
return "redirect:/cantante/listado";
}
@GetMapping("/eliminarCliente/{IdCantante}")
public String eliminarCliente(Cantante cantante){
cantanteService.delete(cantante);
return "redirect:/cantante/listado";
}
}
