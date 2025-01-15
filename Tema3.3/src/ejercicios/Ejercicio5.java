package ejercicios;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos un LinkedHashSet de tipo cadena que guardara los distintos nombres
		// que introduzcamos
		LinkedHashSet<String> listaNombre = new LinkedHashSet<String>();
		// Creamos la variable booleana fin que inicializara en false
		boolean fin = false;
		// Creamos la variable tipo string nombre que recibira los distintos nombre que
		// introducira el usuario por consola
		String nombre;
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Mientras fin sea falso
		while (fin == false) {
			// Print instrucciones
			System.out.println("Introduce Nombres");
			// Nombre recibira lo que se introduzca por consola
			nombre = lectura.nextLine();
			// Si nombre recibe la palabra fin
			if (nombre.equalsIgnoreCase("Fin")) {
				// fin sera igual a true lo que provocara que el programa termine
				fin = true;
			}
			// Si nombre no es igual a fin
			else {
				// Se añade a la coleccion lo introducido por consola
				listaNombre.add(nombre);
			}

		}
		// Print fin programa
		System.out.println("Fin del Programa");
		// Print de la lista
		System.out.println(listaNombre);
		lectura.close();

	}

}
