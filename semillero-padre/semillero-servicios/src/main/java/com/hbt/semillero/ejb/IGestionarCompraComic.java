package com.hbt.semillero.ejb;

import javax.ejb.Local;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.IdCantidadDTO;
import com.hbt.semillero.dto.ResultadoDTO;

/**
 * 
 * <b>Descripción:<b> Clase que determina la interfaz de gestionar la compra de un comic
 * <b>Caso de Uso:<b> 
 * @author Sebastian Perez Lopez
 * @version
 */

@Local
public interface IGestionarCompraComic {
	
	/**
	 * 
	 * Metodo encargado de gestionar la compra del comic
	 * <b>Caso de Uso</b>
	 * @author Sebastian Perez Lopez
	 * 
	 * @param idCantidadDTO
	 * @return
	 */
	
	public ResultadoDTO comprarComic(IdCantidadDTO idCantidadDTO) throws Exception;

}
