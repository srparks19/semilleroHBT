package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ConsultaNombrePrecioComicDTO;
import com.hbt.semillero.dto.ConsultarComicTamanioNombreDTO;
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
	
	/**
	 * 
	 * Metodo encargado de ConsultaNombrePrecioComicDTO
	 * <b>Caso de Uso</b>
	 * @author Sebastian Perez Lopez
	 * 
	 * @param idComic
	 * @return
	 */
	public ConsultaNombrePrecioComicDTO consultarNombrePrecioComic(Long idComic);
	
	/**
	 * 
	 * Metodo encargado de crearComic
	 * <b>Caso de Uso</b>
	 * @author Sebastian Perez Lopez
	 * 
	 * @param comicDTO
	 * @return
	 * @throws Exception
	 */

	public ComicDTO crearComic(ComicDTO comicDTO) throws Exception;
	
	/**
	 * 
	 * Metodo encargado de actualizarComic
	 * <b>Caso de Uso</b>
	 * @author Sebastian Perez Lopez
	 * 
	 * @param idComic
	 * @return
	 */
	
	public ResultadoDTO actualizarComic(ComicDTO comicDTO);
	
	/**
	 * 
	 * Metodo encargado de eliminarComic
	 * <b>Caso de Uso</b>
	 * @author Sebastian Perez Lopez
	 * 
	 * @param idComic
	 * @return
	 */
	
	public ResultadoDTO eliminarComic(Long idComic);
	
	/**
	 * 
	 * Metodo encargado de consultarComics
	 * <b>Caso de Uso</b>
	 * @author Sebastian Perez Lopez
	 * 
	 * @return
	 */
	
	public List<ComicDTO> consultarComics();
	
	/**
	 * 
	 * Metodo encargado de gestionar el tamaño de los comics
	 * <b>Caso de Uso</b>
	 * @author Sebastian Perez Lopez
	 * 
	 * @param lengthComic
	 * @return
	 */
	public ConsultarComicTamanioNombreDTO consultarComicTamanioNombre(Short lengthComic);
	
	/**
	 * 
	 * Metodo encargado de consultar un comic
	 * <b>Caso de Uso</b>
	 * @author Sebastian Perez Lopez
	 * 
	 * @param comicDTO
	 * @return
	 */
	public ComicDTO consultarUnComic(Long idComic);

}
