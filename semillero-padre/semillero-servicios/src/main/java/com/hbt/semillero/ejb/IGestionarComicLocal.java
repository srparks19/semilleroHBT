package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ConsultaNombrePrecioComicDTO;
import com.hbt.semillero.dto.ResultadoDTO;

/**
 * 
 * <b>Descripción:<b> Clase que determina la interface para la gestion de los comics
 * <b>Caso de Uso:<b> Semillero HBT 2021
 * @author Sebastian Perez Lopez
 * @version
 */

@Local
public interface IGestionarComicLocal {
	
	public ConsultaNombrePrecioComicDTO consultarNombrePrecioComic(Long idComic);

	public ComicDTO crearComic(ComicDTO comicDTO) throws Exception;
	
	public ResultadoDTO actualizarComic(Long idComic);
	
	public ResultadoDTO eliminarComic(Long idComic);
	
	public List<ComicDTO> consultarComics();

}
