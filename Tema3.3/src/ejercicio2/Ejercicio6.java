package ejercicio2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Variable que almacenara las personas que introduzca el usuario
		String persona = "";
		// Variable que almacenara el telefono que introduzca el usuario por consola
		int telefono = 0;
		// Variable que determinara la eleccion del menu del usuario
		int eleccion = -1;
		// Conjunto de enteros que almacenara los numeros de telefonos de las personas
		HashSet<Integer> listaTelefonos = new HashSet<Integer>();
		// Mapa que almacenara un par clave-valor de personas y sus numeros de telefonos
		HashMap<String, HashSet<Integer>> listaPersonasTlf = new HashMap<>();
		// Variable booleana que determinara si la persona existe
		boolean existe = false;
		// Creacion Scanner
		Scanner lectura = new Scanner(System.in);
		// Bucle que iterara hasta que el usuario introduzca el numero cero
		while (eleccion != 0) {
			/* Despliegue menu */
			System.out.println("1 Añadir una persona");
			System.out.println("2 Añadir telefono de una persona añadida");
			System.out.println("3 Mostrar los telefonos de una persona");
			System.out.println("4 Eliminar telefono de una persona");
			System.out.println("5 Eliminar a una persona");
			System.out.println("0 Salir del programa");
			// Eleccion es igual al input del usuariio
			eleccion = lectura.nextInt();
			// Limpiamos el buffer
			lectura.nextLine();

			if (eleccion == 1) {

				System.out.println("Introduce a la persona que quieres añadir");
				// Persona es igual al input del usuario
				persona = lectura.nextLine();
				// Se añade al mapa la persona y el conjunto de enteros
				listaPersonasTlf.put(persona, new HashSet<Integer>());

			}

			else if (eleccion == 2) {
				System.out.println("Introduce el nombre de la persona");
				// Persona es igual al input del usuario
				persona = lectura.nextLine();
				System.out.println("Introduce un telefono para una persona ya añadida");
				// Telefono es igual al input del usuario
				telefono = lectura.nextInt();
				// Limpiamos el buffer
				lectura.nextLine();
				// Se añaden a listaTelefonos todos los telefonos de la persona
				listaTelefonos = listaPersonasTlf.get(persona);
				// Se añade el telefono del usuario a el conjunto
				listaTelefonos.add(telefono);
				// se iguala existe a la booleana del metodo contains
				existe = listaPersonasTlf.containsKey(persona);
				if (existe == true) {
					// Si existe la persona se añade el numero a esa persona
					listaPersonasTlf.put(persona, listaTelefonos);
					System.out.println("El numero se ha añadido correctamente");
				} else {
					System.out.println("El nombre introducido no existe");
				}
			} else if (eleccion == 3) {
				System.out.println("Introduce el nombre de la persona la cual quieres saber su numero");
				// Persona es igual al input del usuario
				persona = lectura.nextLine();
				// Se muestran los telefonos de las personas
				System.out.println(listaPersonasTlf.get(persona));
			} else if (eleccion == 4) {

				System.out.println("Introduce a la persona la cual quieres eliminar sus telefonos");
				// Persona es igual al input del usuario
				persona = lectura.nextLine();
				// Se eliminan los telefonos de la persona
				listaTelefonos.remove(telefono);
			} else if (eleccion == 5) {
				System.out.println("Introduce a la persona que quieres eliminar");
				// Se elimina a la persona del diccionario
				persona = lectura.nextLine();
				// eliminamos a la persona del diccionario
				listaPersonasTlf.remove(persona);
			}
		}
		// Cierre Scanner
		lectura.close();
	}

}
