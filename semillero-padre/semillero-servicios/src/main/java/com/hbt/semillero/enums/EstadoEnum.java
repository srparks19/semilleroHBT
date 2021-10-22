package com.hbt.semillero.enums;

/**
 * 
 * <b>Descripción:<b> Clase que determina la enumeracion para representar los estados un comic
 * <b>Caso de Uso:<b> Semillero HBT 2021
 * @author Sebastian Perez Lopez
 * @version 1.0
 */

public enum EstadoEnum {
	
	ACTIVO("enum.estado.activo"),
	INACTIVO("enum.estado.activo"),
	;
	
	/**
	 * Atributo que almacena el estado de la columna SCESTADO
	 */
	private String descripcion;
	
	/**
	 * 
	 * Constructor de la clase.
	 * @param Recibe como parametro un String con el estado del comic
	 */
	EstadoEnum(String descripcion){
		this.descripcion = descripcion;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo descripcion
	 * @return El descripcion asociado a la clase
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	

}
