/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoProgra.service;

import com.ProyectoProgra.domain.Cancion;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface CancionService {
      public List<Cancion> getCanciones(); 
     public Cancion getCancion(Cancion cancion);
     public void save(Cancion cancion);
     public void delete(Cancion cancion);
     
}
