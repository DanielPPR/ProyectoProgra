/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoProgra.service;

import com.ProyectoProgra.domain.Playlist;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface PlaylistService {
     public List<Playlist> getPlaylists(); 
     public Playlist getPlaylist(Playlist playlist);
     public void save(Playlist playlist);
     public void delete(Playlist playlist);
}
