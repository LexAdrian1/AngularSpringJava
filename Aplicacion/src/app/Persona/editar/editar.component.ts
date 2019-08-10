import { Component, OnInit } from '@angular/core';
import { ServiceService } from 'src/app/Servic5e/service.service';
import { Router } from '@angular/router';
import { Persona } from 'src/app/Modelo/Persona';

@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.scss']
})
export class EditarComponent implements OnInit {
  persona: Persona = new  Persona();
  constructor() { }

  ngOnInit() {
  }

  Editar(){
    let id=localStorage.getItem("cedula");
    this.service.getPersonaCedula(+cedula)
    .subscribe(data=>{
      this.persona=data;
    }

    )
  }
}
