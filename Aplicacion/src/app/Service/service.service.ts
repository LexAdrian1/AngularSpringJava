import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Persona } from '../Modelo/Persona';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  persona:Persona
  constructor(private http:HttpClient) { }

  Url='http://localhost:8080/Aplicacion/personas';

  getPersonas(){
    return this.http.get<Persona[]>(this.Url);
  }

  setPersona(persona:Persona){
    return this.http.post<Persona[]>(this.Url,persona);
  }

  getPersonaCedula(cedula:string){
    return this.http.post<Persona[]>(this.Url+"/"+cedula);
  }

  updatePersona(persona:Persona){
    return this.http.put<Persona[]>(this.Url+"/"+this.persona.cedula, persona);
  }
}
