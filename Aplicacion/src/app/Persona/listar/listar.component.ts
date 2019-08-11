import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../../Service/service.service';
import { Router } from '@angular/router';
import { Persona } from 'src/app/Modelo/Persona';
@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.scss']
})
export class ListarComponent implements OnInit {

  personas: Persona[];
  constructor(private service:ServiceService, private router:Router) { }

  ngOnInit() {
    this.service.getPersonas()
    .subscribe(data =>{
      this.personas=data
    })
  }

  Editar(persona:Persona):void{
    localStorage.setItem("cedula",persona.cedula.toString());
    this.router.navigate(["editar"]);
  }
}
