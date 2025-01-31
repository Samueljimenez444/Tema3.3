package ejercicio2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos un diccionario HashMap con par clave-valor entero y un conjunto
		// HashSet que almacenara palabras y su longitud
		HashMap<Integer, HashSet<String>> longitudPalabras = new HashMap<>();
		// Creacion Scanner
		Scanner lectura = new Scanner(System.in);
		// Variable string que almacenara las palabras que ira introduciendo el usuario
		// la inicializamos a cadena vacia
		String palabra = "";
		// Variable entera que controlara las elecciones del usuario en el menu
		int eleccion;
		// Variable entera que almacenara la longitud de la palabras
		int longitud;

		do {
			/* Print del menu */
			System.out.println("1 Introducir Palabra");
			System.out.println("2 Mostrar Palabras");
			System.out.println("3 Salir del programa");
			// Recibimos la eleccion del usuario por consola
			eleccion = lectura.nextInt();
			// Limpiamos el buffer
			lectura.nextLine();
			// Si el usuario elige 1
			if (eleccion == 1) {
				// Le pedimos que introduzca una palabra
				System.out.println("Introduzca una palabra");
				// Captamos la palabra por el scanner
				palabra = lectura.nextLine();
				// guardamos la longitud de la palabra
				longitud = palabra.length();

				longitudPalabras.putIfAbsent(longitud, new HashSet<>()); // Si no existe, lo crea
				longitudPalabras.get(longitud).add(palabra); // Agrega la palabra al conjunto
			} else if (eleccion == 2) {
				System.out.println(longitudPalabras);
			}
		} while (eleccion != 3);

		// Cierre Scanner
		lectura.close();
	}

}
