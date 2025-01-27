package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Creacion de array list que almacenara los nombres que almacenara el usuario
		ArrayList<String> listaNombres = new ArrayList<>();
		//Varible que almacenara el nombre que introduzca el usuario y sera el parametro que sera introducido en la lista
		String nombre;
		//Creacion Objeto scanner
		Scanner lectura = new Scanner(System.in);
		//Variable entera con la que el usuario eligira que accion realizar
		int eleccion;
		/*Variables booleanas que controlaran si el usuario sale del bucle y por consecuencia del programa o si el nombre que este ha introducido existe y se encuentra en la lista*/
		boolean salir = false;
		boolean encontrado = false;
		//Bucle que iterara mientras salir sea false
		while (salir == false) {
			/*Print menu del usuario*/
			System.out.println("1 Añadir nuevo nombre a la lista");
			System.out.println("2 Elimina un nombre especifico");
			System.out.println("3 Ordena la lista alfabeticamente");
			System.out.println("4 Busca si un nombre en especifico esta en la lista");
			System.out.println("5 Salir del programa");
			System.out.println("Introduzca su eleccion");
			//Eleccion es igual al input del usuario
			eleccion = lectura.nextInt();
			//Limpiamos el buffer
			lectura.nextLine();
			//Si el usuario elige 5
			if (eleccion == 5) {
				//Salir es igual a true y se abandona el programa
				salir = true;
				//Si el usuario elige 1
			} else if (eleccion == 1) {
				//Instrucciones para el usuario
				System.out.println("Introduzca el nombre");
				//Nombre es igual al proximo input del usuario
				nombre = lectura.nextLine();
				//Se añade el nombre del usuario a la lista
				listaNombres.add(nombre);
				//Si el usuario elige 2
			} else if (eleccion == 2) {
				System.out.println("Introduzca el nombre que quieres eliminar");
				//Nombre equivale al input del usuario
				nombre = lectura.nextLine();
				//Se elimina el nombre elegido de la lista
				listaNombres.remove(nombre);
				//Si el usuario elige 3
			} else if (eleccion == 3) {
				//Se ordena la lista por orden alfabetico
				listaNombres.sort(null);
				//Se muestra la lista ordenada
				System.out.println(listaNombres);
				//Si el usuario elige 4
			} else if (eleccion == 4) {
				System.out.println("Introduzca el nombre que quieres buscar en la lista !Cuidado el Programa es Sensible a mayusculas!");
				//El nombre equivale al input del usuario
				nombre = lectura.nextLine();
				//Se iguala el booleano creado a traves del metodo contains de la clase arraylist donde se devolvera true o false en funcion de si se encuentra el nombre en la lista
				encontrado = listaNombres.contains(nombre);
				//Si el nombre se encuebntra
				if (encontrado == true) {
					//Se le muestra al usuario que el nombre se encuentra
					System.out.println("El nombre se encuentra en la lista");
					//Si no se encuentra el nombre
				} else
					//Se le muestra al usuario que no se ha encontrado el nombre en la lista
					System.out.println("No se ha encontrado el nombre en la lista");
			}
			
		}
		//Print que muestra que el usuario ha salido del programa
		System.out.println("Has salido del programa");
		//Cierre Scanner
		lectura.close();
	}

}
