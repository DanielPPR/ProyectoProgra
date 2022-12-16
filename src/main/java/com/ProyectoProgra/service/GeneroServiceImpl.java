/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoProgra.service;

import com.ProyectoProgra.Dao.CantanteDao;
import com.ProyectoProgra.Dao.GeneroDao;
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
public class GeneroServiceImpl implements GeneroService{

     @Autowired
    private GeneroDao generoDao;
    
     @Override
    @Transactional(readOnly = true)
    public List<Genero> getGeneros() {
return (List<Genero>) generoDao.findAll();
    }

     @Override
    @Transactional(readOnly = true)
    public Genero getGenero(Genero genero) {
        return generoDao.findById(genero.getIdGenero()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Genero genero) {
generoDao.save(genero);
    }

    @Override
    @Transactional
    public void delete(Genero genero) {
generoDao.delete(genero);
    }
    
}
