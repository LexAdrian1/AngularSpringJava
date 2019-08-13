/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Aplicacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class PersonaServiceImp implements PersonaService{

    @Autowired
    private PersonaRepositorio repositorio;
    
    @Override
    public List<Persona> listar() {
        return repositorio.findAll();
    }

    @Override
    public Persona listarCedula(String cedula) {
        return repositorio.findOne(cedula);
    }

    @Override
    public Persona agregarPersona(Persona p) {
        return repositorio.save(p);
    }

    @Override
    public Persona editarPersona(Persona p) {
        return repositorio.save(p);
    }
    
    
    @Override
    public Persona eliminarPersona(String cedula) {
        Persona p=repositorio.findOne(cedula);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
    
}
