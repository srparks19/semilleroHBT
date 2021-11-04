package com.hbt.semillero.dto;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * 
 * <b>Descripción:<b> Clase que determina el dto para los comics que superan cierto tamanio
 * <b>Caso de Uso:<b> Semillero HBT 2021
 * @author Sebastian Perez Lopez
 * @version
 */
public class ConsultarComicTamanioNombreDTO  extends ResultadoDTO {


	private static final long serialVersionUID = 1L;
	/**
	 * Lista de comics que no superan el tamaño
	 */
	private ArrayList<String> comicsNoSuperanTamanio;
	/**
	 * Lista de comics que superan el tamaño
	 */
	private ArrayList<String> comicsSuperanTamanio;
	
	/**
	 * 
	 * Constructor de la clase.
	 */
	public ConsultarComicTamanioNombreDTO() {
		//Constructor vacio
	}
	
	/**
	 * 
	 * Constructor de la clase.
	 * @param comicsNoSuperanTamanio
	 * @param comicsSuperanTamanio
	 */
	public ConsultarComicTamanioNombreDTO(ArrayList<String> comicsNoSuperanTamanio, ArrayList<String> comicsSuperanTamanio) {
		this.comicsNoSuperanTamanio = comicsNoSuperanTamanio;
		this.comicsSuperanTamanio = comicsSuperanTamanio;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo comicsNoSuperanTamanio
	 * @return El comicsNoSuperanTamanio asociado a la clase
	 */
	public ArrayList<String> getComicsNoSuperanTamanio() {
		return comicsNoSuperanTamanio;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo comicsNoSuperanTamanio
	 * @param comicsNoSuperanTamanio El nuevo comicsNoSuperanTamanio a modificar.
	 */
	public void setComicsNoSuperanTamanio(ArrayList<String> comicsNoSuperanTamanio) {
		this.comicsNoSuperanTamanio = comicsNoSuperanTamanio;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo comicsSuperanTamanio
	 * @return El comicsSuperanTamanio asociado a la clase
	 */
	public ArrayList<String> getComicsSuperanTamanio() {
		return comicsSuperanTamanio;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo comicsSuperanTamanio
	 * @param comicsSuperanTamanio El nuevo comicsSuperanTamanio a modificar.
	 */
	public void setComicsSuperanTamanio(ArrayList<String> comicsSuperanTamanio) {
		this.comicsSuperanTamanio = comicsSuperanTamanio;
	}
	
	
}
