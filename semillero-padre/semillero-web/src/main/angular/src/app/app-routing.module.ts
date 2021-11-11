import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GestionarCompraComicComponent } from './semillero/componentes/gestionar-compra-comic/gestionar-compra-comic.component';
import { GestionarComicComponent } from './semillero/componentes/gestionarComic/gestionar-comic/gestionar-comic.component';
import { BienvenidaComponent } from './semillero/componentes/home/bienvenida-component';
import { VerActualizarComponent } from './semillero/componentes/ver-actualizar/ver-actualizar.component';
import { VerComicComponent } from './semillero/componentes/ver-comic/ver-comic.component';

const routes: Routes = [
  { path: 'bienvenida', component: BienvenidaComponent, data : null },
  { path: 'gestionar-comic', component: GestionarComicComponent },
  { path: 'ver-actualizar', component: VerActualizarComponent },
  { path: 'ver-comic', component: VerComicComponent },
  { path: 'gestionar-compra-comic', component: GestionarCompraComicComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
