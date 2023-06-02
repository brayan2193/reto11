package reto11;
import java.util.Iterator;
import java.util.Scanner;
/**
 * 
 * @author GrupoBahamas
 *
 */
public class Reto11Main {	
	public static void main(String[] args) {
		menu();
	}
	
	/**
	 * Metodo que enseña el menu con todas las opciones
	 */
	public static void menu() {
		int r;
		Scanner scan=new Scanner(System.in);

		do{
			System.out.println("Que desea hacer?");
			System.out.println("1. Encontrar playa ideal");
			System.out.println("2. Encontrar hotel ideal");
			System.out.println("3. Encontrar restaurante ideal");
			System.out.println("4. Salir");
			r=scan.nextInt();
		}while(r!=1 && r!=2 && r!=3 && r!=4);

		if(r==1) {
			testPlaya();
		}else if(r==2) { 
			testHotel();
		}else if(r==3) { 
			testRestaurante();
		}else {
			System.out.println("programa finalizado");
		}

	}
	/**
	 * El metodo crea un array de objetos de tipo Restaurantes y
	 * obtiene las caracteristicas deseadas.
	 */
	public static void testRestaurante(){
		Restaurantes restaurantes[]=new Restaurantes[6];
		Restaurantes seleccionados[];
		String caracDeseadas[];


		rellenarRestaurantes(restaurantes);
		caracDeseadas=preguntasRestaurantes();
		seleccionados=compararPreferencias(restaurantes,caracDeseadas);
		mostrarResultadosR(seleccionados);
	}
	/**
	 * El metodo crea un array de objetos de tipo Hoteles y
	 * obtiene las caracteristicas deseadas.
	 */
	public static void testHotel(){
		Hoteles hoteles[]=new Hoteles[7];
		Hoteles seleccionados[];
		String caracDeseadas[];


		rellenarHoteles(hoteles);
		caracDeseadas=preguntasHoteles();
		seleccionados=compararPreferencias(hoteles,caracDeseadas);
		mostrarResultadosH(seleccionados);
	}
	/**
	 * El metodo crea un array de objetos de tipo Playas y
	 * obtiene las caracteristicas deseadas.
	 */
	public static void testPlaya(){
		Playas playas[]=new Playas[7];

		Playas seleccionados[];
		String caracDeseadas[];


		rellenarPlayas(playas);
		caracDeseadas=preguntasPlayas();
		seleccionados=compararPreferencias(playas,caracDeseadas);
		mostrarResultadosP(seleccionados);
	}
	/**
	 *  Este método muestra los resultados de los restaurantes seleccionados, 
	 *  imprimiendo sus nombres, características, ubicación y precio.
	 */
	public static void mostrarResultadosR(Restaurantes[] seleccionados) {
		boolean r = true;

		System.out.println();
		System.out.println("Los hoteles seleccionados son: ");
		System.out.println();
		System.out.println("///////////////////////////////////////");
		System.out.println();

		for (int i = 0; i < seleccionados.length && r; i++) {
			try {
				if(!(seleccionados[i].getNombre()==null)) {
					System.out.println("Nombre: " + seleccionados[i].getNombre());
					System.out.println();
					System.out.println("Caracteristicas del hotel:");
					for (int j = 0; j < seleccionados[i].getCaracteristicas().length; j++) {
						System.out.println("  " + j + "." + seleccionados[i].getCaracteristicas()[j]);
					}
					System.out.println();
					System.out.println("Precio:    " + seleccionados[i].getPrecio());
					System.out.println();
					System.out.println("///////////////////////////////////////////");
					System.out.println();
				}
			} catch (NullPointerException e) {
				r = false;
			}
		}

		menu();
	}
	/**
	 *  Este método muestra los resultados de los hoteles seleccionados, 
	 *  imprimiendo sus nombres, características y precio.
	 * @param seleccionados
	 */
	public static void mostrarResultadosH(Hoteles[] seleccionados) {
		boolean r = true;

		System.out.println();
		System.out.println("Los hoteles seleccionados son: ");
		System.out.println();
		System.out.println("///////////////////////////////////////");
		System.out.println();

		for (int i = 0; i < seleccionados.length && r; i++) {
			try {
				if(!(seleccionados[i].getNombre()==null)) {
					System.out.println("Nombre: " + seleccionados[i].getNombre());
					System.out.println();
					System.out.println("Caracteristicas del restaurante:");
					for (int j = 0; j < seleccionados[i].getCaracteristicas().length; j++) {
						System.out.println("  " + j + "." + seleccionados[i].getCaracteristicas()[j]);
					}
					System.out.println("Precio por noche: " + seleccionados[i].getPrecio());
					System.out.println();
					System.out.println("///////////////////////////////////////////");
					System.out.println();
				}
			} catch (NullPointerException e) {
				r = false;
			}
		}

		menu();
	}
	/**
	 *  Este método muestra los resultados de las playas seleccionadas, 
	 *  imprimiendo sus nombres y características.
	 * @param seleccionados
	 */
	public static void mostrarResultadosP(Playas[] seleccionados) {
		boolean r = true;

		System.out.println();
		System.out.println("Las playas seleccionadas son: ");
		System.out.println();
		System.out.println("///////////////////////////////////////");
		System.out.println();

		for (int i = 0; i < seleccionados.length && r; i++) {
			try {
				if(!(seleccionados[i].getNombre()==null)) {
					System.out.println("Nombre: " + seleccionados[i].getNombre());
					System.out.println();
					System.out.println("Caracteristicas de la playa:");
					for (int j = 0; j < seleccionados[i].getCaracteristicas().length; j++) {
						System.out.println("  " + j + "." + seleccionados[i].getCaracteristicas()[j]);
					}

					System.out.println();
					System.out.println("///////////////////////////////////////////");
					System.out.println();
				}
			} catch (NullPointerException e) {
				r = false;
			}
		}

		menu();
	}
	/**
	 * Este método compara las características deseadas con las características
	 * de cada restaurante y devuelve un array de restaurantes seleccionados 
	 * que cumplen con al menos dos de las características deseadas.
	 * @param restaurantes
	 * @param caracDeseadas
	 * @return
	 */
	public static Restaurantes[] compararPreferencias(Restaurantes[] restaurantes, String[] caracDeseadas) {
		Restaurantes[] seleccionados = new Restaurantes[restaurantes.length];
		int posicion=0;

		for (int i = 0; i < restaurantes.length; i++) {
			int puntaje = 0;
			for (int j = 0; j < caracDeseadas.length; j++) {
				if (caracDeseadas[j] != null) {
					for (int j2 = 0; j2 < restaurantes[i].getCaracteristicas().length; j2++) {
						if (caracDeseadas[j].equalsIgnoreCase(restaurantes[i].getCaracteristicas()[j2])) {
							puntaje++;
						}
					}
				}
			}
			if (puntaje >= 2) {
				seleccionados[posicion] = restaurantes[i];
				posicion++;
			}
		}

		return seleccionados;
	}
	/**
	 *  Este método compara las características deseadas con las características
	 *  de cada hotel y devuelve un array de hoteles seleccionados 
	 *  que cumplen con al menos dos de las características deseadas.
	 * @param hoteles
	 * @param caracDeseadas
	 * @return
	 */
	public static Hoteles[] compararPreferencias(Hoteles[] hoteles, String[] caracDeseadas) {
		Hoteles[] seleccionados = new Hoteles[hoteles.length];
		int posicion=0;

		for (int i = 0; i < hoteles.length; i++) {
			int puntaje = 0;
			for (int j = 0; j < caracDeseadas.length; j++) {
				if (caracDeseadas[j] != null) {
					for (int j2 = 0; j2 < hoteles[i].getCaracteristicas().length; j2++) {
						if (caracDeseadas[j].equalsIgnoreCase(hoteles[i].getCaracteristicas()[j2])) {
							puntaje++;
						}
					}
				}
			}
			if (puntaje >= 2) {
				seleccionados[posicion] = hoteles[i];
				posicion++;
			}
		}

		return seleccionados;
	}
	/**
	 * Este método compara las características deseadas con las características
	 * de cada playa y devuelve un array de playas seleccionadas 
	 * que cumplen con al menos dos de las características deseadas.
	 * @param playas
	 * @param caracDeseadas
	 * @return
	 */
	public static Playas[] compararPreferencias(Playas[] playas, String[] caracDeseadas) {
		Playas[] seleccionados = new Playas[playas.length];
		int posicion=0;

		for (int i = 0; i < playas.length; i++) {
			int puntaje = 0;
			for (int j = 0; j < caracDeseadas.length; j++) {
				if (caracDeseadas[j] != null) {
					for (int j2 = 0; j2 < playas[i].getCaracteristicas().length; j2++) {
						if (caracDeseadas[j].equalsIgnoreCase(playas[i].getCaracteristicas()[j2])) {
							puntaje++;
						}
					}
				}
			}
			if (puntaje >= 2) {
				seleccionados[posicion] = playas[i];
				posicion++;
			}
		}

		return seleccionados;
	}

	/**
	 * El método crea un array de preguntas predefinidas sobre restaurantes y solicita al usuario que responda a cada pregunta (si o no). 
	 * Basándose en las respuestas afirmativas, se crea y devuelve un array de
	 * características deseadas correspondientes a las respuestas positivas del usuario.
	 * @return
	 */
	public static String[] preguntasRestaurantes(){
		String preguntas[]= {"Alta cocina", "Asiatico", "Menu del dia", "Bajo coste", "Italiano", "Pizzeria", "Indio", 
				"Para llevar", "Marisqueria", "Familiar", "Parrilla", "Romantico"};
		String caracDeseadas[]=new String[preguntas.length];
		String r;
		Scanner scan=new Scanner(System.in);

		System.out.println("Preguntas sobre el restaurante");
		System.out.println("!!Responda con un si o no!!");
		for (int i = 0; i < preguntas.length; i++) {
			do {
				System.out.print(preguntas[i]+":");
				r=scan.nextLine();
			}while(!(r.equalsIgnoreCase("si"))&&!(r.equalsIgnoreCase("no")));
			if(r.equalsIgnoreCase("si")) {
				caracDeseadas[i]=preguntas[i];
			}
		}	

		return caracDeseadas;
	}
	/**
	 * El método crea un array de preguntas predefinidas sobre hoteles y solicita al usuario que responda a cada pregunta (si o no). 
	 * Basándose en las respuestas afirmativas, se crea y devuelve un array de
	 * características deseadas correspondientes a las respuestas positivas del usuario.
	 * @return
	 */
	public static String[] preguntasHoteles(){
		String preguntas[]={"Amplias habitaciones y suites","Alto coste","Cerca de la playa",
				"De 4 a 5 estrellas","Con parking","Con piscina","Actividades extra","De 1 a 3 estrellas","Bajo coste","Gimnasio",
				"Desayuno incluido", "Servicio de habitaciones","Club infantil","Spa","Wi-Fi gratuito",
				"Recepción abierta las 24 horas","Sala de reuniones","Buffet","Vistas al mar","Transporte gratuito al aeropuerto",
				"Cerca de atraccniones turísticas","Habitaciones modernas","Alquiler de bicis","Cerca del centro","Estacionamiento gratuito",
				"Personal amable","Servicio de conserjeria","Personal multilingüe","Sala de juegos","Servicio de masajes"};
		String caracDeseadas[]=new String[preguntas.length];
		String r;
		Scanner scan=new Scanner(System.in);

		System.out.println("Preguntas sobre el hotel");
		System.out.println("!!Responda con un si o no!!");
		for (int i = 0; i < preguntas.length; i++) {
			do {
				System.out.print(preguntas[i]+":");
				r=scan.nextLine();
			}while(!(r.equalsIgnoreCase("si"))&&!(r.equalsIgnoreCase("no")));
			if(r.equalsIgnoreCase("si")) {
				caracDeseadas[i]=preguntas[i];
			}
		}	

		return caracDeseadas;
	}
	/**
	 * El método crea un array de preguntas predefinidas sobre playas y solicita al usuario que responda a cada pregunta (si o no). 
	 * Basándose en las respuestas afirmativas, se crea y devuelve un array de
	 * características deseadas correspondientes a las respuestas positivas del usuario.
	 * @return
	 */
	public static String[] preguntasPlayas(){
		String preguntas[]={"Playa nudista","Actividades acuaticas"
				,"Actividades acuaticas","Playa adaptada para discapacitados",
				"Alquiler de tablas de surf","Alejada del centro",
				"Socorristas","Comercio cercano"};
		String caracDeseadas[]=new String[preguntas.length];
		String r;
		Scanner scan=new Scanner(System.in);

		System.out.println("Preguntas sobre la playa!");
		System.out.println("!!Responda con un si o no!!");
		for (int i = 0; i < preguntas.length; i++) {
			do {
				System.out.print(preguntas[i]+":");
				r=scan.nextLine();
			}while(!(r.equalsIgnoreCase("si"))&&!(r.equalsIgnoreCase("no")));
			if(r.equalsIgnoreCase("si")) {
				caracDeseadas[i]=preguntas[i];
			}
		}	

		return caracDeseadas;
	}
	/**
	 * Metodo que rellena los arrays de los hoteles con diferentes caracteristicas de estos.
	 * @param array
	 */
	public static void rellenarHoteles(Hoteles []array) {
		String h0[]= {"Amplias habitaciones y suites","Alto coste","Cerca de la playa","Con piscina","Con parking"};
		String h1[]= {"De 1 a 3 estrellas","Actividades extra","Gimnasio","Bajo coste","Desayuno incluido"};
		String h2[]= {"Servicio de habitaciones","Club infantil","Spa","Wi-Fi gratuito","Recepción abierta las 24 horas" };
		String h3[]= {"De 4 a 5 estrellas","Sala de reuniones","Buffet","Vistas al mar","Transporte gratuito al aeropuerto","Estacionamiento gratuito"};
		String h4[]= {"Cerca de atracciones turísticas","Habitaciones modernas","Alquiler de bicis","Cerca del centro"};
		String h5[]= {"Personal amable","Servicio de conserjeria","De 1 a 3 estrellas","Desayuno incluido","Con piscina"};
		String h6[]= {"Personal multilingüe","Sala de juegos","Gimnasio","De 4 a 5 estrellas","Servicio de masajes"};

		//Estrellas,precio,ubicacion,nombre, piscina, parking, actividades
		array[0]=new Hoteles("Hotel Sandyport Beach Resort","Playa Bahamas",h0,520F);
		array[1]=new Hoteles("Hotel Grand Hyatt Baha Mar","Avenida Bahamas",h1,50F); 
		array[2]=new Hoteles("Hotel Breezes Resort","Calle muerta",h2,50F);
		array[3]=new Hoteles("Hotel Saint Francis Resort & Marina","Playa nasau",h3,400F);
		array[4]=new Hoteles("Hotel Cape Santa Maria Beach Resort & Villas","Calle juanito",h4,80F);
		array[5]=new Hoteles("Hotel Towne","Cayo big major",h5,60F);
		array[6]=new Hoteles("Hotel Peace and Plenty","Calle muerta",h6,225F);

	}
	/**
	 * Metodo que rellena los arrays de los restaurantes con diferentes caracteristicas de estos.
	 * @param array
	 */
	public static void rellenarRestaurantes(Restaurantes []array) {
		String h0[]= {"Alta cocina", "Asiatico"};
		String h1[]= {"Menu del dia", "Bajo coste"};
		String h2[]= {"Italiano", "Pizzeria"};
		String h3[]= {"Indio", "Para llevar"};
		String h4[]= {"Marisqueria", "Familiar"};
		String h5[]= {"Parrilla", "Romantico"};


		array[0]=new Restaurantes("Restaurante Mogano by Giorgio Locatelli","Bay Street",h0,70F);
		array[1]=new Restaurantes("Restaurante Social House Sushi & Grill","West Hill Street",h1,40F); 
		array[2]=new Restaurantes("Restaurante Shima","Queen's Highway",h2,50F);
		array[3]=new Restaurantes("Restaurante Island Brothers & CIE Nassau","East Bay Street",h3,90F);
		array[4]=new Restaurantes("Restaurante 23° North","Charlotte Street",h4,30F);
		array[5]=new Restaurantes("Restaurante Palapa","Charlotte Street",h5,50);

	}
	/**
	 * Metodo que rellena los arrays de las playas con diferentes caracteristicas de estas.
	 * @param array
	 */
	public static void rellenarPlayas(Playas []array) {
		String h0[]= {"Playa nudista","Alquiler de tumbonas","Comercio cercano"};
		String h1[]= {"Playa arena","Alquiler de tumbonas","Alquiler de tablas de surf","Socorristas","Comercio cercano"};
		String h2[]= {"Actividades acuaticas","Playa adaptada para discapacitados","Socorristas"};
		String h3[]= {"Playa arena","Alejada del centro","Comercio cercano"};
		String h4[]= {"Alquiler de tablas de surf","Alejada del centro","Comercio cercano"};
		String h5[]= {"Playa arena","Alquiler de tumbonas","Playa adaptada para discapacitados","Socorristas"};
		String h6[]= {"Playa nudista","Alejada del centro","Alquiler de tumbonas"};

		//Nombre,Bandera(R,n,m),clima(),arena,banos,actividadesAcuaticas,cerdos,nudista
		array[0]=new Playas("Playa de la Isla Gran Turca",h0);
		array[1]=new Playas("Playa de la Isla de Balmoral",h1);
		array[2]=new Playas("Playa de la Isla de la Laguna Azul",h2);
		array[3]=new Playas("Playa de Isla Paradise",h3);
		array[4]=new Playas("Playa de Gran Bahama",h4);
		array[5]=new Playas("Playa Atlantis",h5);
		array[6]=new Playas("Playa Cable",h6);
	}
}