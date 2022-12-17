/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoProgra.service;

import com.ProyectoProgra.Dao.CancionDao;
import com.ProyectoProgra.Dao.CantanteDao;
import com.ProyectoProgra.Dao.GeneroDao;
import com.ProyectoProgra.domain.Cancion;
import com.ProyectoProgra.domain.Cantante;
import com.ProyectoProgra.domain.Genero;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Daniel
 */
@Service
public class CancionServiceImpl implements CancionService{

    @Autowired
    private CancionDao cancionDao;
    
    @Autowired
    private GeneroDao generoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Cancion> getCanciones() {
    return (List<Cancion>) cancionDao.findAll();
    }

     @Override
    @Transactional(readOnly = true)
    public Cancion getCancion(Cancion cancion) {
        return cancionDao.findById(cancion.getIdCancion()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cancion cancion) {
    Genero genero = cancion.getGenero();
    genero = generoDao.save(genero);
    cancion.setGenero(genero);
    cancionDao.save(cancion);
    }

     @Override
    @Transactional
    public void delete(Cancion cancion) {
    cancionDao.delete(cancion);
    }
    
}
