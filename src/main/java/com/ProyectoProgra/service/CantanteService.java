/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoProgra.service;

import com.ProyectoProgra.domain.Cantante;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface CantanteService {
     public List<Cantante> getCantantes(); 
     public Cantante getCantante(Cantante cantante);
     public void save(Cantante cantante);
     public void delete(Cantante cantante);
}
