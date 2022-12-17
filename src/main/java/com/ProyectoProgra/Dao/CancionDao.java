/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoProgra.Dao;

import com.ProyectoProgra.domain.Cancion;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Daniel
 */
public interface CancionDao extends CrudRepository<Cancion, Long>{
    
}
