package semillero.pruebasUnitarias;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;

import junit.framework.Assert;

/**
 * 
 * <b>Descripción:<b> Clase que determina las pruebas unitarias para la entidad de COMICS
 * <b>Caso de Uso:<b> Semillero 2021
 * @author Sebastian Perez Lopez
 * @version 1.0
 */

public class CreacionComicTest {
	
	/**
	 * Constante que contendra el log de la clase CreacionComicTest
	 */
	private final static Logger log = Logger.getLogger(CreacionComicTest.class);
	
	/**
	 * 
	 * Metodo encargado de generar la lista de comics
	 * <b>Caso de Uso</b>Semillero HBT
	 * @author Sebastian Perez Lopez
	 * 
	 * @return Una lista de comics
	 */
	public ArrayList<ComicDTO> crearLista(){
		
		ComicDTO comic1 = new ComicDTO(1L,"Comic 1", "Planeta comic", TematicaEnum.AVENTURA, "Manga shonen", 100, new BigDecimal(10000), "Autor 1, Autor 2", true, LocalDate.now(), EstadoEnum.ACTIVO, 100);
		ComicDTO comic2 = new ComicDTO(2L,"Comic 2", "Planeta comic", TematicaEnum.BELICO, "Manga shonen", 100, new BigDecimal(10000), "Autor 1, Autor 2", true, LocalDate.now(), EstadoEnum.ACTIVO, 100);
		ComicDTO comic3 = new ComicDTO(3L,"Comic 3", "Planeta comic", TematicaEnum.CIENCIA_FICCION, "Manga shonen", 100, new BigDecimal(10000), "Autor 1, Autor 2", true, LocalDate.now(), EstadoEnum.ACTIVO, 100);
		ComicDTO comic4 = new ComicDTO(4L,"Comic 4", "Planeta comic", TematicaEnum.DEPORTIVO, "Manga shonen", 100, new BigDecimal(10000), "Autor 1, Autor 2", true, LocalDate.now(), EstadoEnum.ACTIVO, 100);
		ComicDTO comic5 = new ComicDTO(5L,"Comic 5", "Planeta comic", TematicaEnum.FANTASTICO, "Manga shonen", 100, new BigDecimal(10000), "Autor 1, Autor 2", true, LocalDate.now(), EstadoEnum.ACTIVO, 100);
		ComicDTO comic6 = new ComicDTO(6L,"Comic 6", "Planeta comic", TematicaEnum.HISTORICO, "Manga shonen", 100, new BigDecimal(10000), "Autor 1, Autor 2", true, LocalDate.now(), EstadoEnum.ACTIVO, 100);
		ComicDTO comic7 = new ComicDTO(7L,"Comic 7", "Planeta comic", TematicaEnum.HORROR, "Manga shonen", 100, new BigDecimal(10000), "Autor 1, Autor 2", true, LocalDate.now(), EstadoEnum.INACTIVO, 100);
		ComicDTO comic8 = new ComicDTO(8L,"Comic 8", "Planeta comic", TematicaEnum.HUMORISTICO, "Manga shonen", 100, new BigDecimal(10000), "Autor 1, Autor 2", true, LocalDate.now(), EstadoEnum.INACTIVO, 100);
		ComicDTO comic9 = new ComicDTO(9L,"Comic 9", "Planeta comic", TematicaEnum.AVENTURA, "Manga shonen", 100, new BigDecimal(10000), "Autor 1, Autor 2", true, LocalDate.now(), EstadoEnum.INACTIVO, 100);
		ComicDTO comic10 = new ComicDTO(10L,"Comic 10", "Planeta comic", TematicaEnum.BELICO, "Manga shonen", 100, new BigDecimal(10000), "Autor 1, Autor 2", true, LocalDate.now(), EstadoEnum.INACTIVO, 100);
		

		ArrayList<ComicDTO> comics = new ArrayList<ComicDTO>();
		comics.add(comic1);
		comics.add(comic2);
		comics.add(comic3);
		comics.add(comic4);
		comics.add(comic5);
		comics.add(comic6);
		comics.add(comic7);
		comics.add(comic8);
		comics.add(comic9);
		comics.add(comic10);
		
		return comics;
	}
	
	/**
	 * 
	 * Metodo encargado de validar y separa en una lista los comics con estado activo
	 * <b>Caso de Uso</b>Semillero HBT
	 * @author Sebastian Perez Lopez
	 * 
	 * @return Retorna una lista con los comics activos
	 */
	private ArrayList<ComicDTO> comicsActivos() {
		
		ArrayList<ComicDTO> comics = crearLista();
		ArrayList<ComicDTO> comicsActivos = new ArrayList<ComicDTO>();
		for (int i = 0; i <= comics.size() - 1; i++) {
			if(comics.get(i).getEstadoEnum() == EstadoEnum.ACTIVO) {
				comicsActivos.add(comics.get(i));
			}
        }
		return comicsActivos;
	}
	
	/**
	 * 
	 * Metodo encargado de validar y separa en una lista los comics con estado inactivo
	 * <b>Caso de Uso</b>Semillero HBT
	 * @author Sebastian Perez Lopez
	 * 
	 * @return Retorna una lista con los comics inactivos
	 */
	private boolean comicsInactivos() throws Exception {
		
		ArrayList<ComicDTO> comics = crearLista();
		ArrayList<ComicDTO> comicsValidarActivos = comicsActivos();
		ArrayList<ComicDTO> comicsInactivos = new ArrayList<ComicDTO>();
		ArrayList<String> nombreComicsInactivos = new ArrayList<String>();
		int contarInactivos = 0;
		for (int i = 0; i <= comics.size() - 1; i++) {
			if(comics.get(i).getEstadoEnum() == EstadoEnum.INACTIVO) {
				comicsInactivos.add(comics.get(i));
				nombreComicsInactivos.add(comics.get(i).getNombre());
				contarInactivos = contarInactivos + 1;
			}
        }
		
		if (contarInactivos > 0) {
			int sizetotal = comics.size();
			int sizeActivos = comicsValidarActivos.size();
			int sizeInactivos = comicsInactivos.size();
			throw new Exception("Se ha detectado que de " + sizetotal + " comics se encontraron que " + sizeActivos + " se encuentran activos y " + sizeInactivos + " inactivos. Los comics inactivos son: " + nombreComicsInactivos);
			
		}else {
			return true;
		}
		
	}
	
	
	/**
	 * 
	 * Metodo encargado de mostrar el inicio de las pruebas unitarias
	 * <b>Caso de Uso</b>Semillero 2021
	 * @author Sebastian Perez Lopez
	 *
	 */
	@BeforeTest
	public void inicializar() {
		BasicConfigurator.configure(); // Inicializa el logger con una configuracion basica
		log.info(":::::::::::::::::::::::::::: INICIAN PRUEBAS UNITARIAS :::::::::::::::::::::::::::: ");
	}
	
	
	/**
	 * 
	 * Metodo encargado de la prueba unitaria de los comics activos
	 * <b>Caso de Uso</b>Semillero 2021
	 * @author Sebastian Perez Lopez
	 *
	 */
	@Test
	public void validarComicsActivos() {
		log.info(":::::::::::::::::::::::::::: PRUEBA UNITARIA VALIDAR ACTIVOS :::::::::::::::::::::::::::: ");
		ArrayList<ComicDTO> comicsValidarActivos = comicsActivos();
		for (int i = 0; i <= comicsValidarActivos.size() - 1; i++) {
			if(comicsValidarActivos.get(i).getEstadoEnum() == EstadoEnum.ACTIVO) {
				System.out.println(comicsValidarActivos.get(i).toString());
			}
		}
		
		log.info("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: ");
		
	}
	
	
	/**
	 * 
	 * Metodo encargado de la prueba unitaria de los comics inactivos
	 * <b>Caso de Uso</b>Semillero 2021
	 * @author Sebastian Perez Lopez
	 *
	 */
	@Test
	public void validarComicsInactivos() {
		log.info(":::::::::::::::::::::::::::: PRUEBA UNITARIA VALIDAR INACTIVOS :::::::::::::::::::::::::::: ");
		try {
				comicsInactivos();
		
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		log.info("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: ");
		
	}
	
	
	/**
	 * 
	 * Metodo encargado de mostrar la finalizacion de las pruebas unitarias
	 * <b>Caso de Uso</b>Semillero 2021
	 * @author Sebastian Perez Lopez
	 *
	 */
	@AfterTest
	public void finalizaPruebasUnitarias() {
		log.info(":::::::::::::::::::::::::::: FINALIZAN PRUEBAS UNITARIAS :::::::::::::::::::::::::::: ");
	}

}
