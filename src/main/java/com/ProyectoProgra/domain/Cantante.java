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
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;


/**
 *
 * @author Daniel
 */
@Data
@Entity
@Table(name="cantante")
public class Cantante implements Serializable {
   private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cantante")
    private Long idCantante;
    private String nombrecantante;
    
    public Cantante() {
    }
    
    public Cantante(String nombrecantante) {
        this.nombrecantante = nombrecantante;
    }
    
}
