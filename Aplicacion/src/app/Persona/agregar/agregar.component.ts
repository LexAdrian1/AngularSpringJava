import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../../Service/service.service';
import { Router } from '@angular/router';
import { Persona } from 'src/app/Modelo/Persona';

@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.component.html',
  styleUrls: ['./agregar.component.scss']
})
export class AgregarComponent implements OnInit {

  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit() {
  }

  Guardar(persona:Persona){
    this.service.setPersona(persona)
    .subscribe(data =>{
      alert("Persona Creada");
      this.router.navigate(["listar"])
    })

  }

}
