import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ComicDTO } from '../../dto/comic-dto';
import { GestionarComicService } from '../../servicios/gestionar-comic.service';

@Component({
  selector: 'ver-comic',
  templateUrl: './ver-comic.component.html',
  styleUrls: ['./ver-comic.component.css']
})
export class VerComicComponent implements OnInit {

  public comicDTO : ComicDTO;

  public gestionarComicForm : FormGroup;

  constructor(private fb : FormBuilder, private router : Router, private gestionComicsService : GestionarComicService) { 
    this.gestionarComicForm = this.fb.group({
      id : [null, Validators.required]
    });
  }

  ngOnInit() {
    this.comicDTO = new ComicDTO();
  }

  public consultarUnComic() : void{

    let idComic = this.gestionarComicForm.controls.id.value;

    this.gestionComicsService.consultarUnComic(idComic).subscribe(data => {
      if (data.exitoso) {
        this.comicDTO = data;
        console.log(data.mensajeEjecucion);
      } else {
        console.log(data.mensajeEjecucion);
      }
    }, error => {
      console.log(error);
    });

  }

}
