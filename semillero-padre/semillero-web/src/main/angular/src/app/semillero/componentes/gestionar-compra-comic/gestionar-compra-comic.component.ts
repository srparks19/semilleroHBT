import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ComicDTO } from '../../dto/comic-dto';
import { CompraDTO } from '../../dto/compra-dto';
import { GestionarComicService } from '../../servicios/gestionar-comic.service';

@Component({
  selector: 'gestionar-compra-comic',
  templateUrl: './gestionar-compra-comic.component.html',
  styleUrls: ['./gestionar-compra-comic.component.css']
})
export class GestionarCompraComicComponent implements OnInit {

  public comicDTO : ComicDTO;

  public gestionarComicForm : FormGroup;

  public submitted : boolean;

  public mostrarItem : boolean;

  public mensajeEjecucion : String;

  constructor(private router : Router, private activatedRoute: ActivatedRoute, private fb : FormBuilder, private gestionComicsService : GestionarComicService) {
    console.log("entro al constructor del componente de compra");
    this.gestionarComicForm = this.fb.group({
      cantidad : [null, Validators.required]
    });
   }

  ngOnInit() {
    let comic : any = this.activatedRoute.snapshot.params;
    this.comicDTO = comic;
    this.mostrarItem = false;
  }

  public comprarComic() : void {
    this.submitted = true;
    if (this.gestionarComicForm.invalid) {
      return;
    }

    let compraDTO = new CompraDTO

    compraDTO.id = this.comicDTO.id
    compraDTO.cantidad = this.gestionarComicForm.controls.cantidad.value;

    this.gestionComicsService.comprarComic(compraDTO).subscribe(data=> {
      if (data.exitoso) {
        this.mensajeEjecucion =data.mensajeEjecucion;
        console.log(data.mensajeEjecucion);
        this.router.navigate(['gestionar-comic']);
      } else {
        console.log(data.mensajeEjecucion);
        this.mensajeEjecucion =data.mensajeEjecucion;
        this.mostrarItem = true;
      }
    }, error => {
      console.log(error);
    });
  }

  public cerrar() : void{
    this.mostrarItem = false;
  }

  get f() {
    return this.gestionarComicForm.controls;
  }



}
