import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable, Injector } from '@angular/core';
import { Observable } from 'rxjs';
import { ComicDTO } from '../dto/comic-dto';
import { AbstractService } from './template.service';

@Injectable({
  providedIn: 'root'
})
export class GestionarComicService extends AbstractService {

  constructor(private injector : Injector, private httpClient : HttpClient) { 
    super(injector);
  }

  public consultarComics() : Observable<any> {
    return this.httpClient.get('http://localhost:8085/semillero-servicios/rest/gestionarComic/consultarComics');
  }

  public crearComic(comicDTO : ComicDTO): Observable<any> {
    return this.httpClient.post('http://localhost:8085/semillero-servicios/rest/gestionarComic/crearComic',comicDTO);
  }

  public eliminarComic(idComic : number): Observable<any> {
    return this.httpClient.post('http://localhost:8085/semillero-servicios/rest/gestionarComic/eliminarComic', idComic);
  }

  public actualizarComic(comicDTO : ComicDTO): Observable<any> {
    return this.httpClient.post('http://localhost:8085/semillero-servicios/rest/gestionarComic/actualizarComic', comicDTO);
  }

  public consultarUnComic(idComic : number) : Observable<any> {

    let params = new HttpParams().set('idComic', idComic.toString());

    return this.httpClient.get('http://localhost:8085/semillero-servicios/rest/gestionarComic/consultarUnComic', {params : params});
  }
}
