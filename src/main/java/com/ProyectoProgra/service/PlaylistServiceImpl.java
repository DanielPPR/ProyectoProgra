/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoProgra.service;

import com.ProyectoProgra.Dao.CancionDao;
import com.ProyectoProgra.Dao.PerfilDao;
import com.ProyectoProgra.Dao.PlaylistDao;
import com.ProyectoProgra.domain.Cancion;
import com.ProyectoProgra.domain.Perfil;
import com.ProyectoProgra.domain.Playlist;
import com.ProyectoProgra.domain.Playlist;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Daniel
 */
@Service
public class PlaylistServiceImpl implements PlaylistService {

         @Autowired
    private PlaylistDao playlistDao;
         @Autowired
    private PerfilDao perfilDao;
         @Autowired
    private CancionDao cancionDao;
     
     @Override
    @Transactional(readOnly = true)
    public List<Playlist> getPlaylists() {
return (List<Playlist>) playlistDao.findAll();
    }

     @Override
    @Transactional(readOnly = true)
    public Playlist getPlaylist(Playlist playlist) {
        return playlistDao.findById(playlist.getIdPlaylist()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Playlist playlist) {
        
    Cancion cancion = playlist.getCancion();
    cancion = cancionDao.save(cancion);
    playlist.setCancion(cancion);
        
playlistDao.save(playlist);
    }

    @Override
    @Transactional
    public void delete(Playlist playlist) {
playlistDao.delete(playlist);    
    }
    
}
