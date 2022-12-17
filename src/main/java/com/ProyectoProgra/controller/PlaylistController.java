/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoProgra.controller;

import com.ProyectoProgra.domain.Playlist;
import com.ProyectoProgra.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Daniel
 */
@Controller
public class PlaylistController {
      @Autowired
     private PlaylistService playlistService;
      
        @GetMapping("/playlist/cliente")
    public String inicio(Model model) {
        var playlists = playlistService.getPlaylists();
        model.addAttribute("playlists", playlists);
        return "/playlist/cliente";
    }

    @GetMapping("/playlist/nuevo")
    public String nuevoPlaylist(Playlist playlist) {
        return "/playlist/modificarPlaylist";
    }
    
     @PostMapping("/playlist/guardar")
    public String guardarPlaylist (Playlist playlist){
    playlistService.save(playlist);
    return "redirect:/playlist/cliente";
    }
    
    @GetMapping("/modificarPlaylist/{idCliente}")
public String modificarPlaylist(Playlist playlist, Model model){
playlist = playlistService.getPlaylist(playlist);
model.addAttribute("playlist", playlist);
return "/playlist/modificarPlaylist";
}

@GetMapping("/eliminarPlaylist/{idCliente}")
public String eliminarPlaylist(Playlist playlist){
playlistService.delete(playlist);
return "redirect:/playlist/cliente";
}
}
