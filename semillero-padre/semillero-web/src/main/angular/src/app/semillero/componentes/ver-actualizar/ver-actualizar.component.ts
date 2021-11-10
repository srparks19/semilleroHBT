import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ComicDTO } from '../../dto/comic-dto';
import { GestionarComicService } from '../../servicios/gestionar-comic.service';

@Component({
  selector: 'ver-actualizar',
  templateUrl: './ver-actualizar.component.html',
  styleUrls: ['./ver-actualizar.component.css']
})
export class VerActualizarComponent implements OnInit {

  public comicDTO : ComicDTO;

  public gestionarComicForm : FormGroup;

  public submitted : boolean;

  public mensajeEjecucion : String;

  constructor(private router : Router, private activatedRoute: ActivatedRoute, private fb : FormBuilder, private gestionComicsService : GestionarComicService) {
    console.log("entro al constructor del componente bienvenida");
    this.gestionarComicForm = this.fb.group({
      nombre : [null, Validators.required],
      editorial : [null, Validators.required],
      tematica : [null],
      coleccion : [null, Validators.required],
      numeroPaginas : [null, Validators.required],
      precio : [null, Validators.required],
      autores : [null],
      cantidad : [null, Validators.required],
      color : [true]
    });
  }

  ngOnInit() : void{
    let comic : any = this.activatedRoute.snapshot.params;
    this.comicDTO = comic;
    this.consultarComic();
  }

  public consultarComic() : void {
    let comic = this.comicDTO;
    this.f.nombre.setValue(comic.nombre);
    this.f.editorial.setValue(comic.editorial);
    this.f.tematica.setValue(comic.tematicaEnum);
    this.f.coleccion.setValue(comic.coleccion);
    this.f.numeroPaginas.setValue(comic.numeroPaginas);
    this.f.precio.setValue(comic.precio);
    this.f.autores.setValue(comic.autores);
    this.f.color.setValue(comic.color);
    this.f.cantidad.setValue(comic.cantidad);


    this.f.nombre.disable();
    this.f.editorial.disable();
    this.f.tematica.disable();
    this.f.coleccion.disable();
    this.f.numeroPaginas.disable();
    this.f.precio.disable();
    this.f.autores.disable();
    this.f.color.disable();
    this.f.cantidad.disable();
  }

  public activarCampos() : void {
    this.f.nombre.enable();
    this.f.editorial.enable();
    this.f.tematica.enable();
    this.f.coleccion.enable();
    this.f.numeroPaginas.enable();
    this.f.precio.enable();
    this.f.autores.enable();
    this.f.color.enable();
    this.f.cantidad.enable();
    //this.limpiarDatosComic();
  }

  private limpiarDatosComic() : void {
    this.submitted = false;
    this.gestionarComicForm.controls.nombre.setValue(null);
    this.gestionarComicForm.controls.editorial.setValue(null);
    this.gestionarComicForm.controls.tematica.setValue(null);
    this.gestionarComicForm.controls.coleccion.setValue(null);
    this.gestionarComicForm.controls.numeroPaginas.setValue(null);
    this.gestionarComicForm.controls.precio.setValue(null);
    this.gestionarComicForm.controls.autores.setValue(null);
    this.gestionarComicForm.controls.color.setValue(null);
    this.gestionarComicForm.controls.cantidad.setValue(null);
  }

  public actualizarComic() : void {
    this.submitted = true;
    if (this.gestionarComicForm.invalid) {
      return;
    }
    console.log(this.comicDTO);
    let comic = new ComicDTO();
    comic.id = this.comicDTO.id
    comic.nombre = this.gestionarComicForm.controls.nombre.value;
    comic.editorial = this.gestionarComicForm.controls.editorial.value;
    comic.tematicaEnum = this.gestionarComicForm.controls.tematica.value;
    comic.coleccion = this.gestionarComicForm.controls.coleccion.value;
    comic.numeroPaginas = this.gestionarComicForm.controls.numeroPaginas.value;
    comic.precio = this.gestionarComicForm.controls.precio.value;
    comic.autores = this.gestionarComicForm.controls.autores.value;
    comic.color = this.gestionarComicForm.controls.color.value;
    comic.estadoEnum = "ACTIVO";
    comic.cantidad = this.gestionarComicForm.controls.cantidad.value;

    this.gestionComicsService.actualizarComic(comic).subscribe(data=> {
      if (data.exitoso) {
        this.mensajeEjecucion =data.mensajeEjecucion;
        console.log(data.mensajeEjecucion);
        this.router.navigate(['gestionar-comic']);
      } else {
        this.mensajeEjecucion =data.mensajeEjecucion;
      }
    }, error => {
      console.log(error);
    });

    
    
    
  }

  get f() {
    return this.gestionarComicForm.controls;
  }

}
