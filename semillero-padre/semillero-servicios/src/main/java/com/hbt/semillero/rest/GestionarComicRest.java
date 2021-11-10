package com.hbt.semillero.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ConsultaNombrePrecioComicDTO;
import com.hbt.semillero.dto.ConsultarComicTamanioNombreDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.ejb.IGestionarComicLocal;

/**
 * 
 * <b>Descripción:<b> Clase que determina los servicios
 * <b>Caso de Uso:<b> 
 * @author Sebastian Perez Lopez
 * @version
 */
@Path("/gestionarComic")
public class GestionarComicRest {
	
	@EJB
	private IGestionarComicLocal gestionarComicLocal;
	
	/**
	 * 
	 * Metodo encargado de realizar el servicio consultarNombrePrecioComic
	 * <b>Caso de Uso</b>
	 * @author Sebastian Perez Lopez
	 * 
	 * @param idComic
	 * @return
	 */
	@GET
	@Path("/consultarNombrePrecioComic")
	@Produces(MediaType.APPLICATION_JSON)
	public ConsultaNombrePrecioComicDTO consultarNombrePrecioComic(@QueryParam("idComic") Long idComic) {
		return this.gestionarComicLocal.consultarNombrePrecioComic(idComic);
	}
	
	/**
	 * 
	 * Metodo encargado de realizar el servicio consultarComicTamanioNombre
	 * <b>Caso de Uso</b>
	 * @author Sebastian Perez Lopez
	 * 
	 * @param lengthComic
	 * @return
	 * 
	 * Ejercicio del taller 2
	 */
	@GET
	@Path("/consultarComicTamanioNombre")
	@Produces(MediaType.APPLICATION_JSON)
	public ConsultarComicTamanioNombreDTO consultarComicTamanioNombre(@QueryParam("lengthComic") Short lengthComic) {
		return this.gestionarComicLocal.consultarComicTamanioNombre(lengthComic);
	}
	
	/**
	 * 
	 * Metodo encargado del servicio crearComic
	 * <b>Caso de Uso</b>
	 * @author Sebastian Perez Lopez
	 * 
	 * @param comicDTO
	 * @return
	 */
	@POST
	@Path("/crearComic")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ComicDTO crearComic(ComicDTO comicDTO) {
		ComicDTO comicDTOResult = new ComicDTO();
		try {
			comicDTOResult = this.gestionarComicLocal.crearComic(comicDTO);
		}  catch (Exception e) {
			comicDTOResult.setExitoso(false);
			comicDTOResult.setMensajeEjecucion("Se ha presentado un error tecnico, causa: " + e.getMessage());
		}
		return comicDTOResult;
	} 
	
	@GET
	@Path("/consultarComics")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ComicDTO> consultarComics() {
		return this.gestionarComicLocal.consultarComics();
	}
	
	@POST
	@Path("/eliminarComic")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResultadoDTO eliminarComic(Long idComic) {
		return this.gestionarComicLocal.eliminarComic(idComic);
	} 
	
	@POST
	@Path("/actualizarComic")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResultadoDTO actualizarComic(ComicDTO comicDTO) {
		return this.gestionarComicLocal.actualizarComic(comicDTO);
	} 
	
}
