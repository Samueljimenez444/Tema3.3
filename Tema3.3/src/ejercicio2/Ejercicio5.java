package ejercicio2;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// HashMap que almacenara pares clave valor correspondientes a nombres de series
		// y valoracion del usuario de las mismas
		HashMap<String, String> listaSeries = new HashMap<String, String>();
		// Creacion objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Variable que almacenara la serie que introduzca el usuario
		String serie;
		// Variable que almacenara la valoracion del usuario
		String valoracion;
		// Variable que almacenara la eleccion del usuario
		int eleccion;
		/*
		 * Varible que controlaran el bucle que permitira que el programa se siga
		 * ejecutando y variable que controlara si se ha encontrado o no la serie en el
		 * diccionario
		 */
		boolean encontrado = false;
		boolean salir = false;

		// Mientras salir sea igual a false
		while (salir == false) {
			/* Print menu del usuario */
			System.out.println("Introduzca una de las siguientes elecciones");
			System.out.println("1 Agregar Serie");
			System.out.println("2 Buscar Serie");
			System.out.println("3 Eliminar Serie");
			System.out.println("4 Salir del Programa");
			// Eleccion del usuario es igual al input del mismo
			eleccion = lectura.nextInt();
			// Limpiamos el buffer
			lectura.nextLine();
			// Si el usuario elige uno
			if (eleccion == 1) {
				/*
				 * Se le pide al usuario una serie y su valoracion almacenandose estas en un
				 * diccionario, la serie y la valoracion seran introducidas por el usuario a
				 * traves de la consola
				 */
				System.out.println("Introduzca una serie");
				serie = lectura.nextLine();
				System.out.println("Introduce tu valoracion de la serie");
				valoracion = lectura.nextLine();
				// Se introducen los valores en el diccionario
				listaSeries.put(serie, valoracion);
				// Si el usuario elige 2
			} else if (eleccion == 2) {
				/* Se le pide al usuario que introduzca el nombre de una serie */
				System.out.println("Introduzca la serie que quieres buscar");
				serie = lectura.nextLine();
				// Se iguala el booleano correspondiente al metodo contains de la clase mapas a
				// la variable encontrado
				encontrado = listaSeries.containsKey(serie);
				// Si encontrado es true
				if (encontrado == true) {
					// Se le comenta al usuario que la serie ha sido encontrada en el sistema
					System.out.println("La serie se ha encontrado en el sistema");
					// Si no se le comenta que la serie no ha sido encontrada en el sistema
				} else {
					System.out.println("La serie no se ha encontrado en el sistema");
				}
				// Si el usuario elige 3
			} else if (eleccion == 3) {
				// Se le pide una serie al usuario
				System.out.println("Introduzca la serie que quieres eliminar");
				// El valor de serie depende del input del usuario
				serie = lectura.nextLine();
				// Se elimina la serie del diccionario
				listaSeries.remove(serie);
				// Si el usuario elige 4
			} else if (eleccion == 4) {
				// Salir sera verdadero y el programa terminara
				salir = true;
				// Si el usuario no elige una opcion valida se le mostrara por pantalla
			} else {
				System.out.println("Elige una opcion valida");
			}
		}
		// Print fin del programa
		System.out.println("Fin del Programa");
		// Cierre Scanner
		lectura.close();
	}

}
