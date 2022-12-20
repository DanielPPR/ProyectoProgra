/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoProgra.service;

import com.ProyectoProgra.domain.Perfil;
import java.util.List;

/**
 *
 * @author dvargas
 */
public interface PerfilService {
    
     public List<Perfil> getPerfiles(); 
     public Perfil getPerfil(Perfil perfil);
     public void save(Perfil perfil);
     public void saveNombre(Perfil perfil);
     public void delete(Perfil perfil);
    
}
