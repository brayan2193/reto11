package reto11;

public class Restaurantes {

	/**
	 * La clase Restaurantes representa un restaurante con su nombre, precio y características.
	 */
	private String nombre;
	private float precio;
	private String[] caracteristicas;

	/**
	 * Constructor de la clase Restaurantes.
	 * 
	 * @param nombre el nombre del restaurante
	 * @param c las características del restaurante como un arreglo de Strings
	 */
	public Restaurantes(String nombre, String[] c) {
		this.nombre = nombre;
		this.caracteristicas = c;
	}

	/**
	 * Constructor sobrecargado de la clase Restaurantes.
	 * 
	 * @param nombre el nombre del restaurante
	 * @param ca una cadena que describe las características del restaurante
	 * @param c las características del restaurante como un arreglo de Strings
	 * @param p el precio del restaurante
	 */
	public Restaurantes(String nombre, String ca, String[] c, float p) {
		this.nombre = nombre;
		this.caracteristicas = c;
		this.precio = p;
	}

	/**
	 * Obtiene el nombre del restaurante.
	 * 
	 * @return el nombre del restaurante
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Establece el nombre del restaurante.
	 * 
	 * @param nombre el nuevo nombre del restaurante
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el precio del restaurante.
	 * 
	 * @return el precio del restaurante
	 */
	public float getPrecio() {
		return this.precio;
	}

	/**
	 * Establece el precio del restaurante.
	 * 
	 * @param precio el nuevo precio del restaurante
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/**
	 * Obtiene las características del restaurante.
	 * 
	 * @return las características del restaurante como un arreglo de Strings
	 */
	public String[] getCaracteristicas() {
		return this.caracteristicas;
	}

	/**
	 * Establece las características del restaurante.
	 * 
	 * @param caracteristicas las nuevas características del restaurante como un arreglo de Strings
	 */
	public void setCaracteristicas(String[] caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
}