/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoProgra.service;

import com.ProyectoProgra.Dao.PerfilDao;
import com.ProyectoProgra.Dao.PlaylistDao;
import com.ProyectoProgra.domain.Perfil;
import com.ProyectoProgra.domain.Playlist;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dvargas
 */
@Service
public class PerfilServiceImpl implements PerfilService {

     @Autowired
    private PerfilDao perfilDao;
     
     @Autowired
     private PlaylistDao playlistDao;
     
     @Override
    @Transactional(readOnly = true)
    public List<Perfil> getPerfiles() {
return (List<Perfil>) perfilDao.findAll();
    }

     @Override
    @Transactional(readOnly = true)
    public Perfil getPerfil(Perfil perfil) {
        return perfilDao.findById(perfil.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Perfil perfil) {
        
    Playlist playlist = perfil.getPlaylist();
    playlist = playlistDao.save(playlist);
    perfil.setPlaylist(playlist);
        
    perfilDao.save(perfil);
    }
    
    @Override
    @Transactional
    public void saveNombre(Perfil perfil) {
     perfilDao.save(perfil);
    }

    @Override
    @Transactional
    public void delete(Perfil perfil) {
perfilDao.delete(perfil);    
    }
    
}
