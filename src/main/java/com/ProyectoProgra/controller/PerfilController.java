/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoProgra.controller;

import com.ProyectoProgra.domain.Perfil;
import com.ProyectoProgra.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author dvargas
 */
@Controller
public class PerfilController {
    
        
     @Autowired
     private PerfilService perfilService;
     
     @GetMapping("/perfil/cliente")
    public String inicio(Model model) {
        var perfiles = perfilService.getPerfiles();
        model.addAttribute("perfiles", perfiles);
        return "/perfil/cliente";
    }

    @GetMapping("/perfil/nuevo")
    public String nuevoPerfil(Perfil perfil) {
        return "/perfil/modificarPerfil";
    }
    
     @PostMapping("/perfil/guardar")
    public String guardarPerfil (Perfil perfil){
    perfilService.save(perfil);
    return "redirect:/perfil/cliente";
    }
    
    @GetMapping("/modificarPerfil/{idCliente}")
public String modificarPerfil(Perfil perfil, Model model){
perfil = perfilService.getPerfil(perfil);
model.addAttribute("perfil", perfil);
return "/perfil/modificarPerfil";
}

@GetMapping("/eliminarPerfil/{idCliente}")
public String eliminarPerfil(Perfil perfil){
perfilService.delete(perfil);
return "redirect:/perfil/cliente";
}
    
}
