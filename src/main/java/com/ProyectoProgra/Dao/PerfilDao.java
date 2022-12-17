/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoProgra.Dao;

import com.ProyectoProgra.domain.Perfil;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author dvargas
 */
public interface PerfilDao extends CrudRepository<Perfil, Long>{
    
}
