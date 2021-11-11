package com.hbt.semillero.ejb;

import java.time.LocalDate;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.hbt.semillero.dto.IdCantidadDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.enums.EstadoEnum;

/**
 * 
 * <b>Descripción:<b> Clase que determina la logica del servicio para comprar un comic
 * <b>Caso de Uso:<b> 
 * @author Sebastian Perez Lopez
 * @version
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class GestionarCompraComicBean implements IGestionarCompraComic {
	
	/**
	 * Entity Manager
	 */
	@PersistenceContext
	public EntityManager em;

	/**
	 * 
	 * @see com.hbt.semillero.ejb.IGestionarCompraComic#comprarComic(com.hbt.semillero.dto.IdCantidadDTO)
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public ResultadoDTO comprarComic(IdCantidadDTO idCantidadDTO) throws Exception {
		Long idComic = idCantidadDTO.getId();
		int cantidadComic = idCantidadDTO.getCantidad();
		Comic comic = new Comic();
		ResultadoDTO resultadoCompra = new ResultadoDTO();
		String comicConsulta = "SELECT c FROM Comic c WHERE c.id = :idComic";
		try {
			Query queryComic = em.createQuery(comicConsulta);
			queryComic.setParameter("idComic", idComic);
			comic = (Comic) queryComic.getSingleResult();
			
			if(comic.getEstadoEnum() == EstadoEnum.ACTIVO) {
				if(comic.getCantidad() >= cantidadComic) {
					int stock = comic.getCantidad() - cantidadComic;
					if (stock > 0) {
						comic.setCantidad(stock);
						comic.setFechaVenta(LocalDate.now());
					}else {
						comic.setCantidad(stock);
						comic.setEstadoEnum(EstadoEnum.INACTIVO);
						comic.setFechaVenta(LocalDate.now());
					}
					resultadoCompra.setExitoso(true);
					resultadoCompra.setMensajeEjecucion("La compra fue exitosa");
					em.merge(comic);
				}else {
					String mensaje = "La cantidad existente del comic es: " + comic.getCantidad() + ", y supera la ingresada";
					throw new Exception(mensaje);
				}
			}else {
				throw new Exception("El comic seleccionado no cuenta con stock en bodega");
			}
			
			
		}catch (Exception e) {
			resultadoCompra.setExitoso(false);
			resultadoCompra.setMensajeEjecucion(e.getMessage());
		}
		return resultadoCompra;
	}

}
