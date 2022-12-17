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
 * @author dvargas
 */
@Data
@Entity
@Table(name="clientes")
public class Perfil implements Serializable {
    
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cliente")
    private Long idCliente;
    private Long idPlaylist;
    private String nombre;
    private String apellido;
    private int celular;
    private int identificacion;
    private String usercliente;
    private String passwordcliente;
    
    public Perfil() {
    }

    public Perfil( Long idPlaylist, String nombre, String apellido, int celular, int identificacion, String usercliente, String passwordcliente) {
      
        this.idPlaylist = idPlaylist;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.identificacion = identificacion;
        this.usercliente = usercliente;
        this.passwordcliente = passwordcliente;
    }

   
    
 
}

