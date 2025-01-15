package ejercicios;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Creamos la variable palabra y la inicializamos a cadena vacia
		String palabra = "";
		//Creamos la variable traduccion que servira como par valor en el treemap
		String traduccion;
		//Variable entera que almacenara la eleccion numerica del usuario
		int eleccion;
		//Creamos un TreeMap que almacenara pares clave/valor
		TreeMap<String, String> diccionario = new TreeMap<String, String>();
		//Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		/*Print del menu*/
		System.out.println("Introduzca uno de los siguientes numeros para realizar una accion");
		System.out.println("1 Inserta Palabra");
		System.out.println("2 Busca Palabra");
		System.out.println("0 Salir del programa");
		//Le damos valor a eleccion en base al input del usuario
		eleccion = lectura.nextInt();
		//Limpiamos el buffer
		lectura.nextLine();
		//Mientras la eleccion del usuario sea distinta de 0 
		while (eleccion != 0) {
			//Si la eleccion del usuario es igual a 1
			if (eleccion == 1) {
				//Elegimos el par clave en base al input del usuario
				System.out.println("Introduce la palabra");
				palabra = lectura.nextLine();
				System.out.println("Introduce la traduccion");
				//Elegimos el par valor en base al input del usuario
				traduccion = lectura.nextLine();
				//guardamos en el TreeMap el par valor/clave que definimos como la palabra y la traduccion
				diccionario.put(palabra, traduccion);
				//Si la eleccion es igual a dos
			} else if (eleccion == 2) {
				
				System.out.println("Introduzca la palabra que quieres buscar en el diccionario");
				//Palabra es igual al input del usuario
				palabra = lectura.nextLine();
				//Print del par valor del diccionario
				System.out.println(diccionario.get(palabra));
			}
			/*Print del menu*/
			System.out.println("Introduzca uno de los siguientes numeros para realizar una accion");
			System.out.println("1 Inserta Palabra");
			System.out.println("2 Busca Palabra");
			System.out.println("0 Salir del programa");
			eleccion = lectura.nextInt();
			lectura.nextLine();
		}
		//Cierre Scanner
		lectura.close();
		//Print fin del programa
		System.out.println("Fin del Programa");
	}

}
