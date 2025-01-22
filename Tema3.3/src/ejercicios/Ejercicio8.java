package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Creamos un HashMap que tendra una clave cadena con un par valor entero que
		// actuaran como un usuario y su contraseña
		HashMap<String, Integer> listaContraseñas = new HashMap<>();
		// Creamos una variable entera contraseña que recibira la contraseña que se
		// escriba en consola por el usuario
		int contraseña;
		// Variable entera que comprobara los intentos que le quedan disponibles al
		// usuario para introducir los datos correctamente
		int intentos = 3;
		// Variable tipo cadena que recibira el usuario escrito por consola
		String usuario;
		// Variable tipo entera que recibira por consola la accion que quiere realiar el
		// usuario
		int eleccion;
		// Variable booleana que servira para detectar si el usuario quiere salir del
		// programa o se ha quedado sin intentos
		boolean salir = false;
		/* Contraseñas y usuarios */
		listaContraseñas.put("Samuel.Jimenez", 100);
		listaContraseñas.put("Oscar.Dominguez", 110);
		listaContraseñas.put("Dolores.Aguirre", 120);
		// Creacion objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Mientras salir sea falso se le seguira preguntando al usuario
		while (salir == false) {

			/* Print instrucciones usuario */
			System.out.println("Introduzca uno de los siguientes numeros para realizar una accion");
			System.out.println("1 Registra Usuario");
			System.out.println("2 Login");
			System.out.println("0 Salir del programa");
			// Eleccion sera igual al input del usuario
			eleccion = lectura.nextInt();
			// Limpiamos el buffer
			lectura.nextLine();
			// Si el usuario elige 0 o se queda sin intentos
			if (eleccion == 0 || intentos == 0) {
				// Salir= true y el usuario saldra del programa
				salir = true;
			}
			// Si el usuario elige 1 y tiene mas de 0 intentos disponibles
			if (eleccion == 1 && intentos > 0) {
				System.out.println("Introduzca un usuario");
				// usuario es igual al input del usuario
				usuario = lectura.nextLine();

				System.out.println("Introduzca la contraseña");
				// Contraseña es igual al input del usuario
				contraseña = lectura.nextInt();
				// Limpiamos buffer
				lectura.nextLine();
				// Introducimos el usuario y la contraseñas dentro de la coleccion
				listaContraseñas.put(usuario, contraseña);
				System.out.println("La contraseña y el usuario se ha guardado Correctamente");
			}
			// Si el usuario elige la opcion 2
			else if (eleccion == 2 && intentos > 0) {
				System.out.println("Introduzca un usuario");
				// Usuario es igual al input del usuario
				usuario = lectura.nextLine();

				System.out.println("Introduzca una contraseña");
				// Contraseña es igual al input del usuario
				contraseña = lectura.nextInt();
				// Limpiamos el buffer
				lectura.nextLine();
				// Si la contraseña es erronea y el usuario sigue teniendo intentos
				if (contraseña == listaContraseñas.get(usuario) && contraseña == listaContraseñas.get(usuario)
						&& intentos > 0) {

					System.out.println("Has accedido a la zona restringida");
					// Si la condicion anterior no se cumple el usuario pierde un intento
				} else {
					intentos--;
					System.out.println("Acceso restringido te quedan: " + intentos);
				}
			}
		}

		System.out.println("Has salido del programa");
		// Cierre Scanner
		lectura.close();
	}

}
