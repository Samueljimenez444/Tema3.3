package ejercicios;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos un TreeSet de tipo cadena que guardara los distintos nombres y los
		// ordenara en orden alfabetico
		// que introduzcamos
		TreeSet<String> listaNombre = new TreeSet<String>();
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
