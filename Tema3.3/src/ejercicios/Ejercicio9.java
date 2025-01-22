package ejercicios;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Variable que regulara las iteraciones del bucle while, cuando salir sea true
		// el programa terminara
		boolean salir = false;
		// Variable que almacenara los numeros que ira introduciendo el usuario
		int numero;
		// Creacion Objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Creamos una coleccion tipo TreeSet que almacenara los numeros del usuario
		LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
		// Creamos un TreeSet que almacenara las estrellas del usuario
		LinkedHashSet<Integer> estrellas = new LinkedHashSet<Integer>();
		while (salir == false) {
			// Print usuario
			System.out.println("Introduce los 5 primeros numeros del EuroMillon");
			// Numero equivale al input del usuario
			numero = lectura.nextInt();
			// Si el numero esta contenido en la coleccion
			if (numeros.contains(numero) == true) {
				System.out.println("El numero ya existia en el euromillon asi que aumentaremos su valor en 1");
				// Se aumentara en 1 el valor del numero
				numero++;
				// Se añadira este numero a la coleccion
				numeros.add(numero);
			} else {
				// Se añade el numero a la coleccion
				numeros.add(numero);
			}

			// Print Usuario
			System.out.println("Introduce las dos estrellas del EuroMillon");
			// Numero equivale al input del usuario
			numero = lectura.nextInt();
			// Si las estrellas introducidas ya se encontraban en la coleccion
			if (estrellas.contains(numero) == true) {
				System.out.println("Las estrellas ya existia en el euromillon asi que aumentaremos su valor en 1");
				// Se aumenta en 1 el numero de las estrellas
				numero++;
				// Se añaden las estrellas a la coleccion
				estrellas.add(numero);
			} else {
				// Se añade el numero a la coleccion
				estrellas.add(numero);
			}
			// Print numeros
			System.out.println(numeros);
			// Print estrellas
			System.out.println(estrellas);
			System.out.println("Quieres salir del programa?");
			// numero equivale a el input del usuario
			numero = lectura.nextInt();
			// Si el numero introducido es igual a 0
			if (numero == 0) {
				// Salir sera cierto y terminara el programa
				salir = true;
			} else {

			}
		}
		// Print que indica que el programa ha terminado
		System.out.println("El programa ha terminado");
		// Cierre Scanner
		lectura.close();
	}
}
