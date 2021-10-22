package com.hbt.semillero.enums;

/**
 * 
 * <b>Descripción:<b> Clase que determina la enumeracion para representar los tipos de tematica aceptados por un comic
 * <b>Caso de Uso:<b> Semillero 2021
 * @author Sebastian Perez Lopez
 * @version 1.0
 */

public enum TematicaEnum {
	
	
	AVENTURA("enum.tematica.aventuras"),
	BELICO("enum.tematica.belico"),
	DEPORTIVO("enum.tematica.deportivo"),
	FANTASTICO("enum.tematica.fantastico"),
	CIENCIA_FICCION("enum.tematica.ciencia_ficcion"),
	HISTORICO("enum.tematica.historico"),
	HORROR("enum.tematica.horror"),
	HUMORISTICO("enum.tematica.humoristico"),
	;
	
	/**
	 * Atributo que almacena la descripcion del atributo SCTEMATICA
	 */
	private String descripcion;
	
	/**
	 * 
	 * Constructor de la clase.
	 * @param Recibe como parametro un String con la tematica del comic
	 */
	TematicaEnum(String descripcion){
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
