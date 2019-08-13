/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Aplicacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
/**
 *
 * @author Usuario
 */
public class Controlador {
    
    @Autowired
    PersonaService service;
    
    @GetMapping
    public List<Persona>listar(){
        return service.listar();
    }
    
    @PostMapping
    public Persona agregar(@RequestBody Persona p){
        return service.agregarPersona(p);
    }
    
    @GetMapping(path = {"/{cedula}"})
    public Persona listarCedula(@PathVariable("cedula") String cedula){
        return service.listarCedula(cedula);
    }
    
    @PutMapping(path = {"/{cedula}"})
    public Persona editar(@RequestBody Persona p,@PathVariable("cedula") int id){
        p.setId(id);
        return service.editarPersona(p);
    }
    
    @DeleteMapping(path = {"/{cedula}"})
    public Persona delete(@PathVariable("cedula") String cedula){
        return service.eliminarPersona(cedula);
    }
}
