/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Aplicacion;

import java.util.List;

/**
 *
 * @author Usuario
 */
public interface PersonaService {
    List<Persona>listar();
    Persona listarCedula(String cedula);
    Persona agregarPersona(Persona p);
    Persona editarPersona(Persona p); 
    Persona eliminarPersona(String cedula); 
}
