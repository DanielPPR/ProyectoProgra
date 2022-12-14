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
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author Daniel
 */
@Data
@Entity
@Table(name="canciones")
public class Cancion {
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cancion")
    private Long idCancion;
    String nombrecancion;
    String duracion;
    
     /*Cancion trae a Genero y cantante*/
    
    
    @JoinColumn(name="id_cantante", referencedColumnName="id_cantante")
    @ManyToOne
    private Cantante cantante;
            
   
    @JoinColumn(name="id_genero", referencedColumnName="id_genero")
    @ManyToOne
    private Genero genero;

    
    public Cancion() {
}
    
    public Cancion(String nombrecancion, String duracion, Genero genero, Cantante cantante) {
    
        this.nombrecancion = nombrecancion;
        this.duracion = duracion;
       this.genero = genero;
      this.cantante = cantante;
    }

  
}
