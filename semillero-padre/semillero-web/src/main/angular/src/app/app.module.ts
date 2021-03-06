import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule} from '@angular/http';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { APP_BASE_HREF } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { MenuComponent } from './semillero/componentes/menu/menu-component';
//import { GestionarComicComponent } from './semillero/componentes/gestionarComic/gestionar-comic';
import { BienvenidaComponent } from './semillero/componentes/home/bienvenida-component';
import { GestionarComicComponent } from './semillero/componentes/gestionarComic/gestionar-comic/gestionar-comic.component';
import { VerActualizarComponent } from './semillero/componentes/ver-actualizar/ver-actualizar.component';
import { VerComicComponent } from './semillero/componentes/ver-comic/ver-comic.component';
import { GestionarCompraComicComponent } from './semillero/componentes/gestionar-compra-comic/gestionar-compra-comic.component';

// DTOs
//export { ComicDTO } from './semillero/dto/comic.dto';
//export { ResultadoDTO } from './semillero/dto/resultado.dto';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    BienvenidaComponent,
    GestionarComicComponent,
    VerActualizarComponent,
    VerComicComponent,
    GestionarCompraComicComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [
  	{ provide: APP_BASE_HREF, useValue: '/SemilleroHBT' }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { 

}
