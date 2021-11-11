package com.hbt.semillero.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.IdCantidadDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.ejb.IGestionarCompraComic;

/**
 * 
 * <b>Descripción:<b> Clase que determina el rest para gestionar la compra del comic
 * <b>Caso de Uso:<b> 
 * @author Sebastian Perez Lopez
 * @version
 */

@Path("/gestionarCompra")
public class GestionarCompraComicRest {
	
	/**
	 * 
	 */
	@EJB
	private IGestionarCompraComic gestionarCompraComic;
	
	/**
	 * 
	 * Metodo encargado del rest para realizar la compra
	 * <b>Caso de Uso</b>
	 * @author Sebatian Perez Lopez
	 * 
	 * @param idCantidadDTO
	 * @return 
	 */
	@POST
	@Path("/comprarComic")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResultadoDTO comprarComic(IdCantidadDTO idCantidadDTO) {
		ResultadoDTO compraResultado = new ResultadoDTO();
		try {
			compraResultado = this.gestionarCompraComic.comprarComic(idCantidadDTO);
		}catch (Exception e) {
			compraResultado.setExitoso(false);
			compraResultado.setMensajeEjecucion(e.getMessage());
		}
		return compraResultado;
	} 

}
