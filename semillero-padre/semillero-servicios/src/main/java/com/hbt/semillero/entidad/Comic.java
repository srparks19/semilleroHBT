package com.hbt.semillero.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;

/**
 * 
 * <b>Descripción:<b> Clase que determina el mapeo de la tabla comic de la base de datos DB_SEMILLERO
 * <b>Caso de Uso:<b> Semillero 2021
 * @author Sebastian Perez Lopez
 * @version 1.0
 */

@Entity
@Table(name = "COMIC") 
public class Comic implements Serializable {
	
	/**
	 * Atributos
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(allocationSize = 1, name = "COMIC_SCID_GENERATOR", sequenceName = "SEQ_COMIC")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMIC_SCID_GENERATOR")
	
	/**
	 * Atributo que almacena el ID de un comic
	 */
	@Column(name = "SCID")
	private Long id;
	
	/**
	 * Atributo que almacena el nombre de un comic
	 */
	@Column(name = "SCNOMBRE")
	private String nombre;
	
	/**
	 * Atributo que almacena la editorial de un comic
	 */
	@Column(name = "SCEDITORIAL")
	private String editorial;
	
	/**
	 * Atributo que almacena la tematica de un comic
	 */
	@Column(name = "SCETEMATICA")
	@Enumerated(value = EnumType.STRING)
	private TematicaEnum tematicaEnum;
	
	/**
	 * Atributo que almacena la coleccion de un comic
	 */
	@Column(name = "SCCOLECCION")
	private String coleccion;
	
	/**
	 * Atributo que almacena el numero de paginas de un comic
	 */
	@Column(name = "SCNUMEROPAGINAS")
	private Integer numeroPaginas;
	
	/**
	 * Atributo que almacena el precio de un comic
	 */
	@Column(name = "SCPRECIO")
	private BigDecimal precio;
	
	/**
	 * Atributo que almacena los autores de un comic
	 */
	@Column(name = "SCAUTORES")
	private String autores;
	
	/**
	 * Atributo que almacena el color de un comic
	 */
	@Column(name = "SCCOLOR")
	private Boolean color;
	
	/**
	 * Atributo que almacena la fecha de venta de un comic
	 */
	@Column(name = "SCFECHA_VENTA")
	private LocalDate fechaVenta;
	
	/**
	 * Atributo que almacena el estado de un comic
	 */
	@Column(name = "SCESTADO")
	@Enumerated(value = EnumType.STRING)
	private EstadoEnum estadoEnum;
	
	/**
	 * Atributo que almacena la cantidad de un comic
	 */
	@Column(name = "SCCANTIDAD")
	private Integer cantidad;
	
	/**
	 * 
	 * Constructor de la clase.
	 * @param id
	 * @param nombre
	 * @param editorial
	 * @param tematicaEnum
	 * @param coleccion
	 * @param numeroPaginas
	 * @param precio
	 * @param autores
	 * @param color
	 * @param fechaVenta
	 * @param estadoEnum
	 * @param cantidad
	 */
	Comic(Long id, String nombre, String editorial, TematicaEnum tematicaEnum, String coleccion, Integer numeroPaginas, BigDecimal precio, String autores, Boolean color, LocalDate fechaVenta, EstadoEnum estadoEnum, Integer cantidad){
		this.id = id;
		this.nombre = nombre;
		this.editorial = editorial;
		this.tematicaEnum = tematicaEnum;
		this.coleccion = coleccion;
		this.numeroPaginas = numeroPaginas;
		this.precio = precio;
		this.autores = autores;
		this.color = color;
		this.fechaVenta = fechaVenta;
		this.estadoEnum = estadoEnum;
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
	 * Metodo encargado de retornar el valor del atributo nombre
	 * @return El nombre asociado a la clase
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo nombre
	 * @param nombre El nuevo nombre a modificar.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo editorial
	 * @return El editorial asociado a la clase
	 */
	public String getEditorial() {
		return editorial;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo editorial
	 * @param editorial El nuevo editorial a modificar.
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	/**
	 * Metodo encargado de retornar el valor del atributo coleccion
	 * @return El coleccion asociado a la clase
	 */
	public String getColeccion() {
		return coleccion;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo coleccion
	 * @param coleccion El nuevo coleccion a modificar.
	 */
	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo numeroPaginas
	 * @return El numeroPaginas asociado a la clase
	 */
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo numeroPaginas
	 * @param numeroPaginas El nuevo numeroPaginas a modificar.
	 */
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo precio
	 * @return El precio asociado a la clase
	 */
	public BigDecimal getPrecio() {
		return precio;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo precio
	 * @param precio El nuevo precio a modificar.
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo autores
	 * @return El autores asociado a la clase
	 */
	public String getAutores() {
		return autores;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo autores
	 * @param autores El nuevo autores a modificar.
	 */
	public void setAutores(String autores) {
		this.autores = autores;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo color
	 * @return El color asociado a la clase
	 */
	public Boolean getColor() {
		return color;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo color
	 * @param color El nuevo color a modificar.
	 */
	public void setColor(Boolean color) {
		this.color = color;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo fechaVenta
	 * @return El fechaVenta asociado a la clase
	 */
	public LocalDate getFechaVenta() {
		return fechaVenta;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo fechaVenta
	 * @param fechaVenta El nuevo fechaVenta a modificar.
	 */
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
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
	/**
	 * Metodo encargado de retornar el valor del atributo tematicaEnum
	 * @return El tematicaEnum asociado a la clase
	 */
	public TematicaEnum getTematicaEnum() {
		return tematicaEnum;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo tematicaEnum
	 * @param tematicaEnum El nuevo tematicaEnum a modificar.
	 */
	public void setTematicaEnum(TematicaEnum tematicaEnum) {
		this.tematicaEnum = tematicaEnum;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo estadoEnum
	 * @return El estadoEnum asociado a la clase
	 */
	public EstadoEnum getEstadoEnum() {
		return estadoEnum;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo estadoEnum
	 * @param estadoEnum El nuevo estadoEnum a modificar.
	 */
	public void setEstadoEnum(EstadoEnum estadoEnum) {
		this.estadoEnum = estadoEnum;
	}
	/** 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Comic [id=" + id + ", nombre=" + nombre + ", editorial=" + editorial + ", tematicaEnum=" + tematicaEnum
				+ ", coleccion=" + coleccion + ", numeroPaginas=" + numeroPaginas + ", precio=" + precio + ", autores="
				+ autores + ", color=" + color + ", fechaVenta=" + fechaVenta + ", estadoEnum=" + estadoEnum
				+ ", cantidad=" + cantidad + "]";
	}
	
	
	
}
