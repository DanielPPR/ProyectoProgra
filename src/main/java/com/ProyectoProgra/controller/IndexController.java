/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoProgra.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController {

    /*@Autowired
    private ArticuloService articuloService;
*/
    @GetMapping("/")
    /* se deja / solo para que sse ponga local host lo mapee de una vez */
    public String inicio(Model model) {
 
        log.info("Ahora se usa arquitectura MVC");
        //var articulos = articuloService.getArticulos(true);
        //var articulos = articuloService.getPorExistencias(5);
        
        
        //var articulos = articuloService.getPorExistenciasCategorias(5, new Long (1));
        //model.addAttribute("articulos", articulos);
        return "index";

    }


}
