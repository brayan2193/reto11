package reto11;

/**
 * La clase Hoteles representa un hotel con su nombre, precio, ubicación y características.
 */
public class Hoteles {

	private float precio;
	private String nombre;
	private String ubicacion;
	private String[] caracteristicas;


	/**
	 * Constructor de la clase Hoteles que recibe solo el nombre del hotel.
	 * 
	 * @param nombre el nombre del hotel
	 */
	public  Hoteles(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Constructor sobrecargado de la clase Hoteles.
	 * 
	 * @param nombre el nombre del hotel
	 * @param ca una cadena que describe la ubicación del hotel
	 * @param caracteristicas las características del hotel como un arreglo de Strings
	 * @param pr el precio del hotel
	 */
	public  Hoteles(String nombre, String ca, String[] caracteristicas, float pr) {
		this.nombre = nombre;
		this.ubicacion = ca;
		this.caracteristicas = caracteristicas;
		this.precio = pr;
	}

	/**
	 * Obtiene el precio del hotel.
	 * 
	 * @return el precio del hotel
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * Establece el precio del hotel.
	 * 
	 * @param precio el nuevo precio del hotel
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/**
	 * Obtiene la ubicación del hotel.
	 * 
	 * @return la ubicación del hotel
	 */
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * Establece la ubicación del hotel.
	 * 
	 * @param ubicacion la nueva ubicación del hotel
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	/**
	 * Obtiene el nombre del hotel.
	 * 
	 * @return el nombre del hotel
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del hotel.
	 * 
	 * @param nombre el nuevo nombre del hotel
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene las características del hotel.
	 * 
	 * @return las características del hotel como un arreglo de Strings
	 */
	public String[] getCaracteristicas() {
		return caracteristicas;
	}

	/**
	 * Establece las características del hotel.
	 * 
	 * @param caracteristicas las nuevas características del hotel como un arreglo de Strings
	 */
	public void setCaracteristicas(String[] caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
}