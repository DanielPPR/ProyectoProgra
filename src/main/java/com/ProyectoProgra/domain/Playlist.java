/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoProgra.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author Daniel
 */
@Data
@Entity
@Table(name="playlist")
public class Playlist {
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_playlist")
    private Long idPlaylist;
    String nombreplaylist;
    boolean publicoprivado;
    
   
            
   
    @JoinColumn(name="id_cancion", referencedColumnName="id_cancion")
    @ManyToOne
    private Cancion cancion;

     public Playlist() {
    }

    public Playlist(String nombreplaylist, boolean publicoprivado, Perfil perfil, Cancion cancion) {
       
        this.nombreplaylist = nombreplaylist;
        this.publicoprivado = publicoprivado;
        this.cancion = cancion;
    }

    

}
