/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoProgra.service;

import com.ProyectoProgra.domain.Genero;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface GeneroService {
    public List<Genero> getGeneros(); 
     public Genero getGenero(Genero genero);
     public void save(Genero genero);
     public void delete(Genero genero);
}
