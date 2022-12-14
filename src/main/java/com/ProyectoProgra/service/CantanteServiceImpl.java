/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoProgra.service;

import com.ProyectoProgra.Dao.CantanteDao;
import com.ProyectoProgra.domain.Cantante;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CantanteServiceImpl implements CantanteService{
    
    @Autowired
    private CantanteDao cantanteDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Cantante> getCantantes() {
    return (List<Cantante>) cantanteDao.findAll();
    }
    
    @Override
    @Transactional(readOnly = true)
    public Cantante getCantante(Cantante cantante) {
        return cantanteDao.findById(cantante.getIdCantante()).orElse(null);
    }

   @Override
   @Transactional
    public void save(Cantante cantante) {
    cantanteDao.save(cantante);
    }

    @Override
    @Transactional
    public void delete(Cantante cantante) {
      cantanteDao.delete(cantante);
    }

}
