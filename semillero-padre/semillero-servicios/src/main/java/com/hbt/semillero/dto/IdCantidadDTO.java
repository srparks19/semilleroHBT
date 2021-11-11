package com.hbt.semillero.dto;

import java.math.BigDecimal;

/**
 * 
 * <b>Descripción:<b> Clase que determina el dto para gestionar la compra del comic
 * <b>Caso de Uso:<b> 
 * @author Sebastian Perez Lopez
 * @version
 */
public class IdCantidadDTO extends ResultadoDTO{
	
	private static final long serialVersionUID = 1L;
	/**
	 * Atributo que almacena el id del comic
	 */
	private Long id;
	
	/**
	 * Atributo que almacena la cantidad del comic
	 */
	private Integer cantidad;
	
	
	/**
	 * 
	 * Constructor de la clase.
	 */
	public IdCantidadDTO() {
		//Constructor vacio
	}
	
	/**
	 * 
	 * Constructor de la clase.
	 * @param id
	 * @param cantidad
	 */
	public IdCantidadDTO(Long id, Integer cantidad) {
		this.id = id;
		this.cantidad = cantidad;
		
	}

	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo id
	 * @param id El nuevo id a modificar.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo cantidad
	 * @return El cantidad asociado a la clase
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo cantidad
	 * @param cantidad El nuevo cantidad a modificar.
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
