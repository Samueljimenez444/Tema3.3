package ejercicio2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio7V2 {
	public static void main(String[] args) {
		// Creamos un diccionario HashMap con par clave-valor entero y un conjunto
		// HashSet que almacenara palabras y su longitud
		HashMap<Integer, HashSet<String>> longitudPalabras = new HashMap<>();
		// Creacion Scanner
		Scanner lectura = new Scanner(System.in);
		// Variable entera que controlara las elecciones del usuario en el menu
		int eleccion;
		// Variable entera que almacenara la longitud de la palabras
		int longitud;
		do {
			/* Print del menu */
			System.out.println("1. Introducir Palabra");
			System.out.println("2. Mostrar Palabras");
			System.out.println("3. Salir");
			System.out.print("Seleccione una opción: ");
			// Captamos la eleccion del usuario por consola
			eleccion = lectura.nextInt();
			// Limpiamos el buffer
			lectura.nextLine();

			if (eleccion == 1) {
				System.out.print("Introduzca una palabra: ");
				String palabra = lectura.nextLine();
				longitud = palabra.length();
				// Verificamos si existe un conjunto con la longitud de la palabra
				if (!longitudPalabras.containsKey(longitud)) {
					longitudPalabras.put(longitud, new HashSet<>()); // Crear un nuevo HashSet si no existe
				}

				// Agregar la palabra al HashSet correspondiente
				longitudPalabras.get(longitud).add(palabra);

			} else if (eleccion == 2) {
				System.out.println("\nPalabras clasificadas por longitud:");
				for (var entry : longitudPalabras.entrySet()) {
					System.out.println("Longitud " + entry.getKey() + ": " + entry.getValue());
				}
			}
		} while (eleccion != 3); // Sale solo cuando elige "Salir"

		// Cerrar Scanner
		lectura.close();
	}
}
