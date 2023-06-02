package reto11;

/**
 * La clase Playas representa una playa con su nombre y características.
 */
public class Playas {
	private String nombre;
	private String[] caracteristicas;

	/**
	 * Constructor de la clase Playas.
	 * 
	 * @param nombre el nombre de la playa
	 * @param caracteristicas las características de la playa como un arreglo de Strings
	 */
	public Playas(String nombre, String[] caracteristicas) {
		this.nombre = nombre;
		this.caracteristicas = caracteristicas;
	}

	/**
	 * Constructor sobrecargado de la clase Playas que recibe solo el nombre de la playa.
	 * 
	 * @param nombre el nombre de la playa
	 */
	public Playas(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el nombre de la playa.
	 * 
	 * @return el nombre de la playa
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Establece el nombre de la playa.
	 * 
	 * @param nombre el nuevo nombre de la playa
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene las características de la playa.
	 * 
	 * @return las características de la playa como un arreglo de Strings
	 */
	public String[] getCaracteristicas() {
		return this.caracteristicas;
	}

	/**
	 * Establece las características de la playa.
	 * 
	 * @param caracteristicas las nuevas características de la playa como un arreglo de Strings
	 */
	public void setCaracteristicas(String[] caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
}
