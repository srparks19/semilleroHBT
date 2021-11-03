package com.hbt.semillero.dto;

import java.math.BigDecimal;

/**
 * 
 * <b>Descripción:<b> Clase que determina el dto para gestionar la consulta de los nombres y precios de los comics
 * <b>Caso de Uso:<b> Semillero HBT 2021
 * @author Sebastian Perez Lopez
 * @version
 */
public class ConsultaNombrePrecioComicDTO extends ResultadoDTO {


	private static final long serialVersionUID = 1L;
	private String nombre;
	private BigDecimal precio;
	
	public ConsultaNombrePrecioComicDTO() {
		//Constructor vacio
	}
	
	public ConsultaNombrePrecioComicDTO(String nombre, BigDecimal precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
}
